import products.ListProducts;
import products.ListRecipe;
import products.Product;
import products.Recipe;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 145, 3);
        Product orange = new Product("Апельсин", 410, 5);
        Product banana = new Product("Банан", 150, 4);
        Product cheese = new Product("Сыр", 300, 1);
        Product sausage = new Product("Колбаса", 400, 2);
        Product fish = new Product("Рыба", 370, 2);
        Product meat = new Product("Мясо", 480, 1);


        Set<Product> productSet = new HashSet<>();
        ListProducts listProducts = new ListProducts(productSet);
        listProducts.add(apple);
        listProducts.add(cheese);
        listProducts.add(banana);
        listProducts.add(sausage);
        listProducts.add(fish);
        listProducts.add(meat);



        for (Product listProduct : productSet) {
            printInfo(listProduct);
        }
        Recipe 1 = new Recipe("Мясной", listProducts(), 4500);


        Set<Recipe> recipes = new HashSet<>();
        ListRecipe listRecipe = new ListRecipe(recipes);

    }

    private static void printInfo(Product product) {
        System.out.println(product);
    }
}


