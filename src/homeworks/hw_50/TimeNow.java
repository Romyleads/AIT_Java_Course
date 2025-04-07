package homeworks.hw_50;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

/*** Author: Roman Romashko Date: 07.04.2025 ***/

public class TimeNow {

    /*
    Task 2:

    1) Получить и вывести на экран:
    текущую дату
    текущий год, месяц и день

    2) Создать дату, например Ваш день рождения и вывести на экран
    Создать две даты и проверить на равенство

    3) Получить и вывести на экран:
    текущее время
    текущее время + 3 часа

    4) Создать дату:
    которая на неделю позже сегодняшней
    которая была на год раньше сегодняшней используя метод minus
    которая на год позже сегодняшней
    tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

    Task 3
    Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами в этом списке

     */
    public static void main(String[] args) {


        // Получаем текущую дату
        LocalDateTime now = LocalDateTime.now();

        // Задаем формат
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Выводим
        System.out.println("Сегодня: " + now.format(formatter));

        // Текущий год, месяц, день
        System.out.println("Год/Месяц/День: " + now.getYear() + "/" + now.getMonthValue() + "/" + now.getDayOfMonth());

        System.out.println("====================");

        // День рождения
        LocalDate birthday = LocalDate.of(1980, 7, 5);

        // Задаем формат и выводим
        System.out.println("День рождения: " + birthday.format(formatter));

        // Методом equals сравним две даты на равенство
        LocalDate dateA = LocalDate.of(2020, 1, 1);
        LocalDate dateB = LocalDate.of(2020, 1, 1);
        System.out.println("Равны ли: dateA.equals(dateB): " + dateA.equals(dateB));

        System.out.println("====================");

        // Текущее время
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Текущее время: " + now.format(timeFormatter));

        // Текущее время + 3 часа
        System.out.println("Текущее время + 3 часа: " + now.plusHours(3).format(timeFormatter));

        System.out.println("====================");

        // дата на неделю позже сегодняшней
        LocalDateTime nextWeek = now.plusWeeks(1);
        System.out.println("Через неделю: " + nextWeek.format(formatter));

        // дата на год раньше сегодняшней
        LocalDateTime lastYear = now.minusYears(1);
        System.out.println("Год назад: " + lastYear.format(formatter));

        // дата на год позже сегодняшней
        LocalDateTime nextYear = now.plusYears(1);
        System.out.println("Через год: " + nextYear.format(formatter));

        System.out.println("====================");

        // tomorrow / yesterday

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);

        System.out.println("Tomorrow после сегодня? " + tomorrow.isAfter(LocalDate.now()));
        System.out.println("Yesterday до сегодня? " + yesterday.isBefore(LocalDate.now()));



        System.out.println("\n=== Task 3 ===");

        List<LocalDate> dateList = new ArrayList<>(Arrays.asList(
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 3, 30),
                null,
                LocalDate.of(2025, 12, 31)
        ));

        long daysBetween = daysBetweenMinAndMaxDates(dateList);
        System.out.println("Разница между самой ранней и самой поздней датой: " + daysBetween + " дней");

    }


    public static long daysBetweenMinAndMaxDates(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) return 0;
        dates.removeIf(Objects::isNull);
        if (dates.size() < 2) return 0;
        return ChronoUnit.DAYS.between(Collections.min(dates), Collections.max(dates));
    }


}
