package transport;


import transport.category.CategoryB;
import transport.category.CategoryC;
import transport.category.CategoryD;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sponsor honda = new Sponsor("HONDA", 420_000_000);
        Sponsor ferrari = new Sponsor("FERRARI", 200_000_000);
        Sponsor renault = new Sponsor("RENAULT", 130_000_000);
        Mechanic<Car> ivan = new Mechanic<Car>("Иван", "Иванович", "Авто");
        Mechanic<Car> dmitriy = new Mechanic<Car>("Дмитрий", "Иванович", "Формула");
        Mechanic<Car> michail = new Mechanic<Car>("Михаил", "Белозеров", "Скорость");

        Car sorento2021 = new Car("KIA", "Sorento2021", 2.5, BodyType.SEDAN);
        Car toyotaRAV4 = new Car("Toyota", "RAV4", 2.0, BodyType.SEDAN);
        Car hondaCRV = new Car("Honda", "CR-V", 2.0, BodyType.CROSSOVER);
        Car kiaSportage = new Car("KIA", "Sportage", 2.4, BodyType.SEDAN);
        sorento2021.addDriver(new DriverB("Семен", true, 7, new CategoryB()));
        sorento2021.addMechanic(ivan);
        sorento2021.addSponsor(ferrari);
       toyotaRAV4.addDriver(new DriverB("Семен", true, 7, new CategoryB()));
       toyotaRAV4.addMechanic(dmitriy);
       toyotaRAV4.addSponsor(renault);
        hondaCRV.addDriver(new DriverB("Семен", true, 7, new CategoryB()));
        hondaCRV.addMechanic(michail);
        hondaCRV.addSponsor(honda);
        kiaSportage.addDriver(new DriverB("Семен", true, 7, new CategoryB()));
        kiaSportage.addMechanic(dmitriy);
        kiaSportage.addSponsor(renault);

        Bus liaz4292 = new Bus("ЛиАЗ", "4292", 3.5, capacity.AVERAGE);
        Bus paz = new Bus("ПАЗ", "4234", 4.0, capacity.BIG);
        Bus nefaz = new Bus("НефАЗ", "5299", 3.5, capacity.ESPECIALLY_SMALL);
        Bus liaz5292 = new Bus("ЛиАЗ", "5292", 4.5, capacity.ESPECIALLY_SMALL);
        liaz4292.addDriver(new DriverC("Евлампий", true, 20, new CategoryC()));
        liaz4292.addMechanic(ivan);
        liaz4292.addSponsor(ferrari);
        paz.addDriver(new DriverC("Евлампий", true, 20, new CategoryC()));
        paz.addMechanic(dmitriy);
        paz.addSponsor(renault);
        nefaz.addDriver(new DriverC("Евлампий", true, 20, new CategoryC()));
        nefaz.addMechanic(michail);
        nefaz.addSponsor(honda);
        liaz5292.addDriver(new DriverC("Евлампий", true, 20, new CategoryC()));
        liaz5292.addMechanic(dmitriy);
        liaz5292.addSponsor(renault);

        Truck mercedesBenz = new Truck("Mercedes-Benz", "Actros", 5.0, WeightСapacity.N2);
        Truck volvo = new Truck("Volvo", "FH16", 4.7, WeightСapacity.N1);
        Truck scania = new Truck("Scania", "R730 V8", 4.5, WeightСapacity.N2);
        Truck man = new Truck("MAN", "TGX", 5.5, WeightСapacity.N1);
        mercedesBenz.addDriver(new DriverD("Прохор", true, 15, new CategoryD()));
        mercedesBenz.addMechanic(ivan);
        mercedesBenz.addSponsor(ferrari);
        volvo.addDriver(new DriverD("Прохор", true, 15, new CategoryD()));
        volvo.addMechanic(dmitriy);
        volvo.addSponsor(renault);
        scania.addDriver(new DriverD("Прохор", true, 15, new CategoryD()));
        scania.addMechanic(michail);
        scania.addSponsor(honda);
        man.addDriver(new DriverD("Прохор", true, 15, new CategoryD()));
        man.addMechanic(dmitriy);
        man.addSponsor(renault);
        // sorento2021.pitStop();

        // liaz5292.pitStop();
        //mercedesBenz.printType();

        //  mercedesBenz.pitStop();

/*
        evlampiy.refill(scania);
        evlampiy.printConclusion(scania);

        prohor.refill(paz);
        prohor.printConclusion(paz);

*/
       /* System.out.println(sorento2021);
        System.out.println(hondaCRV);
        System.out.println(paz);
        System.out.println(liaz5292);
        System.out.println(man);
        System.out.println(scania);
*/
      /*  boolean chek = Data.validate("1234qwerty", "123qwerty", "1238qwerty");
        if (chek) {
            System.out.println("Вводимые данные верны");
        } else
            System.out.println("Вводимые данные не верны");

       */

      /*  servise(sorento2021, toyotaRAV4, hondaCRV, kiaSportage,
                liaz4292, paz, nefaz, liaz5292,
                mercedesBenz, volvo, scania, man);

       */

        List<Transport> transports = List.of
                (sorento2021, toyotaRAV4, hondaCRV, kiaSportage,
                        liaz4292, paz, nefaz, liaz5292,
                        mercedesBenz, volvo, scania, man
                );

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(sorento2021);
        serviceStation.addTruck(man);
        serviceStation.passDiagnostics();
        serviceStation.passDiagnostics();

        for (Transport transport : transports) {
            printInfo(transport);
        }

    }

    private static void printInfo(Transport transport) {
        System.out.println("Инфо по автомобилю: " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println();
    }

   /* private static void servise(Transport... transports) {
        for (Transport transport : transports) {
            serviseTransport(transport);
        }
    }

    */

    private static void serviseTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " необходима диагностика.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}








