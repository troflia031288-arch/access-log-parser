public class Main {
    public static void main(String[] args) {

        double result1 = SumAll.sumAll(2, new Fraction(3,5), 2.3);
        System.out.println("Сумма из первого примера = " + result1);

        double result2 = SumAll.sumAll(3.6, new Fraction(49,12), 3, new Fraction(3,2));
        System.out.println("Сумма из второго примера = " + result2);

        double result3 = SumAll.sumAll(new Fraction(1,3), 1);
        System.out.println("Сумма из третьего примера = " + result3);
    }
}