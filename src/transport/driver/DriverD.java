package transport.driver;

import transport.category.Category;

public class DriverD extends Driver<Category> {
    public DriverD(String name, boolean hasDriverLicense,
                   int experience, Category category) {
        super(name, hasDriverLicense, experience, category);
    }
   /* @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stoptMove(Bus transport) {
        transport.stop();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель "+getName()+" заправляет автобус " +transport.getBrand());
    }

    */
}
