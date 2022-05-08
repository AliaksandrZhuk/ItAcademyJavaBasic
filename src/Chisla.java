import java.util.*;
import java.util.stream.Collectors;

public class Chisla {
    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Map<Boolean, List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy((p) -> p % 3 == 0));
        System.out.println("parts = " + parts);
        Map<Boolean, List<Integer>> parts1 = numbers.stream().collect(Collectors.partitioningBy((p) -> p % 5 == 0));
        System.out.println("parts1 = " + parts1);

    }
}
/*
Сгенерируйте List коллекцию целых чисел из n элементов от minValue до maxValue.
Определить, содержатся ли в данной коллекции числа, которые делятся и на 3, и на 5 с помощью stream
 */