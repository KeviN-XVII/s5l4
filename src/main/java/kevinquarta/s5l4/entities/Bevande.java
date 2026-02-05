package kevinquarta.s5l4.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@DiscriminatorValue("Bevanda")
public class Bevande extends DivisioneMenu {

    public Bevande(String name, int calorie, double prezzo) {
        super(name, calorie, prezzo);
    }
}