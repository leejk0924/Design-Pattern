package ch01;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StaticInnerClassApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
//        StaticInnerClass staticInnerClass = StaticInnerClass.getInstance();
//        // 싱글톤을 깨뜨리는 1번째 방법 : 리플렉션 사용  (대응 불가)
//        Constructor<StaticInnerClass> constructor = StaticInnerClass.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClass staticInnerClass1 = constructor.newInstance();
//
//        System.out.println(staticInnerClass == staticInnerClass1);


        // 직렬화 & 역직렬화 사용
        // 자바는 오브젝트를 파일 형태로 디스크에 저장(직렬화)했다가 불러올 떄(역직렬화)
        StaticInnerClassSerializable staticInnerClassSerializable = StaticInnerClassSerializable.getInstance();
        StaticInnerClassSerializable staticInnerClassSerializable1 = null;
        // 직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("StaticInnerClassSerializable.obj"))) {
            out.writeObject(staticInnerClassSerializable);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("StaticInnerClassSerializable.obj"))) {
            staticInnerClassSerializable1 = (StaticInnerClassSerializable) in.readObject();
        }
        System.out.println(staticInnerClassSerializable == staticInnerClassSerializable1);
    }
}
