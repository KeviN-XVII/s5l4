package kevinquarta.s5l4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter @Setter
@Entity
@DiscriminatorValue("Pizza")
public class Pizze extends DivisioneMenu {

    @ManyToMany
    @JoinTable(
            name="pizza_toppings",
            joinColumns = @JoinColumn(name="pizzas_id"),
            inverseJoinColumns = @JoinColumn(name="toppings_id")
    )
    private List<Toppings>  toppings;

    public Pizze(String name,int calorie,double prezzo,List<Toppings> toppings){
        super(name,calorie,prezzo);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return getName() +
                " (" + toppings.toString() + ")"+
                " | Calorie: " + getCalorie() +
                " | Prezzo: " + getPrezzo();
    }


}
