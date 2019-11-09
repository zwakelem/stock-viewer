package za.co.simplitate.stockservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.simplitate.stockservice.model.StockQuote;

import java.util.List;

@RestController
@RequestMapping("/rest/stock")
public class StockResource {

    @GetMapping("/{username}")
    public List<StockQuote> getStock(@PathVariable("username") final String username) {

    }
}
