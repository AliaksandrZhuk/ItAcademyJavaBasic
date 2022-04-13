import java.util.ArrayList;
import java.util.Random;

public class Ran {
    public static void main(String[] args) {
        int size = 15;
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++){
            int a = (int) (Math.random() * 10 +1);
            list.add(a);
        }
        System.out.println(list);

        ArrayList<Integer> rememberList = new ArrayList<Integer>();
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i).equals(list.get(i+1)));
            list.remove(i);
        }
        System.out.println(list);
    }
}
/*
Создать коллекцию, заполнить ее случайными целыми числами.
Удалить повторяющиеся числа. Результат - коллекция без повторов.
 */