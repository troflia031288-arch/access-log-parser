package ru.courses.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
                System.out.println("Указанный путь является является путём к папке, а не к файлу");
                continue;
            }

            else {
                count++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);

            }

            try (FileReader fileReader = new FileReader(path);
                 BufferedReader reader = new BufferedReader(fileReader)) {

                String line;
                int totalNumber = 0;
                int max = 0;
                int min = Integer.MAX_VALUE;

                while ((line = reader.readLine()) != null) {
                    totalNumber++;
                    int length = line.length();

                    if (length > 1024) {
                        throw new LineLengthException("Длина строки превышает 1024 символа! Длина строки = " + length);
                    }

                    if (length > max) {
                        max = length;
                    }
                    if (length < min) {
                        min = length;
                    }
                }

                System.out.println("Всего строк в файле = " + totalNumber);
                System.out.println("Самая длинная строка имеет длину = " + max);
                System.out.println("Самая короткая строка имеет длину = " + (min == Integer.MAX_VALUE ? 0 : min));

            } catch (LineLengthException ex) {
                System.err.println("Ошибка: " + ex.getMessage());
                throw new RuntimeException("Ошибка обработки файла. Длина строки превышает 1024 символа", ex);
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}