package javacourse.lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        Library library = new Library(5);

        Author author1 = new Author("Ernst", "Junger");
        Book book1 = new Book("Storm of Steel", author1, 1920);

        Author author2 = new Author("Michel", "Pastoureau");
        Book book2 = new Book("Yellow: A History of a Color", author2, 2019);

        library.addBook(book1);

        library.addBook(book2);

        library.printBooks();

        book1.setYearPublisher(1921);

        library.printByName("Storm of Steel");

        library.changeYearByName("Yellow: A History of a Color", 2020);

        library.printByName("Yellow: A History of a Color");
    }
}
