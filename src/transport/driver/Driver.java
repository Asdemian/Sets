package transport.driver;

import transport.category.Category;

public abstract class Driver<C extends Category> {

    private final String name;
    private boolean hasDriverLicense;
    private int experience;

    private C category;

    public Driver(String name, boolean hasDriverLicense, int experience, C category ) {
        this.name = name;
        setHasDriverLicense(hasDriverLicense);
        this.experience = experience;
        setCategory(category);

    }

    public String getName() {
        return name;
    }

    public boolean getHasDriverLicense() {

        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        if (hasDriverLicense == false) {
            throw new IllegalArgumentException("Необходимо указать наличие прав!");
        }
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.category = category;
    }
public void startMove() {
    System.out.println("Водитель " +name+ " начал движение");
}
    public void stopMove() {
        System.out.println("Водитель " +name+ " остановился");
    }
    public void refuel() {
        System.out.println("Водитель " +name+ " заправляет автомобиль");
    }
//  public abstract void startMove(T transport);

    //  public abstract void stoptMove(T transport);

   // public abstract void refill(T transport);

  /*  public void printConclusion(T transport) {
        System.out.println("Водитель " + name + " ездит на "
                + transport.getBrand() + " и будет участвовать в заезде");
    }

   */

    @Override
    public String toString() {
        return "Имя водителя (" + name + ')' +
                " Наличие прав (" + hasDriverLicense +
                ") стаж (" + experience +
                " лет ) категория прав (" + category +
                ')';
    }
}
