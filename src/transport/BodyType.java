package transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String body;

    BodyType(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }


    @Override
    public String toString() {
        return "Тип кузова (" + body + ')';
    }
}
