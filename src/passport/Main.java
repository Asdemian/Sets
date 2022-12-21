package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("3914745905", "Андрей",
                "Угаев", "Алексеевич",
                LocalDate.now().minusYears(43)));
        passports.add(new Passport("4615974527", "Луиза",
                "Кириенко", "Ильинична",
                LocalDate.now().minusYears(32)));
        passports.add(new Passport("4615974527", "Виктория",
                "Безмен", "Валерьевна",
                LocalDate.now().minusYears(32)));
        passports.add(new Passport("4508377639", "Юлия",
                "Петрыкина", "Владимировна",
                LocalDate.now().minusYears(48)));
        passports.add(new Passport("0117358957", "Алексей",
                "Бусоргин", "Алексеевич",
                LocalDate.now().minusYears(25)));

        PassportStorage passportStorage = new PassportStorage(passports);
        System.out.println(passportStorage);
    }


}
