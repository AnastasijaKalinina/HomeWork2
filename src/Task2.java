public class Task2 {
    /*Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
    */
    public static void main(String[] args) {
        int value = 4508;
        countDown(value);
    }
    public static void countDown(int value) {
        while (value > 0) {
            int i = value % 10;
            System.out.println(i);
            value /= 10;
        }
    }
}