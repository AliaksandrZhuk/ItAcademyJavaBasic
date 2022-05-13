import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Man man = new Man(); 1
        Class<Man> manClass = Man.class;
        Field[] declaredFields = manClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        Class<Man> manClass1 = Man.class;
        Method[] declaredMethods = manClass1.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        //2
        HelloWorld helloWorld = new HelloWorld();
        Class<HelloWorld> helloWorldClass = HelloWorld.class;
        Method[] methods = helloWorldClass.getMethods();
        for (Method method : methods){
            System.out.println(method);
        }
        Method printHelloWorld = helloWorldClass.getMethod("printHelloWorld");
        Object result = printHelloWorld.invoke(helloWorld);
        System.out.println(result);

        /*MyClass myClass = new MyClass();
        Class<MyClass> myClassClass1 = MyClass.class;
        Method[] methods1 = myClassClass1.getMethods();
        for (Method method : methods1){
            System.out.println(method);
        }*/
        //3
        Class<MyClass> myClassClass = MyClass.class;
        Annotation[] annotation = myClassClass.getAnnotations();
        System.out.println(annotation);

    }
}
/*
1. Создать класс Man c произвольным набором полей и методов (не менее 3). Создать метод, который распечатает
информацию о классе (список методов и полей с их типами и доступностью) с помощью рефлексии.
Вызвать метод с помощью рефлексии из основной программы.
2. Создайте класс с методом printHelloWorld(). Вызвать метод с помощью рефлексии из основной программы.
3. Создать собственную аннотацию @AcademyInfo c полем year. Создать метод, помеченный этой аннотацией с заданным year,
и метод без нее. С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */