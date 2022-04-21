import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/home/aliaksandr/IdeaProjects/untitled/src/1.txt");
        int res = reader.read();
        while (res != -1){
            System.out.println((char) res);
            res = reader.read();
        }
        int[] names = new int [10];
        for (int i = 0; i < 10; i++){
            names [i] = (int) (Math.random()*10 + 1);
    }
        int [] surnames = new int[10];
        for (int i = 0;i<10; i++ ){
            surnames [i] = (int)(Math.random()*10 + 1);
        }
        Person a = new Person("Aliakdandr", "Zhuk", 26);
        Person b = new Person("Alex","Zmih", 22);
        Person c = new Person("Dima", "Vareiko", 27);
        Person d = new Person("Victor", "Mitsilovich", 26);
        Person e = new Person("Pavel", "Kisel", 27);
        Person f = new Person("Katya", "Vareiko", 24);
        Person g = new Person("Janina", "Zhuk", 60);
        Person h = new Person("Victor", "Kovgan", 26);
        Person i = new Person("Nikolaj", "Mitsilovich", 17);
        Person j = new Person("Sergei", "Zhukov", 29);
        System.out.println("a = " + a);
        System.out.println("v = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

}

}
/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
Вывести результат на экран.

Создать объект Person c полями name, surname, age. Создать два массива (имена и фамили).
Сгенерировать 10 объектов класса Person со случайным age и случайно выбранными именами и фамилиями соответствующего типа.
С помощью Java создать файл, в который запишется информация о этих людях.
 */

