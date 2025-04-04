package homeworks.hw_48;

import lesson_48.Employee;

import java.util.*;
import java.util.stream.Collectors;

/*** Author: Roman Romashko Date: 04.04.2025 ***/

/*
    Task 4 Опционально
    Практикуем groupingBy
  + Создай список студентов (List) — минимум 10 объектов, с разнообразными значениями.

    Задания:
  + Группировка по специальности: Сгруппируй студентов по специальности (поле major) в Map<String, List>.
  +  Группировка по курсу с использованием Set: Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.
  +  Подсчёт количества студентов по специальности: Построй Map<String, Long>, где ключ — специальность, а значение — количество студентов на этой специальности.
  +  Средний балл по специальности: Построй Map<String, Double>, где ключ — специальность, а значение — средняя оценка студентов на этой специальности.
  +  Список оценок по специальности: Построй Map<String, List>, где хранятся только оценки по каждой специальности.

  +  Суммарная статистика по возрасту: Используй IntSummaryStatistics, чтобы получить:
    минимальный возраст,
    максимальный возраст,
    средний возраст,
    общее количество студентов,
    сумму всех возрастов.

    Требования:
    Вся логика должна быть оформлена в main().
    Не забудь добавить toString() в класс Student для красивого вывода.
    Постарайся использовать Stream API и Collectors как на уроке.
    🔄 Дополнительно (по желанию):

    Сгруппируй студентов по курсу, и внутри каждого курса сгруппируй по специальности: → Map<Integer, Map<String, List>>
 */

public class GroupingByStudents {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Alisa", 20, "IT", 1, 4.0),
                new Student("Bob", 21, "Math", 2, 3.8),
                new Student("Charlie", 22, "IT", 2, 4.2),
                new Student("Diana", 23, "Physics", 3, 4.5),
                new Student("Eva", 20, "Math", 1, 4.1),
                new Student("Frank", 24, "IT", 4, 3.7),
                new Student("Grisha", 21, "Physics", 2, 4.0),
                new Student("Mike", 25, "IT", 3, 3.9),
                new Student("Iva", 22, "Math", 3, 3.6),
                new Student("Jack", 23, "Physics", 4, 4.3)

        ));

        // Группировка по специальности

        Map<String, List<Student>> byMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));

        System.out.println("grouping by department map: ");

        byMajor.forEach((major, studentList)->System.out.println(major+ ": "+studentList) );


        // Группировка по курсу с использованием Set

        Map<Integer, Set<Student>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));

        printMap(map);

        // Подсчёт количества студентов по специальности

        Map<String, Long> countByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));

        printMap(countByMajor);


        // Средний балл по специальности

        Map<String, Double> avgGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGrade)));

        printMap(avgGrade);

        // Список оценок по специальности:

        Map<String, List<Double>> gradesByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.mapping(Student::getGrade, Collectors.toList())));

        printMap(gradesByMajor);


        // Суммарная статистика по возрасту:

        IntSummaryStatistics stats = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));

        System.out.println("min: " + stats.getMin());
        System.out.println("max: " + stats.getMax());
        System.out.println("avg: " + stats.getAverage());
        System.out.println("count: " + stats.getCount());
        System.out.println("sum: " + stats.getSum());

        // Группировка по курсу и внутри по специальности:

        Map<Integer, Map<String, List<Student>>> majorGrouping = students.stream()
                .collect(Collectors.groupingBy(Student::getYear,
                        Collectors.groupingBy(Student::getMajor)));


        printMap(majorGrouping);


    }
    private static <K, V> void printMap(Map<K, V> map) {
        map.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("======================\n");
    }


}
