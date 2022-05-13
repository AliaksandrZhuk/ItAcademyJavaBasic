import java.lang.reflect.Field;

public class Man {
    private int age;
    public String name;
    private int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
/*
Создать класс Man c произвольным набором полей и методов (не менее 3). Создать метод, который распечатает
информацию о классе (список методов и полей с их типами и доступностью) с помощью рефлексии.
Вызвать метод с помощью рефлексии из основной программы.
 */