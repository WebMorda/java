package javacourse.lesson8;

public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void printBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthor().toString() + ": " + book.getName() + ": " + book.getYearPublisher());
            }
        }
    }

    public void printByName(String name){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getName().equals(name)){
                System.out.println(books[i].getName() + " by " + books[i].getAuthor().toString() + " was published in " + books[i].getYearPublisher());
            }
        }
    }

    public void changeYearByName(String name, int yearPublisher){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getName().equals(name)){
                books[i].setYearPublisher(yearPublisher);
            }
        }
    }
}
