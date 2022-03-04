public class Dengi {
    public static void main(String[] args) {
        String str = null;
        int cash = 1003;
        int money;
        if (cash % 100 > 9 && cash % 100 < 21) {
            money = 8;
        } else {
            money = cash % 10;
        }

        switch (money) {
            case 1:
                str = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                str = "рубля";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                str = "рублей";
                break;
        }
        System.out.printf("%,d %s%n", cash, str);
    }
}
