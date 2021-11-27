package lesson7;

public class CatRunner {
    public static void main(String[] args)
    {
        Pet cat = new Pet();
        cat.name = "Barsik";
        cat.colour = "Gray";
        cat.running = 200.0;
        cat.swimming = 0.0;
        System.out.println("Кошка может пробежать " + cat.running + " метров.");
        System.out.println("Кошка может проплыть " + cat.swimming + " метров.");
    }
}
