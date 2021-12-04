package lesson9;

import java.util.Random;

public class AutomobileRun {
    public static void main(String[] args) {
        Random rnd = new Random();
        Automobile[] machine = new Automobile[]{
                new Car("Жигули"),
                new Car("Волга"),
                new Car("Москвич"),
                new Car("УАЗ"),
                new Car("Запорожец"),
                new Truck("Камаз"),
                new Truck("Краз"),
                new Truck("Урал"),
                new Truck("Белаз"),
                new Truck("Маз"),
        };
        for (Automobile mach : machine) {
            mach.move(rnd.nextInt(1000));
        }
    }
}