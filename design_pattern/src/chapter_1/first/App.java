package chapter_1.first;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Settings settings = Settings.getInstatnce();
        Settings settings1 = Settings.getInstatnce();
        System.out.println(settings != settings1);
        System.out.println(settings == Settings.getInstatnce());

        SettingsSecond settingsSecond = SettingsSecond.getInstatnce();
        SettingsSecond settingsSecond1 = SettingsSecond.getInstatnce();
        System.out.println(settingsSecond != settingsSecond1);
        System.out.println(settingsSecond == SettingsSecond.getInstatnce());


        SettingsThird settingsThird = SettingsThird.getInstance();
        SettingsThird settingsThird1 = SettingsThird.getInstance();
        System.out.println(settingsThird != settingsThird1);
        System.out.println(settingsThird == SettingsThird.getInstance());
        // 몇번을 호출하더라도 같은 인스턴스가 나온다.


    }
}

/*
싱글톤 패턴
인스턴스를 오직 한개만 제공하는 클래스

시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다.
인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요

but, 심각한 오류가 있음
멀티 쓰레드를 사용하여 동시 접근 시 안전하지 않음

 */