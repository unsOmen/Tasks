package practice_5;

/**
 * Created by OmeN on 06.04.2016.
 */

class TestPrivate {
    private String msg = "Message Test1";

    private void ChangeMsg(String s) {
        this.msg = s;
    }

    class Changer {
        void ChangeParentMsg(String s) {
            TestPrivate.this.ChangeMsg(s);
        }

        private String Msg() {
            return "CHANGEEEEEEEE!!!!!!!!!!!";
        }
    }

    Changer getChanger() {
        return new Changer();
    }

    String getMsg() {
        return msg;
    }
}
public class InnerClass_task_2 {

    public static void main(String[] args) {
        TestPrivate t1 = new TestPrivate();
        System.out.println(t1.getMsg());

        TestPrivate.Changer t2 = t1.getChanger();
        t2.ChangeParentMsg("Message WTF?");

        System.out.println(t1.getMsg());
    }
}
