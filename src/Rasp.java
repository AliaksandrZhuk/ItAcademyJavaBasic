public class Rasp {
    public static void main(String[] args) {
        int n ;
        switch (n = 4) {
            case 1:
                System.out.println("Понедельник- Учеба");
                break;
            case 2:
                System.out.println("Вторник- Зал");
                break;
            case 3:
                System.out.println("Среда- Бассейн");
                break;
            case 4:
                System.out.println("Четверг- Учеба");
                break;
            case 5:
                System.out.println("Пятница- Зал");
                break;
            case 6:
                System.out.println("Суббота- Выходной");
                break;
            case 7:
                System.out.println("Воскресенье- Выходной");
                break;
            default:
                System.out.println("Дня с таким номером не существует");
        }
    }
}
