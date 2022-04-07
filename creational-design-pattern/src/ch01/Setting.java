package ch01;
// 구현 테스트
public class Setting {
    private Setting(){}

    private static class SettingHolder{
        private static final Setting INSTANCE = new Setting();
    }

    public static Setting getInstance() {
        return SettingHolder.INSTANCE;
    }

}
