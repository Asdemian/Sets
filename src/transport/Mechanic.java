package transport;

public class Mechanic <T extends Transport>{
    private final String nameMechanic;
    private final String surnameMechanic;
    private final String firm;


    public Mechanic(String nameMechanic, String surnameMechanic, String firm) {
        this.nameMechanic = nameMechanic;
        this.surnameMechanic = surnameMechanic;
        this.firm = firm;
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public String getSurnameMechanic() {
        return surnameMechanic;
    }

    public String getFirm() {
        return firm;
    }

    public boolean service(T t) {
      return   t.passDiagnostics();
    }

    public void repair(T t) {
        t.repair();
    }

    @Override
    public String toString() {
        return " " +
                "Имя (" + nameMechanic + ')' +
                " Фамилие (" + surnameMechanic + ')' +
                " Фирма (" + firm + ')';

    }
}
