package MailProject;

/**
 * Created by OmeN on 09.04.2016.
 */
public class Order {

    private static long currId;
    private long id;
    private TypeOrder typeOrder;
    private Target sender;
    private Target recipient;
    private Mail mail;
    private StatusOrder statusOrder;

    public Order(TypeOrder typeOrder, Target sender, Target recipient, Mail mail) {
        this.id = currId++;
        this.typeOrder = typeOrder;
        this.sender = sender;
        this.recipient = recipient;
        this.mail = mail;
        this.statusOrder = StatusOrder.BEGINNING;
    }

    public TypeOrder getTypeOrder() {
        return typeOrder;
    }

    public Target getSender() {
        return sender;
    }

    public Target getRecipient() {
        return recipient;
    }

    public Mail getMail() {
        return mail;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public long getId() {
        return id;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }
}
