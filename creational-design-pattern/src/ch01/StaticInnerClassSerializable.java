package ch01;

import java.io.Serializable;
// Serializable 인터페이스를 상속받으면 직렬화, 역직렬화 사용할 수 있다.
public class StaticInnerClassSerializable implements Serializable {
    private StaticInnerClassSerializable() {
    }

    private static class SettingsHolder{
        private static final StaticInnerClassSerializable INSTANCE = new StaticInnerClassSerializable();
    }

    public static StaticInnerClassSerializable getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 대응방안
    protected Object readResolve() {
        return getInstance();
    }
}
