package creatation.singleton.Classclass.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApp {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("creatation.singleton.Classclass.reflection.Car");
        System.out.println("클래스 이름");
        System.out.println(clazz.getName());
        System.out.println();

        System.out.println("생성자 정보");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getName());
                if (i < (parameters.length - 1)) {
                    System.out.print(",");
                }
            }
            System.out.println(")");
        }
        System.out.println();

        System.out.println("필드정보");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("메소드 정보");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getName());
                if (i < (parameters.length - 1)) {
                    System.out.print(",");
                }
            }
            System.out.println(")");
        }
    }
}
