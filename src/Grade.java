import java.util.ArrayList;
import java.util.Iterator;

public class Grade {
    public static void main(String[] args) {
        int element = 5;
        ArrayList<Integer> grade = new ArrayList<Integer>(element);
        for (int i = 0; i < element; i++){
            int a = (int) (Math.random()* 10 + 1);
            grade.add(a);
        }
        System.out.println(grade);
        Iterator<Integer> iterator = grade.iterator();
        while (iterator.hasNext()){
            int n = grade.iterator().next();
            //не знаю как доделать
            }
        System.out.println(iterator);
        }
    }
/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.
 */
