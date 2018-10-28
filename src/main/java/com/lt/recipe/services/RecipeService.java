package com.lt.recipe.services;

import com.lt.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by LT on 2018/10/27
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
