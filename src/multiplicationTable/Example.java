package multiplicationTable;

import java.util.Objects;

public class Example {
    private final int a;
    private final int b;

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return a == example.a && b == example.b || a == example.b && b == example.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a) + Objects.hash(b);
    }

    @Override
    public String toString() {
        return a + " * " + b + " = " + a * b;
    }
}
