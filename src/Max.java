import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        double[] myArray = {0,1,2,3,4,5,6,7,8,9};
        double max = Double.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            max = Math.max(max, myArray[i]);
        }
        System.out.println("Максимальный элемент в массиве myArray: " + max);
    }
}
/*
Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
Найдите максимальный элемент и выведите его индекс.Задача 3.
 */