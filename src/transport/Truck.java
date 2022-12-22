package transport;

import java.util.Objects;

public class Truck extends Transport implements Competing {

    private WeightСapacity weightСapacity;

    public Truck(String brand, String model, double engineVolume, WeightСapacity weightСapacity) {
        super(brand, model, engineVolume);
        this.weightСapacity = weightСapacity;
    }

    public WeightСapacity getWeightСapacity() {
        return weightСapacity;
    }

    public void setWeightСapacity(WeightСapacity weightСapacity) {
        this.weightСapacity = weightСapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик (" + getBrand() + ")" +
                " (" + getModel() + ") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик (" + getBrand() + ") " +
                "(" + getModel() + ") остановился");
    }

    @Override
    public void printType() {
        if (weightСapacity == null) {
            System.out.println("Данных по грузовику недостаточно");
        } else {
            String from = weightСapacity.getFrom() == null ? " " : " от " + weightСapacity.getFrom() + " ";
            String to = weightСapacity.getFrom() == null ? " " : " до " + weightСapacity.getTo() + " ";
            System.out.println(" Грузоподьемность грузовика " + from + to);
        }
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " отремонтирован");
    }
    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик проехал пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 10);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 150);
    }

    @Override
    public String toString() {
        return super.toString() +
                " грузоподьемность грузовика (" + weightСapacity +
                ") ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return weightСapacity == truck.weightСapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weightСapacity);
    }
}
