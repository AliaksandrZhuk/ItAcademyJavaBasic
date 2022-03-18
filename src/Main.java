import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int[] array;
        array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.println( array [i] + " " );
        }
    }
}

/*
Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа
и выведите последний элемент массива на экран.Задание 1.
 */