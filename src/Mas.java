import static java.lang.System.out;

public class Mas {
    public static void main(String[] args) {
        int array [][]=new int[5][5];
        int i,j;


        for (i=0;i<array.length/2+1;i++){
            for (j=0;j<array[i].length;j++){
                if ((j<i) || (j>=(array[i].length-i)))
                    array[i][j]=0;
                else
                    array[i][j]=1;

            }

        }
        for (i=array.length-1; i>=array.length/2+1; i--){
            for (j=0; j<array[i].length; j++){
                if ((j<(array[i].length-1-i)) || (j>i))
                    array[i][j]=0;
                else
                    array[i][j]=1;}
        }
        for (i=0;i<array.length;i++){
            for(j=0;j<array[i].length;j++){
                out.print(array[i][j]);
            }
            out.println(" ");
        }
    }


}
/*
Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1

 */