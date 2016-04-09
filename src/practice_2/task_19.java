package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */
public class task_19 {

    static void outMassivStr(String... mass) {
        for(int i=0; i<mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    static void outMassivStr(Integer... mass) {
        for(int i=0; i<mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    public static void main(String[] args) {
        String[] massiv1 = {"str1", "str2", "str3"};
        outMassivStr(massiv1);

        outMassivStr("one", "two", "free");

        outMassivStr(new String[]{"1", "2", "3", "4"});

        outMassivStr(1,2,3,4,5,6,7,8,9,10);
    }
}
