public class Book  {

    private String name;
    private Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {

        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthorName() {
        return this.author.getAuthorFullName();
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setAge(int publishingYear) {
        this.publishingYear = publishingYear;
    }



}
