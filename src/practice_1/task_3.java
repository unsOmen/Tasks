package practice_1;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_3 {

    static class ATypeName {
        String name;

        public ATypeName(String s) {
            this.name = s;
        }

        String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        ATypeName tt = new ATypeName("myName");
        System.out.println("my name = " + tt.getName());
    }
}
