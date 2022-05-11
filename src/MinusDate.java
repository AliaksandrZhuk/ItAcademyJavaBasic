import java.time.LocalDate;

public class MinusDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата : " + today);
        System.out.println("Минус 60 дней : " + today.minusDays(60));
    }
}
/*
От текущей даты вывести на экран дату, которая была 60 дней назад.
 */