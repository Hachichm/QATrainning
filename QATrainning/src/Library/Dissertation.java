package Library;

public class Dissertation extends Item {

    private String topic;

    public Dissertation(String ID, String title, String itemType, String author, int yearPublished, boolean isOut, String topic) {
        super(ID, title, itemType, author, yearPublished, isOut);
        this.topic = topic;
    }

    public String getTopis() {
        return topic;
    }

    public void setTopis(String topic) {
        this.topic = topic;
    }
}
