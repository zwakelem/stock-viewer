package za.co.simplitate.stockdatabaseservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Quotes {

    private String username;

    private List<String> quotes;

}
