abstract public class Appliances {
    protected int power;
    protected String performance;
    protected String name;
    }
    interface Category {
        String audio();
        String video();
        String kitchen();
    }
    interface Status {
    void on();
    void off();
    }
    class IceBox extends Appliances implements Category, Status {
        public boolean kitchen;

        public IceBox(){
        name = "Холодильник";

    }
    public IceBox(int power, String performance) {
        name = "Холодильник";
        this.power = power;
        this.performance = performance;
    }
        @Override
        public void on() {
            System.out.println("Включен");
        }
        @Override
        public void off() {
            System.out.println("Выключен");
        }
        @Override
        public String audio() {
            return null;
        }
        @Override
        public String video() {
            return null;
        }
        @Override
        public String kitchen() {
            return "Кухонный";
        }
        public static class Tv extends Appliances implements Category, Status {
        public Tv(){
            name = "Телевизор";
        }
        public Tv(int power, String performance){
            name = "Телевизор";
            this.power = power;
            this.performance = performance;
        }

            @Override
            public String audio() {
                return null;
            }

            @Override
            public String video() {
                return "Видео";
            }

            @Override
            public String kitchen() {
                return null;
            }

            @Override
            public void on() {
                System.out.println("Включен");

            }

            @Override
            public void off() {
                System.out.println("Выключен");

            }
        }
    }

/*
Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику. Создать несколько объектов
описанных классов, часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */