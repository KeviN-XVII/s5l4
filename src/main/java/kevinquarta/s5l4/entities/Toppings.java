package kevinquarta.s5l4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@DiscriminatorValue("Ingrediente")
public class Toppings extends DivisioneMenu {

    @ManyToMany(mappedBy = "toppings")
    private List<Pizze> pizzas;

    public Toppings(String name, int calorie, double prezzo) {
        super(name, calorie, prezzo);
    }
}
