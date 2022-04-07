package ch01;

public class StaticInnerClass {
    public StaticInnerClass() {
    }

    private static class SettingsHolder{
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();

    }

    public static StaticInnerClass getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
