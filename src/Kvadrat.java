public class Kvadrat {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int r = 8;
        if (r * r >= (a * a + b * b) / 4) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}