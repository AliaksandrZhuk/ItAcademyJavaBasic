public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public int getHours() {
        return hours;
    }
    public int getSeconds(){
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }
    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public TimeInterval(int AllSeconds) {
        this.seconds = AllSeconds;
    }

    public int getAllSeconds() {
        return hours * 3600 +minutes * 60 + seconds;
    }
    public void printAllTime(){
        System.out.println("Object1 \\\\(only seconds\\\\) = \" + second");
    }
    public void printDividedTime() {
        System.out.println("Object2 have %s hours, %s minutes, %s seconds\", hours, minutes, seconds");
    }

    public int compareTime() {
        if (this.seconds>=getAllSeconds()){
            System.out.println("Object 1 >= Object 2");
        }else {
            System.out.println("Object 1< Object 2");
        }
        return this.seconds = getAllSeconds();
    }

}
/*Создать класс описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте,
сравнения двух объектов (метод должен работать аналогично compareTo в строках).
Создать два конструктора:  получающий общее количество секунд получающий часы, минуты и секунды по отдельности.
Сделать метод для вывода данных. Прочее на ваше усмотрение.
*/