package javacourse.lesson9;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublisher;

    public Book(String name, Author author, int yearPublisher) {
        this.name = name;
        this.yearPublisher = yearPublisher;
        this.author = new Author(author.getFirstName(), author.getLastName());
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

    @Override
    public String toString(){
        return "Book: " + name + " by " + author.toString();
    }

    @Override
    public boolean equals(Object object){
        if (this.getClass() != object.getClass()){
            return false;
        }

        Book b2 = (Book) object;
        return this.name.equals(b2.name);
    }

    @Override
    public  int hashCode(){
        return Objects.hash(name);
    }
}
