import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyyThread myyThread1 = new MyyThread();
        myyThread1.start();
        myyThread1.join();
        MyyThread myyThread2 = new MyyThread();
        myyThread2.start();
        myyThread2.join();
        MyyThread myyThread3 = new MyyThread();
        myyThread3.start();
        myyThread3.join();
        MyyThread myyThread4 = new MyyThread();
        myyThread4.start();
        myyThread4.join();
        MyyThread myyThread5 = new MyyThread();
        myyThread5.start();
        myyThread5.join();
        MyyThread myyThread6 = new MyyThread();
        myyThread6.start();
        myyThread6.join();
        MyyThread myyThread7 = new MyyThread();
        myyThread7.start();
        myyThread7.join();
        MyyThread myyThread8 = new MyyThread();
        myyThread8.start();
        myyThread8.join();
        MyyThread myyThread9 = new MyyThread();
        myyThread9.start();
        myyThread9.join();
        MyyThread myyThread10 = new MyyThread();
        myyThread10.start();
        myyThread10.join();
    }

}
class MyyThread extends Thread {
    public void run() {
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()* 10 + 1);
            list1.add(a);
        }
        System.out.println(list1);
    }
}

/*
Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции из 10 случайных целых чисел
и выводит на экран.(не реализовано среднеарефметическое)
 */
