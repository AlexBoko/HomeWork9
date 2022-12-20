public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
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
        public static void task2() {
            System.out.println("Задача 2");



}}
