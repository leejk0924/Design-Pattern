package creatation.singleton.first;

public class SettingsSecond {
    // 객체를 만드는 비용이 적다면 미리 객체를 생성하여 동기화 과정을 사용하지 않을 수 있다.
    private static SettingsSecond INSTANCE = new SettingsSecond();

    private SettingsSecond(){}

    public static synchronized SettingsSecond getInstatnce(){
        if (INSTANCE == null) {
            INSTANCE = new SettingsSecond();
        }
        return INSTANCE;
    }
}
