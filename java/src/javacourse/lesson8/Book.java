package javacourse.lesson8;

public class Book {
    private String name;
    private Author author;
    private int yearPublisher;

    public Book(String name, Author author, int yearPublisher) {
        this.name = name;
        this.yearPublisher = yearPublisher;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
}
