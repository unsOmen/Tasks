package practice_5;

/**
 * Created by OmeN on 06.04.2016.
 */

class Outer {

    private String name;
    private String msg;
    {
        this.name = "class_Outer";
        this.msg = "Hello, World!!";
    }

    class Inner {
        private String name;
        {
            this.name = "class_Inner";
        }

        String getName() {
            return this.name;
        }

        String getMsg() {
            return msg + " " + Outer.this;
        }

        Outer getParent() {
            return Outer.this;
        }

        @Override
        public boolean equals(Object o) {
            Inner tt = (Inner) o;
            if (this.getName() == tt.getName()) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Inner inner = (Inner) o;

            return name.equals(inner.name);

        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

    String getName() {
        return this.name;
    }

    Inner getInner() {
        return new Inner();
    }

    Outer getParent() {
        return this;
    }
}

public class InnerClass {

    public static void main(String[] args) {
        Outer outer_1 = new Outer();
        System.out.println(outer_1.getName() + " " + outer_1.getParent());

        Outer.Inner inner_1 = outer_1.getInner();
        System.out.println(inner_1.getName() + " " + inner_1.getParent());

        Outer.Inner inner_2 = new Outer().getInner();
        System.out.println(inner_2.getName() + " " + inner_2.getParent());

        System.out.println(inner_1.getMsg());
        System.out.println(inner_2.getMsg());

        System.out.println(outer_1.getClass() + " " + outer_1.getParent());
        System.out.println(inner_1.getClass() + " " + inner_1.getParent());
        System.out.println(inner_2.getClass() + " " + inner_2.getParent());

        System.out.println(inner_1.equals(inner_2));
    }
}
