package Magnalle.SpringLessons.Recipes.repositories;

import Magnalle.SpringLessons.Recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
