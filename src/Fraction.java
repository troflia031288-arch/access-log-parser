public class Fraction {
    // Числитель - numerator - целое число, объекты дробей не могут изменять свое состояние
    private final int numerator;
    // Знаменатель - denominator - целое число, объекты дробей не могут изменять свое состояние
    private final int denominator;

    // Конструктор класса: дробь может быть создана с указанием числителя и знаменателя
    public Fraction(int numerator, int denominator) {
        // Для знаменателя отрицательное  значение недопустимо
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть положительным");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Может вернуть строковое представление вида "числитель/знаменатель" toString()
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Может выполнять операции сложения дробей, результат - новая дробь
    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Может выполнять операции сложения дроби и целого числа, результат - новая дробь
    public Fraction sum(int integer) {
        return sum(new Fraction(integer, 1));
    }

    // Может выполнять операции вычитания дробей, результат - новая дробь
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Может выполнять операции вычитания целого числа, результат - новая дробь
    public Fraction minus(int integer) {
        return minus(new Fraction(integer, 1));
    }

}