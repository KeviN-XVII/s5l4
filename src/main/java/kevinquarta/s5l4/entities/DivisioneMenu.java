package kevinquarta.s5l4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="divisione_menu")
@DiscriminatorColumn(name="elemento_menu")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class DivisioneMenu {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name="nome",nullable = false)
    private String name;
    @Column(name="calorie",nullable = false)
    private int calorie;
    @Column(name="prezzo",nullable = false)
    private double prezzo;




    public DivisioneMenu(String name, int calorie, double prezzo) {
        this.name = name;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return name;
    }
}

