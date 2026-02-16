package ru.courses.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//import ru.courses.main.Statistics;

class LineLengthException extends RuntimeException {
    public LineLengthException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int count = 0;

        while (true) {
            System.out.println("Укажите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println("Указанный файл не существует");
                continue;
            }
            if (isDirectory) {
                System.out.println("Указанный путь является путём к папке, а не к файлу");
                continue;
            } else {
                count++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);
            }

            try (FileReader fileReader = new FileReader(path);
                 BufferedReader reader = new BufferedReader(fileReader)) {

                String line;
                Statistics statistics = new Statistics();

                while ((line = reader.readLine()) != null) {
                    int length = line.length();

                    if (length > 1024) {
                        throw new LineLengthException("Длина строки превышает 1024 символа! Длина строки = " + length);
                    }

                    if (length > 0) {
                        LogEntry entry = new LogEntry(line);
                        statistics.addEntry(entry);
                    }
                }

                System.out.printf("Общий трафик: %.2f байт в час\n", statistics.getTrafficRate());


            } catch (LineLengthException ex) {
                System.err.println("Ошибка: " + ex.getMessage());
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}