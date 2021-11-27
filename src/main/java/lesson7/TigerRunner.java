package lesson7;

public class TigerRunner {
    public static void main(String[] args) {
        Pet tiger = new Pet();
        tiger.name = "ScherKhan";
        tiger.colour = "Striped";
        tiger.running = 500.0;
        tiger.swimming = 500.0;
        System.out.println("Тигр может пробежать " + tiger.running + " метров.");
        System.out.println("Тигр может проплыть " + tiger.swimming + " метров.");
    }
}
