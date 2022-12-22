package products;

import java.util.Set;

public class ListRecipe {

    private Set<Recipe> recipes;

    public ListRecipe(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        if (recipes.contains(recipes)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        recipes.add(recipe);
    }

    public void remove(Recipe recipe) {
        if (!recipes.remove(recipe)) {
            throw new IllegalArgumentException("Такого рецепта нет");
        }
    }


}
