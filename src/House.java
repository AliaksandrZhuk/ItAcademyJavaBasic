public class House {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 2;
        int d = 2;
        int e = 5;
        int f = 5;
        boolean vlineiku = (e > (a + c)) & (f > (b+d));
        boolean drugnaddrugom = (e>(a+c)) & (f> (b+d));
        boolean pomestitsa = vlineiku | drugnaddrugom;
        if (pomestitsa) {
            System.out.print("дом 1 и дом 2 поместятся на участке");
        } else {
            System.out.print("дом 1 и дом 2 НЕ поместятся на участке");
        }

    }
}
