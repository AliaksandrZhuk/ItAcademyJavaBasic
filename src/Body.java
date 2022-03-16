public class Body {
    public static void main(String[] args) {
        long sum = 1;
        long i =1;
        do {
            sum = sum * i;
            i++;
            System.out.println(sum);

        } while ( i <= 25);
    }
}

/*
Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
long a = 1;
        for (int i = 2; i <= 25; i++) {
            a = a * i;}
            System.out.println(a);
        }
    }
 */