public class Square {
    private double side;

    public void getSide() {
    }

    public void setSide(double side) throws PerimetrExeption {
        if (side <= 0){
            throw new PerimetrExeption("Side incorrect");

        }
        this.side = side;
    }

    public void getSide(int i) {
    }
}
/*
Написать собственное исключение от Exception. Сгенерировать код, который будет выбрасывать его и
обрабатывать. Результат работы программы вывести на экран.
 */