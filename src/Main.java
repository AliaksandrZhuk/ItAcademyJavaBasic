public class Main {
    public static void main(String[] args) {
        String str = "Тестовая,строка,,с несколькими,, запятыми,и ,не,только";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',') {
                n++;
            }
        }
            System.out.println("У нас есть " + n + " запятых");
        }
}
/*
Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
Подсчитать общее их количество.
 */