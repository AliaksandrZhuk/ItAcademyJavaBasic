import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Dateof {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата : " + today);
        System.out.println("Через 2 месяца дата : "+ today.plusMonths(2));

    }
}
/*
От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
 */