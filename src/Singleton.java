import java.time.LocalDate;

public class Singleton {

    private static Singleton instanse;

    private Singleton() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }

    public static Singleton getInstance() {
        if (instanse == null) {
            instanse = new Singleton();
        }
        return instanse;
    }
}
/*
Создайте простейший сервис с методом, который выводит на экран текущую дату. Сделайте его Singleton и используйте
в основном теле программы.
 */
