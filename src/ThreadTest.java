public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MoThread moThread1 = new MoThread();
        moThread1.start();
        moThread1.join();
        MoThread moThread2 = new MoThread();
        moThread2.start();
        moThread2.join();
        MoThread moThread3 = new MoThread();
        moThread3.start();
        moThread3.join();
        MoThread moThread4 = new MoThread();
        moThread4.start();
        moThread4.join();
        MoThread moThread5 = new MoThread();
        moThread5.start();
        moThread5.join();
        MoThread moThread6 = new MoThread();
        moThread6.start();
        moThread6.join();
        MoThread moThread7 = new MoThread();
        moThread7.start();
        moThread7.join();
        MoThread moThread8 = new MoThread();
        moThread8.start();
        moThread8.join();
        MoThread moThread9 = new MoThread();
        moThread9.start();
        moThread9.join();
        MoThread moThread10 = new MoThread();
        moThread10.start();
        moThread10.join();

    }

}
class MoThread extends Thread{
    public void run() {
        setName("mythread");
        System.out.println(getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
Создать метод, который печатает название потока и засыпает на 2 секунды. Запустить одновременно 10 потоков.
Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
 */