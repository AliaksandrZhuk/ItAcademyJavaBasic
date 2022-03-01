import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        SimpleDateFormat formater = new SimpleDateFormat ("HH:mm:ss D ww");
        Date date = new Date(1212121212121L);
        System.out.println(formater.format(date));
    }
}
