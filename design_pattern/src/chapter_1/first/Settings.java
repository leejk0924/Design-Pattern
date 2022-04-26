package chapter_1.first;

public class Settings {
    private Settings(){}
    private static Settings instance;

    public static Settings getInstatnce(){
        if(instance == null){
            // 동시에 두 개의 쓰레드가 접근할 경우 2개의 new Setting()가 생성될 수 있다.
            instance = new Settings();
        }
        return instance;
    }
}
