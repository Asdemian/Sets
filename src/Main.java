import products.ListProducts;
import products.Product;


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



       Set<Product> products = new HashSet<>();

        products.add(apple);
        products.add(orange);
        products.add(banana);
        products.add(cheese);
        products.add(sausage);
        products.add(fish);
        products.add(meat);

        for (Product product1 : products) {
            printInfo(product1);
        }


    }


    private static void printInfo(Product product) {
        System.out.println(product);
    }
}


