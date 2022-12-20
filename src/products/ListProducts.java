package products;

import java.util.HashSet;
import java.util.Set;

public class ListProducts {

    private Set<Product> products = new HashSet<>();

//    public ListProducts(Set<Product> products) {
//        this.products = products;
//    }

    public void add(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже куплен");
        }

    }

    public void remove(Product product) {
        if (!products.remove(product)) {
            throw new IllegalArgumentException("Такого продукта нет");
        }


    }


}

