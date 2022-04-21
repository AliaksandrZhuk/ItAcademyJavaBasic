import java.util.Objects;

public class Person {
    public String name, surname;
    public int age;
    public Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

}
/*
Создать объект Person c полями name, surname, age. Создать два массива (имена и фамили).
Сгенерировать 10 объектов класса Person со случайным age и случайно выбранными именами и фамилиями соответствующего типа.
С помощью Java создать файл, в который запишется информация о этих людях.
 */