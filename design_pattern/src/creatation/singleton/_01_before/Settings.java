package creatation.singleton._01_before;

public class Settings {
        private static Settings instance;
    private Settings() {
    }
    public static Settings getInstance() {
        if (instance == null) {     // instance 가 만들어졌는지 확인하는 구문
            instance = new Settings();
        }
        return instance;
    }
}
