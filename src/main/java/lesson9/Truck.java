package lesson9;

public final class Truck extends Automobile {
    private final String name;

    Truck(String name) {
        this.name = name;
    }

    public void move(int distance) {
        if (distance > 1200) {
            System.out.println(name + " не проедет на баке бензина " + distance + " км.");
        } else {
            System.out.println(name + " проедет на баке бензина " + distance + " км.");
        }
    }
}
