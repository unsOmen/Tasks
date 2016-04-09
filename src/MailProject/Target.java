package MailProject;

/**
 * Created by OmeN on 09.04.2016.
 */
public class Target {

    private static long currId;
    private long id;
    private String fio;
    private String address;

    public Target(String fio, String address) {
        this.id = currId++;
        this.fio = fio;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getAddress() {
        return address;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
