package com.lt.recipe.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by LT on 2018/10/26
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
