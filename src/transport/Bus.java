package transport;

import java.util.Objects;

public class Bus extends Transport implements Competing {

    private transport.capacity capacity;

    public Bus(String brand, String model, double engineVolume,
               transport.capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public transport.capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(transport.capacity capacity) {
        this.capacity = capacity;
    }

    /*   public Bus(String brand, String model, int productionYear,
                       String productionCountry, String color, int maximumMovementSpeed,
                       String fuel, double fuelPercentage) {
                super(brand, model, productionYear, productionCountry, color,
                        maximumMovementSpeed, fuel, fuelPercentage);
            }

            @Override
            public void refill() {
                System.out.println("Автобус запрален топливом " + getFuel());
                setFuelPercentage(100);
            }

          */
    @Override
    public void start() {
        System.out.println("Автобус (" + getBrand() + ") " +
                "(" + getModel() + ") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус (" + getBrand() + ")" +
                " (" + getModel() + ") остановился");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по автобусу недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom()
                    + " до " + capacity.getTo());
        }
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " отремонтирован");
    }
    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " +getBrand()+" модель "+getModel()+" "+ getCapacity() +" В диагностике не требуется.");
        return true;
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус проехал пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return super.toString() + " Вместимость автобуса: от " + capacity.getFrom()
                + " до " + capacity.getTo() + " мест. ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
