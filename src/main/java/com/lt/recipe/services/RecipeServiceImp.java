package com.lt.recipe.services;

import com.lt.recipe.domain.Recipe;
import com.lt.recipe.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by LT on 2018/10/27
 */
@Service
public class RecipeServiceImp implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImp(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes(){
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }


}
