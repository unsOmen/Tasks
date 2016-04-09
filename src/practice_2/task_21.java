package practice_2;

/**
 * Created by OmeN on 21.03.2016.
 */

enum Money {
    RUB, DOLLAR, YENA, TENGE, EVRO, FUNTI;
}

class InfoMoney {
    Money m;

    InfoMoney(Money tt) {
        this.m = tt;
    }

    void getInfo() {
        switch (m) {
            case RUB:
                System.out.println("Name: " + m + ", Country: Russia");
                break;

            case DOLLAR:
                System.out.println("Name: " + m + ", Country: USA");
                break;

            case YENA:
                System.out.println("Name: " + m + ", Country: Japan");
                break;

            case TENGE:
                System.out.println("Name: " + m + ", Country: KZ");
                break;

            case EVRO:
                System.out.println("Name: " + m + ", Country: ALL EU");
                break;

            case FUNTI:
                System.out.println("Name: " + m + ", Country: England");
                break;
        }
    }
}
public class task_21 {
    public static void main(String[] args) {
        for(Money m : Money.values()) {
            System.out.println(m + ", ordinal " + m.ordinal());
        }

        InfoMoney rub = new InfoMoney(Money.RUB);
        InfoMoney dol = new InfoMoney(Money.DOLLAR);
        InfoMoney yen = new InfoMoney(Money.YENA);

        rub.getInfo();
        dol.getInfo();
        yen.getInfo();
    }
}
