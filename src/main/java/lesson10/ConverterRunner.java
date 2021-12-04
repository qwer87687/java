package lesson10;

public class ConverterRunner {
    public static void main(String[] args) {
        Convert convert = new ClassConverter();
        convert.Conversion(100, Valute.RUB, Valute.USD);
        convert.Conversion(100, Valute.USD, Valute.RUB);
    }
}