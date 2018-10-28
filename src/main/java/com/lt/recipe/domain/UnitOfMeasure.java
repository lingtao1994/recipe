package com.lt.recipe.domain;



import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class UnitOfMeasure {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String descriptioin;


    @OneToOne
    private Ingredient ingredient;

    public String getDescriptioin() {
        return descriptioin;
    }

    public void setDescriptioin(String descriptioin) {
        this.descriptioin = descriptioin;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
