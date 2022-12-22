package transport.driver;

import transport.category.Category;

public class DriverC extends Driver<Category> {
    public DriverC(String name, boolean hasDriverLicense,
                   int experience, Category category) {
        super(name, hasDriverLicense, experience, category);
    }

    /*   @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stoptMove(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель "+getName()+" заправляет грузовик " +transport.getBrand());
    }

*/

}
