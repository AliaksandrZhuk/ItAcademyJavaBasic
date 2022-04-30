import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MooThread mooThread1 = new MooThread();
        mooThread1.start();
        mooThread1.join();
        MooThread mooThread2 = new MooThread();
        mooThread2.start();
        mooThread2.join();
        MooThread mooThread3 = new MooThread();
        mooThread3.start();
        mooThread3.join();
        MooThread mooThread4 = new MooThread();
        mooThread4.start();
        mooThread4.join();
        MooThread mooThread5 = new MooThread();
        mooThread5.start();
        mooThread5.join();
    }
}
class MooThread extends Thread{
    public void run(){
        int [] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.println(array[i] + " ");
        }

        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("hi.txt")));

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }


        /*try {
            FileOutputStream fileOutputStream = new FileOutputStream("hi.txt");
            fileOutputStream.write(toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
/*
Создать класс поток, который создает средствами Java файл и записать в него произвольно сгенерированный массив
из 10 случайных целых чисел. Запустить 5 потоков. (не реализована запись массива в файл)
 */
