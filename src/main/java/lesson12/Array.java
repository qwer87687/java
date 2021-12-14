package lesson12;

import lesson12.exceptions.MyArrayDataException;
import lesson12.exceptions.MyArraySizeException;

public class Array {

    private String[][] myArray;

    public Array() {
        this.myArray = new String[4][4];
    }

    public Array(String[][] myArray) throws MyArraySizeException {
        if (myArray.length != 4 || myArray[0].length != 4) {
            throw new MyArraySizeException("Исключение размера массива "
                    + myArray.length + ":" + myArray[0].length);
        }
        this.myArray = myArray;
    }

    public String[][] getMyArray() {
        return myArray;
    }

    public void setMyArray(String[][] myArray) {
        this.myArray = myArray;
    }

    public int sumArray(String[][] array) throws MyArrayDataException {
        int sum = 0;
        int i = 0, j = 0;
        try {
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[0].length; j++) {
                    sum += (Integer.parseInt(array[i][j]));
                }
            }
        } catch (Exception k) {
            throw new MyArrayDataException("Ошибка, текущее значение в ячейке " + i + ":" + j + " -  (" + k + " )");
        }
        return sum;
    }
}
