import java.io.*;

public class Chisla {
    public static void main(String[] args) throws IOException {
        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("hello.dat")));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }
        for (int i=0; i<20; i++){
            a.writeInt(i);
        }

    }
}
/*
Записать с помощью Java в двоичный файл 20 случайных чисел.
Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
не сделан
 */