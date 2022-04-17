

public class Exep {
    private ABC abc;
    public void foo(){
        try {
            abc.show();
        } catch (NullPointerException e){
            System.out.println("abc = null");
        }
    }
}
/*
Написать код, который выбрасывает NullPointerException.
Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать
описание данного исключения.
 */