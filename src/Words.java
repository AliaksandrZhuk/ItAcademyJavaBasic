import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static void main(String[] args) {
        String str = "Тестовая строка со словами";
        Pattern pattern = Pattern.compile("([а-яА-Я])\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
/*
Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
 */