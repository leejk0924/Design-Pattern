package ch01;

public class SettingsThird {
    private static volatile SettingsThird instance;

    public SettingsThird() {
    }

    public static SettingsThird getInstance() {
        if (instance == null) {
            synchronized (SettingsThird.class) {
                if (instance == null) {
                    instance = new SettingsThird();
                }
            }
        }
        return instance;
    }
}
/*
Thread는 class의 멤버변수의 자원에 접근할 수 있다.
이건 멤버변수가 Heap 메모리를 사용하기 때문에 가능한 부분이며, 여러 Thread가 공유자원에 접근하는 경우 동기화를 해줘야 한다.

synchronized는 두가지 형태로 사용가능하다.

인스턴스를 실제 필요한 구간에서만 사용할 수 있어서 유용하다.

 */