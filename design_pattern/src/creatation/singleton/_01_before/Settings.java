package creatation.singleton._01_before;

public class Settings {
        private static Settings instance;
    private Settings() {
    }
    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
