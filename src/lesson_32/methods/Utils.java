package lesson_32.methods;

/*** Author: Roman Romashko Date: 12.03.2025 ***/

public class Utils {
    // Поменять местами два элемента массива с любым ссылочным типом данных
    public static <T> void swap(T[] array, int idx1, int idx2) {
        T temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    // Метод, который возвращает первый элемент в списке
    public static <T> T getFirstElement(MyList<T> list) {
        return list.isEmpty() ? null : list.get(0);
    }


    // Ограничения сверху UpperBound
    // Метод, который возвращает сумму элементов целочисленного списка
    // Для реализации снова возьмем наш класс и ограничим диапазон принимаемых типов данных:
    // <T extends SomeClass> - где Т должен быть классом SomeClass либо его потомком (подклассом)

    public static <T extends Number> int sumElements(T... elements) {
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].intValue();
        }
        return sum;
    }

    // ?  - Wildcard - "неизвестный / любой тип"
    // ? extends Number - любой тип, явл. наследником Numbers
    // public static <T> double listSum(MyList<T> listNumbers){

    public static double listSum(MyList<? extends Number> listNumber){

        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }
        return sum;

    }

    // Ограничения сверху LowerBound
    // ? super Integer - работаем с неизвестным типом, который явл. классом Integer или его родителем (суперклассом)
    public static void addNumbers(MyList<? super Integer> list){

        for (int i = 0; i < 5; i++) {
         list.add(i);
        }
        System.out.println(list);

    }


}
