package products;


import java.util.Set;

public class ListProducts {

    private Set<Product> products;

    public ListProducts(Set<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже куплен");
        }
        products.add(product);

    }



    public void remove(Product product) {
        if (!products.remove(product)) {
            throw new IllegalArgumentException("Такого продукта нет");
        }


    }
    @Override
    public String toString() {
        return " " +
                " Продукты = " + products +
                ' ';
    }

}

