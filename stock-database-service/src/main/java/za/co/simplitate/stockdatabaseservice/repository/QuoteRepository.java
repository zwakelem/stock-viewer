package za.co.simplitate.stockdatabaseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.simplitate.stockdatabaseservice.model.Quote;

import java.util.List;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByUsername(String username);
}
