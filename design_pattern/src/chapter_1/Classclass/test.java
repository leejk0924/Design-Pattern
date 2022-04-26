package chapter_1.Classclass;

import chapter_1.Classclass.Car;

public class test {
    public static void main(String[] args) {
        Car car = new Car();
        Class clazz = car.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());

        try {
            Class clazz2 = Class.forName("chapter_1.Classclass.Car");  // forName은 예외처리가 필요한 메소드
            System.out.println(clazz.getName());
            System.out.println(clazz.getSimpleName());
            System.out.println(clazz.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
