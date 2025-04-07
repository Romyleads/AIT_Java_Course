package lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*** Author: Roman Romashko Date: 07.04.2025 ***/

public class JavaTimesAPI {

    // Java Time Api

    /*
    util.Date
    util.Calendar
    text.SimpleDateFormat
     */

    public static void main(String[] args) {

        // LocakDate - представляет дату у которой есть (год, месяц, день) - без времени

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("date: " + date);

        // Прибавить 1 день к дате

        LocalDate tomorrow = date.plusDays(1); // добавляет 1 день
        System.out.println("tomorrow: " + tomorrow);

        // Плюс 4 недели к дате
        System.out.println("plusWeeks: " + date.plusWeeks(4));

        // Минус 2 месяца
        System.out.println("minusMonth: " + date.minusMonths(2));

        LocalDate date1 = LocalDate.of(2002, 2, 15); // установить дату (год, месяц, число)
        System.out.println("date1: " + date1);


        // Можно использовать Enu, с названием месяца
        date1 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);



        System.out.println("\n================== LocalDateTime ==================");

        // LocalDateTime — представляет дату и время - без учета часового пояса
        LocalDateTime now = LocalDateTime.now(); // текущая дата-время
        System.out.println("now: " + now);

        now = LocalDateTime.now();
        System.out.println("now: " + now);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 22, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);

        dateTime = LocalDateTime.of(2024, 12, 31, 23, 59);
        System.out.println("dateTime: " + dateTime);

        System.out.println(dateTime.getDayOfWeek().getValue());

        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));


        System.out.println("год:" + date.getYear() + "; месяц: " + date.getMonth() + "; месяц-цифра: " + date.getMonthValue());

        System.out.println("число: " + date.getDayOfMonth() + "; день недели: " + date.getDayOfWeek() + "; день года: " + date.getDayOfYear());

        System.out.println("сколько дней в месяце: " + date.lengthOfMonth() + "; дней в году: " + date.lengthOfYear() + "; был ли год высокосным: " + date.isLeapYear());

        // Преобразование строки в объект даты
        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println(date2.getDayOfMonth() + "." + date2.getMonthValue() + "." + date2.getYear());

        System.out.println("\n============ LocalTime ============");

        // LocalTime — представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("time: " + time);

        // Задание времени вручную
        LocalTime time1 = LocalTime.of(21, 33); // часы + минуты
        time1 = LocalTime.of(21, 33, 44, 23213); // часы + минуты + еще точнее
        System.out.println("time1: " + time1);

        LocalTime time2 = time.plusHours(1); // добавляет 1 час к объекту времени
        System.out.println("time2: " + time2);

        System.out.println("time.plusMinutes(65): "+time.plusMinutes(65));
        System.out.println("time.minusSeconds(65): "+time.minusSeconds(65));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());

        String timeString = "12:13:45";
        LocalTime parsedTime = LocalTime.parse(timeString);
        System.out.println(parsedTime);


        System.out.println("\n =========== ZonedDateTime =============");

        // ZonedDateTime представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n ======= isAfter, isBefore, until, equals ==========");
        LocalDate date3 = LocalDate.of(2020, 10,  16);

        LocalDate date4 = LocalDate.of( 2020, 6, 25);

        // isAfter, isBefore, until, equals есть у всех объектов, представляющих дату и/или время

        // boolean isAfter - проверяет, что текущий объект после (позже) указанного объекта

        boolean isAfter = date3.isAfter (date4);

        System.out.println("date3.isAfter(date4): " + isAfter);


        // isBefore = проверяет, что текущий объект до(раньше) указанного объекта
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));

        // equals проверяем даты/время на равенство
        System.out.println("date3.equals(date4): "+ date3.equals(date4));

        // long until метод измеряет время между текущим и указанным объектов даты/времени

        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("between: "+ between);


        LocalDateTime dateTime1 = LocalDateTime.now();

        LocalDateTime dateTime2 = dateTime1.minusDays (15);

        System.out.println("dateTime1: " + dateTime1);
        System.out.println("dateTime2: " + dateTime2);

        System.out.println(dateTime2.until(dateTime1, ChronoUnit.DAYS));

        System.out.println("until seconds: " + dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.plus ( 10, ChronoUnit.DAYS);

        System.out.println(" dateTime1.plus(10, ChronoUnit.DAYS): " + dateTime3);

        dateTime3 = dateTime1.minus ( 10, ChronoUnit.MINUTES);

        System.out.println("dateTime1.plus(10, ChronoUnit.MINUTES): " + dateTime3);

        // метод ChronoUnit .between() -> long

        long hoursBetween = ChronoUnit.HOURS.between (dateTime1, dateTime2);

        System.out.println("hours Between: "+ hoursBetween);

        System.out.println("\n ============= Instant, Duration, Period ============== ");

        // Instant - представляет собой точку на временной шкале в григорианском календаре с точностью до наносекунд
        // Unix epoch - Эпоха юникс. Началась с 1 января 1970 года.
        // момент времени, он основан на количестве секунд и наносекунд, прошедших с первого января

        Instant nowInstant = Instant.now();

        long millis = nowInstant.toEpochMilli(); // получаем кол-во миллисекунд с 1970-01-01

        System.out.println("nowInstant.toEpoch Milli(): " + millis);

        Instant instant = Instant.ofEpochMilli(millis); // получить из миллисекунд объект инстанта

        System.out.println(instant);

        // Duration, Period представляют собой отрезки времени (временные интервалы)
        // Duration - продолжительность в секундах и наносекундах

        // Period разница (продолжительность) в днях, месяцах, годах


        System.out.println("\n========= DateTimeFormatter ==============");

        // DateTimeFormatter форматирование даты и времени

        LocalDateTime nowLDT = LocalDateTime.now();

        System.out.println("nowLDT: " + nowLDT);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedString = nowLDT.format(formatter);

        System.out.println("formattedString: " + formattedString);


        /*
        Y - год
        M - месяц
        d - День
        H - час в формате от 0 до 23
        p - час в формате от 0 до 12, флаг 'a' - AM/PM
        m - минута
        s - секунда

        Количество повторений символа определяет формат отображения значения
        yyyy - 4х значный год
        yy - двухзначный год, например 23 для 2023 года
        M - месяц в сыром формате -> "2", "12"
        MM - месяц в двухзначном формате -> "02", "12"

        сырой номер дня -> "3", "29"
        dd двухзначный день -> "03", "29"



         */

        // Есть строка с датой создать объект LDT соответсвующий этой дате

        String dateForParse = "23-10-26 19:15";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss a");
        LocalDateTime parseDate = LocalDateTime.parse(dateForParse, formatter1);

        System.out.println("parseDate: "+ parseDate);

        System.out.println(parseDate.getDayOfWeek() + " |" + parseDate.getHour());

        // "15-12-2022 20-46"

        // запарcить строку в формат LocalDateTime

        // распечатали отдельно месяц, день, час

        String dateStr1 = "15-12-2022 20-46";

        // форматтер для парсинга
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");

        // получаем LocalDateTime
        LocalDateTime parsedDate = LocalDateTime.parse(dateStr1, formatter2);

        // выводим отдельно месяц, день, час
        System.out.println("Month: " + parsedDate.getMonthValue());
        System.out.println("Day: " + parsedDate.getDayOfMonth());
        System.out.println("Hour: " + parsedDate.getHour());



        
    }
}




