import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Textt {
    public static void main(String[] args) {
        String str = "0x7FFF <p id=p1> 0x7AAF <p id=p1>";
        Pattern pattern = Pattern.compile("0x\\p{XDigit}+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.start()+ " "+ matcher.end());
        }
    }
}
/*
Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
записанных по правилам Java, с помощью регулярных выражений. Результат работы метода выведите на экран.
 */