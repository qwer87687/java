package lesson14;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Subscriber {
    private final String name;
    private final Long number;
    private final Set<Subscriber> subscribers = new HashSet<>();

    public Subscriber(String name, Long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Long getNumber() {
        return number;
    }

    public Set<Subscriber> getSubscribers() {
        return subscribers;
    }

    @Override
    public String toString() {
        return "Имя абонента = " + name +
                ", номер абонента = " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}