import java.lang.reflect.Method;

public class HelloWorld {
    public String printHelloWorld;

    public String getPrintHelloWorld() {
        return printHelloWorld;
    }

    public void setPrintHelloWorld(String printHelloWorld) {
        this.printHelloWorld = printHelloWorld;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "printHelloWorld='" + printHelloWorld + '\'' +
                '}';
    }
    public void printHelloWorld(){
        System.out.println("Hi");
    }
}
/*
Создайте класс с методом printHelloWorld(). Вызвать метод с помощью рефлексии из основной программы.
 */