package lesson7;

public class MouseRunner {
    public static void main(String[] args) {
        Pet mouse = new Pet();
        mouse.name = "Lariska";
        mouse.colour = "Gray";
        mouse.running = 10.0;
        mouse.swimming = 0.0;
        System.out.println("Мышь может пробежать " + mouse.running + " метров.");
        System.out.println("Мышь может проплыть " + mouse.swimming + " метров.");
    }
}
