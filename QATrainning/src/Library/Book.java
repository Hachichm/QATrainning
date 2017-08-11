package Library;

public class Book extends Item {

    private String Genre;
    private String Lanaguage;

    public Book(String ID, String title, String itemType, String author, int yearPublished, boolean isOut, String genre, String lanaguage) {
        super(ID, title, itemType, author, yearPublished, isOut);
        Genre = genre;
        Lanaguage = lanaguage;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getLanaguage() {
        return Lanaguage;
    }

    public void setLanaguage(String lanaguage) {
        Lanaguage = lanaguage;
    }
}

