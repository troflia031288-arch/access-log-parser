import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Необходимо ввести два числа");
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in) .nextInt();

        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in) .nextInt();

        int sum = number1 + number2;
        int raz = number1 - number2;
        int umn = number1 * number2;
        double del = (double) number1 / number2;

        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + raz);
        System.out.println("Произведение чисел: " + umn);
        System.out.println("Частное чисел: " + del);
    }
}
