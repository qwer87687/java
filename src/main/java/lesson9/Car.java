package lesson9;

public final class Car extends Automobile {
    private final String name;

    Car(String name) {
        this.name = name;
    }

    public void move(int distance) {
        if (distance > 500) {
            System.out.println(name + " не проедет на баке бензина " + distance + " км.");
        } else {
            System.out.println(name + " проедет на баке бензина " + distance + " км.");
        }
    }
}