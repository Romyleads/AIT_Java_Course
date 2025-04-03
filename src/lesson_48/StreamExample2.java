package lesson_48;

import lesson_47.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*** Author: Roman Romashko Date: 02.04.2025 ***/

/*
Stream API - инструмент, позволяющий обрабатывать наборы данных в декларативном стиле
Основная идея - преобразование посл-ти элементов через набор операций.
Stream (поток) - поток данных представляет собой последовательность элементов
Поток дает возм-ть поочередного получения элементов для обработки.
Стримы могут быть созданы из различных источников (коллекции, массивы, файлы, консоль и т.п)

Pipeline - последовательность операций, которая будет выполняться на потоке данных.
Промежуточные операции (Intermediate operations) - это операции, которые преобразуют поток в другой поток (возвращают поток)
Их может быть много (больше чеи одна).

Терминальные операции / методы - Это операции, которые запускают обработку потока и закрывают его. Может быть только один терминальный метод.
После выполнения терминальной операции - поток перестает быть доступным для дальнейшей обработки

Ленивые вычисления

Стримы не выполняют промежуточные операции пока на потоке не будет вызван термальный метод



 */

public class StreamExample2 {


    /*
    Промежуточные методы: (ВСЕ возвращают поток):
    Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы, для которых предикат вернет true

    Т.е. оставляет элементы, удовлетворяющие условию. (Отбрасывает элементы НЕ удовлетворяющие условию)

    sorted() - сортирует поток в естественном порядке
    sorted(Comparator<T> comparator) - сортирует элементы потока с использованием компаратора


    Stream<R> map(Function<T ,R> action) - преобразует элементы потока с использованием заданной функции, в том числе в другой тип данных.

    Stream<T> peak(Consumer<T> action) - выполняет действия для каждого элемента потока и действие, как правило, не изменяющая элемент.

    disinct() - удаляет дубликаты из потока

    limit(long maxSize) - метод ограничивает кол-во эл-тов потока, т.е. в потоке на выходе не больше maxSize элементов

    skip(long n) - отбрасывает (пропускат) n элементов потока

    Stream<T> mapToObj(Function() mapper) - преобразование примитива в ссылочный при помощи заданной функции

    boxed() - преобразует поток примитивов IntStream в поток соответствующих оберток: Stream<Integer>

    mapToInt() - преобразует поток Stream<Integer> в поток IntStream



    ----------

    Терминальные методы

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или др. структуры данных

    void foreach (Consumer<T> action) - выполняет заданное действие для каждого действия потока

    Optional<T> max(Comparator<T> comparator) - возвращает элемент с максимальным значением по мнению компаратора
     Optional<T> min(Comparator<T> comparator) - возвращает элемент с минимальным значением по мнению компаратора

     long count() - количество элементов в потоке

     Optional<T> findFirst() - получить первый элемент потока
     Optional<T> findAny() - получить случайный элемент потока



     */


    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        //task11();
        //task12();
        //task13();
        //task14();
        //task15();
        task16();




    }

    private static List<Cat> getListCats() {

        return List.of(

                new Cat("Bear", 5, "braun"),
                new Cat("Pit", 7, "green"),
                new Cat("Tig", 3, "yellow"),
                new Cat("Panda", 4, "black")

        );


    }


    private static void task16() {

        int[] ints = {10, 20, 30, 40 , 50, 60 ,70};
        // преобразовать массив примитивов в список (коллекцию), используя Stream API

        // Stream<int> - не бывает. IntStream, DoubleStream..... бывает потоки примитивов

        List<Integer> integers = Arrays.stream(ints)
                //.mapToObj(i->Integer.valueOf(i))
                //.mapToObj(Integer::valueOf)
                // .mapToObj(i->i)
                .boxed()
                .collect(Collectors.toList());


        System.out.println("integers: "+integers);

        // Получить из коллекции Integers - массив примитивов

        // Получить из коллекции Integer - массив примитивов
        int[] intArray = integers.stream()
        // автораспаковка
        .mapToInt(i -> i)
        // хочет поток примитивов
        .toArray();

        System.out.println("массив: "+ Arrays.toString (intArray));

    }
    private static void task15() {

        // Получить первый (самый левый) элемент потока

        List<Integer> integers = List.of(10, 20, 30, -20, 30, -50, 0, -25);


        // Альтернативный способ для минимум


        Optional<Integer> first = integers.stream()
                        .sorted()
                        .findFirst();

        System.out.println("first: "+first.get());

        System.out.println("===============================");

        Optional<Integer> any = integers.stream()
                .sorted()
                .findAny();

        System.out.println("any: "+any.get());



    }

    private static void task14() {

        // Получить список из 3 самых маленьких из списка

        List<Integer> integers = List.of(10, 20, 30, -20,30, -50, 0, -25);

        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("smallest: "+smallest.toString());

        // отбросить два самых маленьких

        List<Integer> skipped = integers.stream()
                .sorted()
                .limit(3)
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("skipped: "+skipped.toString());

    }



    private static void task13() {

        // Посчитать количество четных цифр в списке

        List<Integer> integers = List.of(10, 20, 30, -20,30, -50, 0, -25);

        long count = integers.stream()
                .filter(n-> n%2 == 0)
                .count();

        System.out.println("count: "+count);

    }



    private static void task12() {
        List<Cat> cats = getListCats();

        // Найти самое длинное имя кота
        /*
           Преобразовать котов в имена и сравнить по длине, найти самое длинное имя
         */

        Cat cat0= new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> catss = Arrays.asList(cat0, cat1, cat2, cat3, cat4, cat0);

        Optional<String> longestNameOptional = cats.stream()
                .filter(Objects::nonNull)
                .map(cat -> cat.getName()) // котиков - в имена
                // .map(Cat::getName)
                .filter(Objects::nonNull) //проверка имен на null
                .max(Comparator.comparing(String::length));
            //    .max(Comparator.comparing(str -> str.length()));
           //     .max((name1, name2) -> Integer.compare(name1.length(), name2.length()));
           //     .max((name1, name2) -> name1.length() name2.length());

        if (longestNameOptional.isPresent()) {
            System.out.println(longestNameOptional.get());
        } else {
            System.out.println("Котов с имена не найдено");
        }

        String longestName = cats.stream()
            .map(Cat::getName)
            .max(Comparator.comparing (String::length))
            .orElse (null);
            //.orElse("");

        System.out.println("longestName: " + longestName);






    }


    private static void task11() {

        // найти максимум (минимума) из списка

        List<Integer> integers = List.of(10, 20, 30, -20,30, -50, 0, -25);

        Optional<Integer> max = integers.stream()
                .max(Comparator.naturalOrder());

        System.out.println("max: "+max);
        System.out.println("max: "+max.orElse(null));

        // найти самое маленькое, которое больше 100
        Optional<Integer> minVal = integers.stream()
                .filter(n-> n>100)
                .min(Integer::compareTo);

        System.out.println("minVal: "+minVal);
        System.out.println("minVal: "+minVal.orElse(null));









        }


        private static void task10() {

            // Удалить дубликаты (повторяющиеся значения) из списка

            List<Integer> integers = Arrays.asList(10, 20, 30, 20,30, 50, 0);


            List<Integer> unique = integers.stream()
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println(unique);


            System.out.println("=================");

            Cat cat = new Cat("Bear", 5, "braun");
            Cat cat1 = new Cat("Python", 7, "green");
            Cat cat2 = new Cat("Tiger", 3, "yellow");
            Cat cat3 = new Cat("Panda", 4, "black");
            Cat cat4 = new Cat("Panda", 4, "black");

            List<Cat> cats = Arrays.asList(cat, cat1, cat2, cat3, cat4, cat);

            cats.forEach(System.out::println);

            System.out.println("========= filter ========");

            cats.stream()
                    .distinct()
                    .forEach(System.out::println);




    }
        private static void task9() {

        // создание стрима из Мар

        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        // Создание стрима из элементов entrySet

        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println("entry.getValue(): "+entry.getValue()) );

        System.out.println("map: "+map);
    }

    private static void task8() {


        Cat cat1= new Cat("Bear", 5, "braun");
        Cat cat2=new Cat("Pit", 7, "green");
        Cat cat3=new Cat("Tig", 3, "yellow");
        Cat cat4=new Cat("Panda", 4, "black");

        Cat[] cats = {cat1,cat2,cat3,cat4, new Cat(null,10,"red")};

        // получить список кошек, имя которіх длиннее 4

        // Arrays.stream(cats) - создает поток из элементов массива


        List<Cat> longCats = Arrays.stream(cats)
               // .filter(c->c != null) // оставить в потоке только не null
               // .filter(c-> Objects.nonNull(c)) // оставить в потоке только не null
                .filter(Objects::nonNull) // оставить в потоке только не null
                .filter(c->Objects.nonNull(c.getName())) // оставить в потоке только не null
                //.filter(c->c!=null&&c.getName().length()>4)
                .filter(c->c.getName().length()>4)
                .collect(Collectors.toList());

        System.out.println(longCats);

        /*
        Object.notNull(null) - вернет true, если параметр НЕ null
        Object.isNull(null) - вернет true, если параметр null
         */









        //



    }


    private static void task7() {
        List<Cat> cats = getListCats();

        // Вывести имена котов чей вес < 5 и при этом вывести котов, оставшихся в потоке, после фильтрации
        /*
        peak - промежуточный метод, используется для отладки, не закрывает поток
        foreach - терминальный метод, для выполнения действия с каждым элементом потока. Закрывает поток
         */

        Stream<String> catStream = cats.stream()
                .peek(System.out::println)
                .peek(System.out::println)
                .peek(System.out::println)
                .peek(System.out::println)
                .filter(c -> c.getWeight()<5)
                .peek(cat->System.out.println("After filter:" +cat))
                .map(c->c.getName());


               // .collect(Collectors.toList());

        // Терминальный метод
        catStream.forEach(name->System.out.println("Terminal: "+name));


    }
    private static void task6() {
        List<Cat> cats = getListCats();

        // Получить список имен кошек, у которых имена короче 5 символов
        /*

        Классический - методы фильтрации должны выполняться как можно раньше - эффективность!!!

         */

        List<String> names1 =cats.stream()
                .filter(cat -> cat.getName().length()<5)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(names1);

        /*

        В угоду читаемости кода:

         */

        System.out.println("============================");

        List<String> names2 =cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length()<5)
                .collect(Collectors.toList());

        System.out.println(names2);




    }

    private static void task5() {
        List<Cat> cats = getListCats();

        // Получить список имен чей вес больше 4
        // Создать поток кошек
        // Оставить кошек, чей вес больше 4
        // Изменить тип потока - преобразовать кошку в ее имя
        // Собрать это в список



        // Получить список имен всех кошек

        // в вебе перед List обычно ретурн:

        // return
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4) // оставляем только тяжёлых
                .map(Cat::getName)                 // берём их имена
                // .map(cat->cat.getName())
                .collect(Collectors.toList());     // собираем в список

        System.out.println("catnames: "+catNames);

        // Изначальная коллекция не изменяется
        System.out.println(cats);



    }


    private static void task4() {
        List<Cat> cats = getListCats();

        // Получить список имен всех кошек

        //Stream<String> namesStream = cats.stream()
          //      .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catnames: "+catNames);

        // Изначальная коллекция не изменяется
        System.out.println(cats);


        /*
        List<String> listNames = new ArrayList<>();

        for(Cat cat : cats){
            listNames.add(cat.getName());

        }
        */




    }
    private static void task3() {
        List<Cat> cats = getListCats();


        // Оставить котов с именем длиннее 4 символа

        Stream<Cat> catStream = cats.stream()

                .filter(cat -> cat.getName().length() > 4);

        // Пока не запущен терм. метод - промежуточные операции не выполняются

        List<Cat> longNames = catStream.collect(Collectors.toList());

        System.out.println("longNames: " + longNames);

        //        .collect(Collectors.toList());


        //System.out.println("fatCats: " + catStream);

    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // список кошек с весом больше 4

        Stream<Cat> catStream = cats.stream()

                .filter(cat -> cat.getWeight() > 4);

        // Терминальный метод

        List<Cat> fatCats = catStream.collect(Collectors.toList());
        //List<Cat> fatCats = catStream.toList(); // Java17 or higher

        System.out.println("fatCats: " + fatCats);

        // Повторно использовать закрытый поток нельзя, закрытый - тот, на котором был вызван терминальный метод

        //List<Cat> catList2 = catStream.sorted().collect(Collectors.toList()); // будет ошибка (исключение)


    }

    private static void task1() {

        List<Integer> integers = List.of(-1, 12, 0, 5, 1, 15, -15, 24, 2, 99);

        // Получить список, содержащий все положительные числа исходного списка и в порядке возрастания

        List<Integer> result = new ArrayList<>();

        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции.

        List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List
                .filter(e -> e > 0) // фильтрация элементов
                .sorted() // сортировка в естественно порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию

        System.out.println("List: " + integerList);
    }


    //private static void task2(){


    //}
}
