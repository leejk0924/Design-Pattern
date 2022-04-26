package chapter_1.Classclass.newinstance;

public class NewInstance {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("chapter_1.Classclass.newinstance.SendAction");
            Action action = (Action) clazz.newInstance();
            action.execute();

            Class clazz1 = Class.forName("chapter_1.Classclass.newinstance.ReceiveAction");
            Action action1 = (Action) clazz1.newInstance();
            action1.execute();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }

}

/*
모든 자바는 object를 상속하기 때문에 Object로 리턴 (뭐가 들어올지 모르니까)


 */