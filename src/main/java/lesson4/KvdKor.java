package lesson4;

import java.util.Scanner;

public class KvdKor {
    /* Здесь выполняется вся математика
    Квадратный корень введенного числа определяется путем последовательной аппроксимации
    Цикл выполняется до тех пор, пока "var1" и "kor" не сойдуться в одной точке.
     */
    public static double kvad(double in1) {
        double var1;
        double kor = in1 / 2;
        do {
            var1 = kor;
            kor = (var1 + (in1 / var1)) / 2;
        }
        while ((var1 - kor) != 0);
        return kor;
    }

    public static void main(String[] args)
            /* Здесь используется метод "java.util.Scanner"
            /* Здесь используется метод "java.util.Scanner"
            для того, чтобы пользователь ввел исходное число
            для  вычисления его квадратного корня */ {
        System.out.println("Введите любое целое положительное число: ");
        Scanner scan = new Scanner(System.in);
        double in1 = scan.nextInt();
        double root;
        root = kvad(in1);
        System.out.println("Число : " + in1);
        System.out.println("Кавдратный корень числа : " + root);
    }
}