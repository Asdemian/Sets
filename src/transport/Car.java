package transport;

import java.util.Objects;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

/*   private double engineVolume;
    private String transmission; // коробка передач
    private final String bodyType;  // тип кузова
    private String registrationNumber; // регистр номер
    private final int numberOfSeats;  // количество мест
    private boolean summerTires; // резина
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, int productionYear,
               String productionCountry, String color, int maximumMovementSpeed,
               String fuel, double engineVolume, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, boolean summerTires,
               Key key, Insurance insurance, double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color,
                maximumMovementSpeed, fuel, fuelPercentage);

        setEngineVolume(engineVolume);
        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "Седан";
        }
        this.bodyType = bodyType;
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "х000хх000";
        }
        this.registrationNumber = registrationNumber;
        if (numberOfSeats <= 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;
        setKey(null);
        setInsurance(null);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            insurance = new Insurance(null, 6000, null);
        }
        this.insurance = insurance;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getnumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(this.engineVolume, 0D) <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;
    }

    public void setSummerTires(boolean summerTires) {

        this.summerTires = summerTires;
    }

    public void changeTyres() {
        setSummerTires(!summerTires);
    }

    public boolean isValidNumber() {
        // x000xx000
        boolean result = true;

        result = result && registrationNumber.length() == 9;
        result = result && Character.isLetter(registrationNumber.charAt(0))
                && Character.isLetter(registrationNumber.charAt(4))
                && Character.isLetter(registrationNumber.charAt(5));
        result = result && Character.isDigit(registrationNumber.charAt(1))
                && Character.isDigit(registrationNumber.charAt(2))
                && Character.isDigit(registrationNumber.charAt(3))
                && Character.isDigit(registrationNumber.charAt(6))
                && Character.isDigit(registrationNumber.charAt(7))
                && Character.isDigit(registrationNumber.charAt(8));

        return result;
    }

    @Override
    public void refill() {
        System.out.println("Автомобиль запрален топливом " + getFuel());
        setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " , " + getProductionYear() +
                " год выпуска, сборка в " + getProductionCountry() + ", "
                + getColor() + " цвета, объем двигателя "
                + engineVolume + ", Коробка передачь (" + transmission + ')' +
                ", Тип кузова (" + bodyType + ')' + ", Регистрационный номер: ("
                + registrationNumber + ')' + ", Количество мест- " + numberOfSeats +
                ", Тип резины (" + summerTires + "). Запуск " + key + " Страховка "
                + insurance;
    }

    public void print() {
        System.out.println(this);
    }

    public static class Key {
        private final boolean remoteRun;
        private final boolean withouKeyAccess;

        public Key(boolean remoteRun, boolean withouKeyAccess) {
            this.remoteRun = remoteRun;
            this.withouKeyAccess = withouKeyAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithouKeyAccess() {
            return withouKeyAccess;
        }

        @Override
        public String toString() {
            return "(" +
                    " удаленный " + remoteRun +
                    " бесключевой " + withouKeyAccess +
                    ')';
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final int cost;
        private final String number;

        public Insurance(LocalDate expireDate, int cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if (cost <= 0) {
                cost = 6000;
            }
            this.cost = cost;
            if (number == null || number.isEmpty()) {
                number = "XXXXXXXXX";
            }
            this.number = number;
        }

        public void printExpired() {
            boolean expired = expireDate.isAfter(LocalDate.now());
            if (expired) {
                System.out.println("Страховка закончилась");
            }
        }

        public void printNumber() {
            boolean correct = number.length() == 9;
            if (!correct) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "(" +
                    " Срок действия " + expireDate +
                    " Стоимость " + cost +
                    " Номер страховки " + number +
                    ')';
        }
    }

  */

    @Override
    public void start() {
        System.out.println("Автомобиль (" + getBrand() + ") (" + getModel() + ") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль (" + getBrand() + ") (" + getModel() + ") остановился");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по автомобилю недостаточно");
        } else {
            System.out.println("Тип кузова автомобиля" + bodyType);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " отремонтирован");
    }


    @Override
    public void pitStop() {
        System.out.println("Автомобиль проехал пит-стоп");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 5);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 300);
    }

    @Override
    public String toString() {
        return super.toString() +
                " " + bodyType +
                ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }
}



