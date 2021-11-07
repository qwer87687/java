package lesson2;

public class IntegerDigitOperation {
    public static void main(String[]args) {
        System.out.println(calculate(2, 6, 3));
    }

    public static int calculate(int var1, int var2, int var3) {
        // результат формулы кладем в переменную result
        int result = (var1 + var2) * var3;
        return result;
    }
}
