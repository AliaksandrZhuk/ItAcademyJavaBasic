import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
     MyThread myThread1 = new MyThread();
     myThread1.start();
     myThread1.join();
     MyThread myThread2 = new MyThread();
     myThread2.start();
     myThread2.join();
     MyThread myThread3 = new MyThread();
     myThread3.start();
     myThread3.join();
     MyThread myThread4 = new MyThread();
     myThread4.start();
     myThread4.join();
     MyThread myThread5 = new MyThread();
     myThread5.start();
     myThread5.join();
     MyThread myThread6 = new MyThread();
     myThread6.start();
     myThread6.join();
     MyThread myThread7 = new MyThread();
     myThread7.start();
     myThread7.join();
     MyThread myThread8 = new MyThread();
     myThread8.start();
     myThread8.join();
     MyThread myThread9 = new MyThread();
     myThread9.start();
     myThread9.join();
     MyThread myThread10 = new MyThread();
     myThread10.start();
     myThread10.join();

    }
}
class MyThread extends Thread {
    public void run() {
        int [] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.println(array[i] + " ");
        }
        //max
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Max is =" + max);
    }
}
/*
Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов,
затем находит максимальный элемент, в этом массиве, и выводит на экран в формате имя потока,
максимальный элемент. Запустить 10 потоков.
 */