package lesson7;

public class DogRunner {
    public static void main(String[] args)
    {
        Pet dog = new Pet();
        dog.name = "Sharik";
        dog.colour = "Black";
        dog.running = 500.0;
        dog.swimming = 10.0;
        System.out.println("Собака может пробежать " + dog.running + " метров.");
        System.out.println("Собака может проплыть " + dog.swimming + " метров.");
    }
}
