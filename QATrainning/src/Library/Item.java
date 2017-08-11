package Library;

import java.util.ArrayList;

public class Item {

    public String ID;
    private String title;
    private String itemType;
    private String author;
    private int yearPublished;
    boolean isOut;

    public Item(String ID, String title, String itemType, String author, int yearPublished, boolean isOut) {
        this.ID = ID;
        this.title = title;
        this.itemType = itemType;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isOut=isOut;
    }



    ArrayList <Item> Item = new ArrayList<Item>();



    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Item " +
                "ID = " + ID +
                ", title = '" + title + '\'' +
                ", itemType = '" + itemType + '\'' +
                ", author = '" + author + '\'' +
                ", yearPublished = " + yearPublished +
                ' ';
    }
}
