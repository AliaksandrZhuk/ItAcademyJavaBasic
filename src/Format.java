import java.text.DecimalFormat;

public class Format {
    public static void main(String[] args) {
        int i = 20023143;
        System.out.printf("%,d", i);
    }

}
/*
Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа,
каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено как 20 023 143.
 */
