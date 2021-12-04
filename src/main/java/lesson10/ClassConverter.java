package lesson10;

public class ClassConverter implements Convert {


    public void Conversion(int money, Valute first, Valute second) {
        if (first == Valute.RUB && second == Valute.USD) {
            System.out.println(money + " USD = " + (money * 74) + " RUB");
        } else if (first == Valute.USD && second == Valute.RUB) {
            System.out.println(money + " RUB = " + ((double) money / 74) + " USD");
        }
    }
}
