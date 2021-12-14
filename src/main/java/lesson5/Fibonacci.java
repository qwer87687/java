package lesson5;

import java.util.Scanner;

public class Fibonacci {
    /* Здесь выполняется математика вычисления значения числа Фибоначчи
    Первое условие - если число  стоит на первом месте - значит это ноль.
    Второе условие - если число  стоит на втором месте - значит это единица.
    Третье условие складывает значения двух предыдущих чисел.
     */
    static int FibonacciValue(int x) {
        if (x <= 1)
            return 0;
        else if (x == 2)
            return 1;
        else
            return FibonacciValue(x - 1) + FibonacciValue(x - 2);
    }
    /* Здесь осуществляется ввод порядкового номера числа Фибонначи в консоли,
    и вывод результата вычисления в консоль
     */
    public static void main(String[] args) {
        System.out.println("Введите порядковый номер числа в ряду Фибоначчи: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Число " + FibonacciValue(x) + " находится на " + x + " месте в ряду Фибоначчи");
    }
}

