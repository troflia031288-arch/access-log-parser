public class Main {
    public static void main(String[] args) {
        //—оздание нескольких экземпл€ров дробей
        Fraction f1 = new Fraction(1, 3); // одна треть
        Fraction f2 = new Fraction(2, 5); // две п€тых
        Fraction f3 = new Fraction(7, 8); // семь восьмых

        Fraction result = f1.sum(f2).sum(f3).minus(5);
        System.out.println(result);
    }
}