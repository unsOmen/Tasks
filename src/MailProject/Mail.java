package MailProject;

/**
 * Created by OmeN on 09.04.2016.
 */
public class Mail {

    private long id;
    private float weight;
    private String content;

    public Mail(long id, float weight, String content) {
        this.id = id;
        this.weight = weight;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public float getWeight() {
        return weight;
    }

    public String getContent() {
        return content;
    }
}
