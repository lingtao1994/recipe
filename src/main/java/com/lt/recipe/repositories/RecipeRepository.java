package com.lt.recipe.repositories;

import com.lt.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by LT on 2018/10/26
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
