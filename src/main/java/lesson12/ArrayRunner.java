package lesson12;

import lesson12.exceptions.MyArrayDataException;
import lesson12.exceptions.MyArraySizeException;

public class ArrayRunner {

    public static void main(String[] args) throws MyArraySizeException {
        int err = 1;  // 1 - без ошибок, 0 - ошибка
        int a = (int) (4 + Math.random() * 2);
        System.out.println(a);
        String[][] oneArray = new String[a][4];

        for (int i = 0; i < oneArray.length; i++) {
            for (int j = 0; j < oneArray[0].length; j++) {
                if (i == 2 && j == 2) {
                    if (Math.random() < 0.4) {
                        oneArray[i][j] = "лопата";
                    } else {
                        oneArray[i][j] = String.valueOf((int) (Math.random() * 100));
                    }
                } else {
                    oneArray[i][j] = String.valueOf((int) (Math.random() * 100));
                }
            }
        }

        try {
            Array twoArray = new Array(oneArray);
            for (int i = 0; i < twoArray.getMyArray().length; i++) {
                for (int j = 0; j < twoArray.getMyArray()[0].length; j++) {
                    System.out.print(twoArray.getMyArray()[i][j] + " : ");
                }
                System.out.println();
            }
            System.out.println("Сумма массива: " + twoArray.sumArray(twoArray.getMyArray()));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
            err = 0;
        } finally {
            if (err == 0) {
                System.out.println("Имеются ошибки");
            } else {
                System.out.println("Ошибок нет");
            }
        }

    }
}
