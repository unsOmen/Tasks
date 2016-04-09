package practice_1;

import java.util.Date;

/**
 * Created by OmeN on 18.03.2016.
 */
public class task_4 {

    static class DateOnly {
        Date curr_date;

        public DateOnly() {
            this.curr_date = new Date();
        }

        Date getCurr_date() {
            return this.curr_date;
        }
    }

    public static void main(String[] args) {
        DateOnly tt = new DateOnly();
        System.out.print("curr. date = " + tt.getCurr_date());
    }
}
