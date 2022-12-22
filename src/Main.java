import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    /**
     * Объявите три массива:
     * Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
     * Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
     * Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
     */
    public static void task1() {
        System.out.println("Задача 1");
        float[] weight = new float[1];
        float[] weight1 = new float[2];
        float[] weight2 = new float[3];
        for (int a = 0; a < weight.length; a++) {
            weight[a] = 1.57f;
            System.out.println(weight[a]);
        }
        for (int b = 1; b < weight1.length; b++) {
            weight1[b] = 7.654f;
            System.out.println(weight1[b]);
        }
        for (int c = 2; c < weight2.length; c++) {
            weight2[c] = 9.986f;
            System.out.println(weight2[c]);
        }
    }

    /**
     * Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
     * В конце строки запятую ставить не надо.
     */
    public static void task2() {
        System.out.println("Задача 2");
        int[] intSequence = {1, 2, 3};
        System.out.println(Arrays.toString(intSequence));
        double[] doubleValues = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(doubleValues));

    }

    /**
     * Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
     * В конце строки запятую ставить не надо.
     */

    public static void task3() {
        System.out.println("Задача 3");
        int[] intSequence = {1, 2, 3};
        int[] reverse = new int[intSequence.length];
        int count = 0;
        for (int i = 1; i <= intSequence.length; i++) {
            reverse[count++] = intSequence[intSequence.length - i];
        }
        System.out.println(Arrays.toString(reverse));
        double[] doubleValues = {1.57, 7.654, 9.986};
        double[] reverse1 = IntStream.rangeClosed(1, doubleValues.length)
                .mapToDouble(i -> doubleValues[doubleValues.length - i])
                .toArray();
        System.out.println(Arrays.toString(reverse1));
    }

    /**
     * Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
     * Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
     * Распечатайте результат преобразования в консоль.
     */
    public static void task4() {
        System.out.println("Задача 4");
        int[] a = { 1, 2, 3};
        int[] b = a.clone();
        int x = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] += x;
            }
        }
        if (Arrays.equals(a, b)) {
        } else {
            System.out.println(Arrays.toString(a));
        }
    }
}
