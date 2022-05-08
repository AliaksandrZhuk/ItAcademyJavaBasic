import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<Person> people = Arrays.asList(
                new Person("Aliaksandr", "Zhuk", "26"),
                new Person("Aliaksa", "Zhak", "25") ,
                new Person("Aliaksan","Zhbk", "24"),
                new Person("Aliaksa","Zhck", "23"),
                new Person("Aliaks","Zhdk", "22"),
                new Person("Aliak","Zhek", "21"),
                new Person("Alia","Zhfk", "20"),
                new Person("Ali","Zhgk", "19"),
                new Person("Al","Zhkk", "18"),
                new Person("Alex","Zhlk", "26"),
                new Person("Ale","Zhmk", "25"),
                new Person("Ala","Zhmk", "24"),
                new Person("Alex","Zhuk", "26"),
                new Person("Dmitrij","Vareiko", "27"),
                new Person("Dmitri","Vareiko", "26"),
                new Person("Dmitr","Vareiko", "25"),
                new Person("Dmit","Vareiko", "24"),
                new Person("Dmi","Vareiko", "23"),
                new Person("Dm","Vareiko", "22"),
                new Person("Barak","Obama", "30"),
                new Person("Bara","Obama", "17"),
                new Person("Bar","Obama", "18"),
                new Person("Ba","Obama", "19"),
                new Person("Ekaterina","Mihajlova", "22"),
                new Person("Ekaterin","Mihajlova", "21"),
                new Person("Ekateri","Mihajlova", "20"),
                new Person("Ekater","Mihajlova", "19"),
                new Person("Ekate","Mihajlova", "18"),
                new Person("Ekat","Mihajlova", "17"),
                new Person("Eka","Mihajlova", "16"),
                new Person("Ek","Mihajlova", "15"),
                new Person("Aleksei","Apetenok", "29"),
                new Person("Alekse","Apetenok", "28"),
                new Person("Aleks","Apetenok", "27"),
                new Person("Alek","Apetenok", "26"),
                new Person("Ale","Apetenok", "25"),
                new Person("Al","Apetenok", "24"),
                new Person("Aleksei","Mihajlov", "29"),
                new Person("Aleksei","Vareiko", "29"),
                new Person("Aleksei","Zhuk", "29"),
                new Person("Aleksei","Obama", "22"),
                new Person("Aleksei","Don", "29"),
                new Person("Aleksei","Sinke", "23"),
                new Person("Aleksei","Zmih", "29"),
                new Person("Aleksei","Divin", "29"),
                new Person("Aleksei","Div", "23"),
                new Person("Aleksei","Di", "22"),
                new Person("Aleksei","Apete", "23"),
                new Person("Aleksei","Apeten", "17"),
                new Person("Aleksei","Mit", "29"),
                new Person("Victor","Mitsilovich", "29"),
                new Person("Victor","Mitsilovic", "28"),
                new Person("Victor","Mitsilovi", "27"),
                new Person("Victor","Mitsilov", "26"),
                new Person("Victor","Mitsilo", "25"),
                new Person("Victor","Mitsil", "24"),
                new Person("Victor","Mitsi", "23"),
                new Person("Victor","Mits", "22"),
                new Person("Victor","Mit", "21"),
                new Person("Victor","Mi", "20"),
                new Person("Victo","Mitsilovich", "29"),
                new Person("Vict","Mitsilovich", "28"),
                new Person("Vi","Mitsilovich", "27"),
                new Person("Victor","Sinkevichysis", "29"),
                new Person("Victor","Sinkevichysi", "28"),
                new Person("Victor","Sinkevichys", "27"),
                new Person("Victor","Sinkevichy", "26"),
                new Person("Victor","Sinkevich", "25"),
                new Person("Victor","Sinkevic", "24"),
                new Person("Victor","Sinkevi", "23"),
                new Person("Victor","Sinkev", "22"),
                new Person("Victor","Sinke", "21"),
                new Person("Victor","Sink", "20"),
                new Person("Victor","Sin", "19"),
                new Person("Victor","Si", "18"),
                new Person("Denis","Degtaryonakk", "16"),
                new Person("Denis","Degtaryonak", "17"),
                new Person("Denis","Degtaryona", "18"),
                new Person("Denis","Degtaryon", "19"),
                new Person("Denis","Degtaryo", "20"),
                new Person("Denis","Degtary", "21"),
                new Person("Denis","Degtar", "22"),
                new Person("Denis","Degta", "23"),
                new Person("Denis","Degt", "24"),
                new Person("Denis","Deg", "25"),
                new Person("Denis","De", "26"),
                new Person("Vitalij","Akademikasyvichus", "16"),
                new Person("Vitalij","Akademikasyvichu", "17"),
                new Person("Vitalij","Akademikasyvich", "18"),
                new Person("Vitalij","Akademikasyvic", "19"),
                new Person("Vitalij","Akademikasyvi", "20"),
                new Person("Vitalij","Akademikasyv", "16"),
                new Person("Vitalij","Akademikasy", "17"),
                new Person("Vitalij","Akademikas", "16"),
                new Person("Vitalij","Akademika", "20"),
                new Person("Vitalij","Akademik", "16"),
                new Person("Vitalij","Akademi", "16"),
                new Person("Vitalij","Akadem", "16"),
                new Person("Vitalij","Akade", "16"),
                new Person("Vitalij","Akad ", "16")
        );
        Collection<Person> under21 = people.stream().filter((person) -> person.getAge() < 21).toList();
        System.out.println("under21 = " + under21);
        Collection<Person> first4object = people.stream().limit(4).toList();
        System.out.println("first4object = " + first4object);
        Collection<Person> bySurname = people.stream().sorted((o1, o2) -> -o1.getSurname().compareTo(o2.getSurname())).toList();
        System.out.println(bySurname);
        Collection<Person> byName = people.stream().sorted((o1, o2) -> -o1.getName().compareTo(o2.getName())).toList();
        System.out.println(byName);
        //Collection<Person> col = people.stream().filter((person) -> person.contains("1")).toList();
        //System.out.println(col);
        // не знаю как все в коллекцию агрегировать


    }
}
/*
№1.
Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
а. печатает на экран значения в дюймах;
b. переводит значения в сантиметры;
c. печатает на экран сумму в сантиментах. (не сделано)

№2.
Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
a. выбирает объекты, возраст которых меньше 21;
b. распечатывает их на экран;
c. сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
d. берет 4 первых объекта;
e. формирует коллекцию из фамилий объектов;
f. агрегирует все в коллекцию.

№3.
Сгенерируйте List коллекцию целых чисел из n элементов от minValue до maxValue.
Определить, содержатся ли в данной коллекции числа, которые делятся и на 3, и на 5 с помощью stream
 */