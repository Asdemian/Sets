package transport;

public enum WeightСapacity {

    N1(0D, 3.5),
    N2(3.5, 12D),
    N3(12D, null);

    private WeightСapacity weightСapacity;

    private final Double from;
    private final Double to;

    WeightСapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
        this.weightСapacity = weightСapacity;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }

    @Override
    public String toString() {
        return " от " + from +
                " до " + to +
                " т. ";
    }
}
