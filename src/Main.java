import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца : ");
        if (in.hasNextInt()){
            int i = in.nextInt();
        } else {
            System.out.println("error");
        }
        LocalDate ld = LocalDate.of(2022, 5, 1);
        do {
            System.out.println(ld.format(DateTimeFormatter.ofPattern("dd::MM::yyyy")));
            ld = ld.plusDays(1);

        } while (ld.getDayOfMonth() > 1);

    }
}
/*
1. Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::uuuu.
2. От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
3. От текущей даты вывести на экран дату, которая была 60 дней назад.

 */