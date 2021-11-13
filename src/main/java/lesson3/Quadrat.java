package lesson3;

public class Quadrat {


    public static void main(String[] args) {
        double a = 1;
        double b = -8;
        double c = 12;
        double d;
        System.out.println("Программа решает квадратное уравнение вида: ax^2 + bx + c = 0");
        System.out.println("при заданных а=1, b=-8, с=12");

        d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
