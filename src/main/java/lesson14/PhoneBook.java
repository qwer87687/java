package lesson14;

import java.util.*;

public class PhoneBook {

    public static final String NAME_LETTERS = "абвгдеёжзиклмно";
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Subscriber> subscribersList = new ArrayList<>();
        for (double i = 0; i < 1000; i++) {
            subscribersList.add(generateSubscriber());
        }

        for (Subscriber subscriber : subscribersList) {
            for (int i = 0; i < 5; i++) {
                subscriber.getSubscribers().add(subscribersList.get(RANDOM.nextInt(subscribersList.size())));
            }
            System.out.println(subscriber + subscriber.getSubscribers().toString());
        }
        Map<Long, Integer> numbersCount = new HashMap<>();
        for (Subscriber subscriber : subscribersList) {
            for (Subscriber linkedSubscriber: subscriber.getSubscribers()) {
                numbersCount.merge(linkedSubscriber.getNumber(), 1, Integer::sum);

            }
        }
        for (Map.Entry<Long, Integer> entry : numbersCount.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
    private static String generateName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char c = NAME_LETTERS.charAt(RANDOM.nextInt(NAME_LETTERS.length()));
            sb.append(c);
        }
        return sb.toString();
    }

    private static long generateNumber() {
        return RANDOM.nextLong(1000000) + 800000000;
    }

    private static Subscriber generateSubscriber() {
        return new Subscriber(generateName(), generateNumber());
    }

}
