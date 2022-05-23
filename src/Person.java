import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int yearOfBirth;

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withYearOfBirth(int yearOfBirth) {
            newPerson.yearOfBirth = yearOfBirth;
            return this;
        }

        public Person build(){
            return newPerson;
        }

        public static void main(String[] args) {
            Person myPerson = new Person.Builder()
                    .withName("Aliaksandr")
                    .withSurname("Zhuk")
                    .withYearOfBirth(1995)
                    .build();
        }
    }
}
/*
Создайте класс Person с полями: имя, фамилия, год рождения. Реализуйте у этого класса паттерн Строитель.
Введите поля с клавиатуры и заполните объект класса Person с помощью паттерна Строитель.
 */