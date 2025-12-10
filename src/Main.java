import java.io.File;//импорт класса для работы с файлами
import java.util.Scanner; //импорт класса для работы с консолью

public class Main {
    public static void main(String[] args) {
        int count = 0;

        while (true) {
            System.out.println("Укажите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

                if (fileExists == false) {
                    System.out.println("Указанный файл не существует");
                    continue;
                }
                if (isDirectory == true) {
                    System.out.println("Указанный путь является является путём к папке, а не к файлу");
                    continue;
                }

            else {
                count++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);

            }
        }
    }
}
