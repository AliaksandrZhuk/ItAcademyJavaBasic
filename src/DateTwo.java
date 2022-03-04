public class DateTwo {
    protected int dayNumber = 0;

    public DateTwo(int dayNumber) {
        this.dayNumber = dayNumber ;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void displayDay() {
        if (dayNumber == 1) {
            System.out.println("Понедельник - учеба");
        }
        else if (dayNumber == 2) {
            System.out.println("Вторник - зал");
        }
        else if (dayNumber == 3) {
            System.out.println("Среда - зал");
        }
        else if (dayNumber == 4) {
            System.out.println("Четверг - учеба");
        }
        else if (dayNumber == 5) {
            System.out.println("Пятница - бассейн");
        }
        else if (dayNumber == 6) {
            System.out.println("Суббота - выходной");
        }
        else if (dayNumber == 7) {
            System.out.println("Воскресенье - выходной ");
        }
        else {
            System.out.println("Ошибка: такого дня недели нет");
        }
    }
}
