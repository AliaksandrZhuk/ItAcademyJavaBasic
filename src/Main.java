import IceBox.Tv;
abstract public class Main {
    public static void main(String[] args) {
        IceBox a = new IceBox();
        IceBox box = new IceBox(32, "Атлант");
        System.out.println(a.name);
        System.out.println(box.power);
        System.out.println(box.performance);
        System.out.println(a.kitchen);
        a.on();

        Tv b = new Tv();
        Tv c = new Tv(45,"LG");
        System.out.println(b.name);
        System.out.println(c.power);
        System.out.println(c.performance);
        System.out.println(b.video());
        b.on();

    }

    }
/*
Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику. Создать несколько объектов
описанных классов, часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */