package lesson18;

import lombok.SneakyThrows;

import java.io.*;

public class TextRunner {

    @SneakyThrows({IOException.class})
    public static void main(String[] args) {
        //Генерация файла
        try (FileOutputStream writerNewFile = new FileOutputStream("C:\\1\\file.txt")){
            for(int i = 1; i < 4; i++){
                String bl = "This № " + i + "\n";
                byte[] bytes = bl.getBytes();
                writerNewFile.write(bytes);
                System.out.println(i);
            }
        }

        if(new File("C:\\1\\file.txt").exists()) {
            try (BufferedReader buffReader = new BufferedReader(new FileReader("C:\\1\\file.txt")
                    /*new InputStreamReader(InputStreamRunner.class.getResourceAsStream("C:\\1\\file.txt"))*/)) {
                String line = "";
                int i = 1;
                //Запись в файлы
                while (line != null) {
                    line = buffReader.readLine();
                    if (line != null) {
                        String nameFile = "C:\\1\\file_" + i + ".txt"; //генерация имени нового файла
                        try (FileWriter fileWriter = new FileWriter(nameFile)) {
                            fileWriter.write(line);
                            i++;
                        }
                    }
                    System.out.println(line);
                }
            }
        }
        else{
            System.out.println("Нет file.txt");
        }
    }
}