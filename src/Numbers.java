import java.io.File;
import java.io.IOException;

public class Numbers {
    public static void main(String[] args) throws IOException {


        File f1 = new File("./1.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getCanonicalPath());
    }
}
/*
Вывести список файлов и каталогов выбранного каталога на диске.
Файлы и каталоги должны быть распечатаны отдельно.
 */