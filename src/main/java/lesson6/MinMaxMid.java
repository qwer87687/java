package lesson6;

import java.util.Scanner;
import java.util.Arrays;

public class MinMaxMid {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите значение длины массива");
            int x = in.nextInt();
            double [] array = new double[x];
            for(int i = 0; i < array.length; i++) {
                array[i] = Math.random() * 1000;
            }
            System.out.println("Массив состоит из чисел: " + Arrays.toString(array));

                double minD = array[0];

                double maxD = array[0];

                double midD = 0;

            for(int j = 0; j < array.length; j++)
            {
                if(minD > array[0])
                    minD = array[0];

                if(maxD < array[j])
                    maxD = array[j];
                if (array.length > 0)
                {
                    double sum = 0;
                    for (int k = 0; k < array.length; k++) {
                        sum += array[k];
                    }
                    midD = sum / array.length;
                }
            }
            System.out.println("Наибольшее число в массиве - " + maxD + ", наименьшее - " + minD + ", среднее значение - " + midD);
        }
    }
