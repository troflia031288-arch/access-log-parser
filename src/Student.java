import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name; // Имя
    private final List<Integer> grades; // Оценки

    // При создании обязательно указать имя и опционально набор оценок
    public Student(String name, Integer... initialGrades) {
        this.name = name;
        this.grades = new ArrayList<>();

        // Выставление начальных оценок (в случае, если они есть)
        for (Integer grade : initialGrades) {
            addGrade(grade);
        }

    }

    // Может возвращать текстовое представление
    public String toString() {
        return name + ": " + grades.toString();
    }

    // Оценки должны быть в диапазоне от 2 до 5
    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException ("Оценка должна быть в диапазоне от 2 до 5");
        }
    }

    // Метод для получения всех оценок
    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // Возвращаем копию списка оценок
    }
}