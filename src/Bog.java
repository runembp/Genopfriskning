public class Bog {
    private String isbnNumber;
    private String title;
    private int publishedYear;

    public Bog(String isbnNumber, String title, int publishedYear) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return title + " - " + " Published: " + publishedYear + " ISBN: " + isbnNumber;
    }
}
