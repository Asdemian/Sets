package transport;

import transport.driver.Driver;

import java.util.*;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    public Transport(String brand, String model,
                     double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (brand == null || brand.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void addDriver(Driver<?>... driver) {
        this.drivers.addAll(Arrays.asList(driver));
    }

    public void addMechanic(Mechanic<?>... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
    }
    public void addSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }
    @Override
    public String toString() {
        return " " +
                " Брэнд (" + brand + ')' +
                " Модель (" + model + ')' +
                " Объем двигателя (" + engineVolume + ')';
    }

    public abstract void start();

    public abstract void stop();

    public void printType() {
    }

    public abstract boolean passDiagnostics();

    public abstract void repair();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0
                && Objects.equals(brand, transport.brand)
                && Objects.equals(model, transport.model)
                && Objects.equals(drivers, transport.drivers)
                && Objects.equals(mechanics, transport.mechanics)
                && Objects.equals(sponsors, transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, mechanics, sponsors);
    }
}


