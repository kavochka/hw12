import model.Author;
import model.Book;

public class App {
    public static void main(String[] args) {
        Author author = new Author("Aleksandr", "Pushkin");
        Author author2 = new Author("Robert", "Martin");
        Book book = new Book("Evgeniy Onegin", author, 1800);
        Book book2 = new Book("Game of thrones", author2, 2016);

        System.out.println(book2.getYear());
        book2.setYear(2020);
        System.out.println(book2.getYear());
    }

}