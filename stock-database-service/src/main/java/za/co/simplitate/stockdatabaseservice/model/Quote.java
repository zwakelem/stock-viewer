package za.co.simplitate.stockdatabaseservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "quote", catalog = "stockviewer")
@Data
@NoArgsConstructor
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;

    private String quote;

    public Quote(String username, String quote) {
        this.username = username;
        this.quote = quote;
    }
}
