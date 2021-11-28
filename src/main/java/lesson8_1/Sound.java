package lesson8_1;

public class Sound
{
    public static void main(String[] args)
    {
        Animal[] animal = new Animal[3];
        animal[0] = new Sheep("Долли");
        animal[1] = new Dog("Шарик");
        animal[2] = new Cat("Барсик");
        for ( Animal x: animal)
        {
            x.sound();
        }
    }
}
