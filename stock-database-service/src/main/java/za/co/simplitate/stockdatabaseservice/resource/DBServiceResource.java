package za.co.simplitate.stockdatabaseservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.simplitate.stockdatabaseservice.model.Quote;
import za.co.simplitate.stockdatabaseservice.model.Quotes;
import za.co.simplitate.stockdatabaseservice.repository.QuoteRepository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("rest/db")
public class DBServiceResource {

    @Autowired
    private QuoteRepository quoteRepository;

    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable @NotNull String username) {
        return getQuotesByUsername(username);
    }

    @PostMapping("/add")
    public List<String> add(@RequestBody @Valid final Quotes quotes) {
        quotes.getQuotes()
                .stream()
                .map(quote -> new Quote(quotes.getUsername(), quote))
                .forEach(quote -> {
                    quoteRepository.save(quote);
                });
        return getQuotesByUsername(quotes.getUsername());
    }

    @DeleteMapping("/{username}")
    public List<String> delete(@PathVariable final String username) {
        List<Quote> quotes = quoteRepository.findByUsername(username);
        quoteRepository.deleteAll(quotes);
        return getQuotesByUsername(username);
    }

    private List<String> getQuotesByUsername(@PathVariable("username") String username) {
        return quoteRepository.findByUsername(username)
                .stream()
                .map(Quote::getQuote)
                .collect(Collectors.toList());
    }
}
