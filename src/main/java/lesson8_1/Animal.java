package lesson8_1;

public class Animal {
    private String sound;
    private String name;

    public Animal(String name, String sound) {
        this.sound = sound;
        this.name = name;
    }

    public void sound() {
        System.out.println(this.name + " говорит " + this.sound);
    }
}
