package lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.lang.Math.random;

public class ConcurrencyWriter {
    public static void main(String args[]) {
        LogManager.getLogManager().reset();
        Logger rootLogger = LogManager.getLogManager().getLogger("");

        rootLogger.addHandler(new LogHandler("file.log"));

        Level[] arr = new Level[]{new LevelCustom("ERROR", 900),
                new LevelCustom("WARN", 900),
                new LevelCustom("INFO", 800),
                new LevelCustom("DEBUG", 800),
                new LevelCustom("TRACE", 800)};


        Thread t1 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < startTime + 60000) {
                try {
                    int rnd = new Random().nextInt(arr.length);
                    rootLogger.log(arr[rnd], "пишем с " + Thread.currentThread().getName());
                    Thread.sleep((long) (5000 * random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < startTime + 60000) {
                try {
                    int rnd = new Random().nextInt(arr.length);
                    rootLogger.log(arr[rnd], "пишем с " + Thread.currentThread().getName());
                    Thread.sleep((long) (5000 * random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < startTime + 60000) {
                try {
                    int rnd = new Random().nextInt(arr.length);
                    rootLogger.log(arr[rnd], "пишем с " + Thread.currentThread().getName());
                    Thread.sleep((long) (5000 * random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();
        t3.start();


        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try (BufferedReader br = new BufferedReader(new FileReader("file.log"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
