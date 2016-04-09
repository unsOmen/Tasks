package practice_1;

/**
 * Created by OmeN on 20.03.2016.
 */
public class test_metka {

    public static void main(String[] args) {
        int i=0;
        outer:
        while(true) {
            inner:
            for(; i<10; i++) {
                print("i = " + i);
                if(i==2) {
                    print("continue");
                    continue;
                }
                if(i==3) {
                    print("break");
                    i++;
                    break;
                }
                if(i==7) {
                    print("continue other");
                    i++;
                    continue outer;
                }
                if(i==8) {
                    print("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k++) {
                    if(k==3) {
                        print("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }

    static void print(Object s) {
        System.out.println(s.toString());
    }
}
