package products;

import java.util.Objects;

public class Recipe {

    private  String name;
    private  ListProducts listProducts;
    private  int totalCost;

    public Recipe(String name, ListProducts listProducts, int totalCost) {
        this.name = name;
        this.listProducts = listProducts;
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }



    public ListProducts getListProducts() {
        return listProducts;
    }



    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Рецепт " +
                " наименование: (" + name + ')' +
                "   " + listProducts +
                "  стоимость (" + totalCost +
                " руб.)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
