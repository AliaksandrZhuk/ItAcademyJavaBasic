public class Atm {
    private static int x100;
    private static int x50;
    private static int x20;

    public static void addMoney(int addnote100, int addnote50, int addnote20) {
        // Loading Atm

        addnote100 += x100;
        addnote50 += x50;
        addnote20 += x20;

    }

    static void askMoney(int requestCash) {
        if (requestCash % 10 != 0) {
            System.out.println("Wrong sum, pleas enter correct sum");
        } else {
            boolean firstAnswer;
            if (x100 * 100 + x50 * 50 + x20 * 20 >= requestCash) {
                firstAnswer = true;

            } else {
                firstAnswer = false;
                System.out.println("not enough money");
            }

        }

    }
}
/*
Создать класс описывающие Банкомат. Набор купюр,находящихся в банкомате,должен задаваться тремя свойствами:
количество купюр номиналом 20,50,100. Сделать методы для добавления денег в банкомат. Сделать метод,снимающий деньги.
С клавиатуры передается сумма денег. На экран- булевское значение. При снятии денег метод должен выводить на экран
каким количеством купюр и какого номинала выдается сумма. Создать конструктор с тремя параметрами: кол-вом купюр.
Прочее на ваше усмотрение.
 */