import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Максим", 2, 4, 3, 5);
        System.out.println(student);

        student.addGrade(3);
        System.out.println(student);

        try {
            student.addGrade(1); // пытаемся добавить оценку не в установленном диапазоне
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        List<Integer> grades = student.getGrades();
        System.out.println("Все оценки: " + grades);
    }
}