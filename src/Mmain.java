public class Mmain {
    public static void main(String[] args) {
        long n = 7893823445L;
        int sum = 0;
        while(n != 0){
            //Суммирование цифр числа
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum + " ");
    }

}
/*
Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */