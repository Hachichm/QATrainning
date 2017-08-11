package Library;

public class Magazine extends Item{

    private int issue;

    public Magazine(String ID, String title, String itemType, String author, int yearPublished, boolean isOut, int issue) {
        super(ID, title, itemType, author, yearPublished, isOut);
        this.issue = issue;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }
}
