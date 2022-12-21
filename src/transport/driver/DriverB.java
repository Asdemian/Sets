package transport.driver;

import transport.category.Category;

public class DriverB extends Driver<Category>{
    public DriverB(String name, boolean hasDriverLicense,
                   int experience, Category category) {
        super(name, hasDriverLicense, experience, category);
    }
}
