package lesson8;

public class Sounds {

    public static void main(String[] args)
    {
        Dog dog = new Dog("Собака Шарик говорит: ");
        Sheep sheep = new Sheep("Овечка Долли говорит: ");
        Cat cat = new Cat("Кот Мурзик говорит: ");
        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = sheep;
        animals[2] = cat;
        for (Animal array: animals)
        {
            System.out.print(array.name);
            array.sound();
        }
    }
}
