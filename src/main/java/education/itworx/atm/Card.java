package education.itworx.atm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    private String type;

    public Card(String type) {
        this.type = type;
    }

}
