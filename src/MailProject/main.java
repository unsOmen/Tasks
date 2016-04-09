package MailProject;

import java.util.ArrayList;

/**
 * Created by OmeN on 09.04.2016.
 */
public class main {

    public static ArrayList<Order> orders = new ArrayList<Order>();

    private static void printOreder() {
        for(Order o : orders) {
            o.print();
        }
    }

    private static void addOrder(Target sender, Target recipition, Mail mail) {
        orders.add(new Order(TypeOrder.CAR, sender, recipition, mail));
    }

    public static void main(String[] args) {
        Target sender = new Target("name_1", "address_1");
        Target recipition = new Target("name_2", "address_2");

        Mail mail = new Mail(0, 0.5f, "content_1");
        addOrder(sender, recipition, mail);

        printOreder();
    }
}
