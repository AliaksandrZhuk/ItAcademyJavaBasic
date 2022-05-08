import java.util.Comparator;
import java.util.stream.DoubleStream;

public class Person {
    public String name;
    public String surname;
    public Integer age;

    public Person(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = Integer.valueOf(age);
    }

    public static DoubleStream stream() {
        return null;
    }

    public static void sort(Comparator<Person> comparing) {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public boolean contains(String s) {
        return false;
    }
}
/*
Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
a. выбирает объекты, возраст которых меньше 21;
b. распечатывает их на экран;
c. сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
d. берет 4 первых объекта;
e. формирует коллекцию из фамилий объектов;
f. агрегирует все в коллекцию.

 */