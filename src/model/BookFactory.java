package model;

public class BookFactory implements AbstractFactory<Book> {

    @Override
    public Book create(String bookType) {
        if ("AutoBiography".equalsIgnoreCase(bookType)) {
            return new AutoBiography();
        } else if ("Fiction".equalsIgnoreCase(bookType)) {
            return new Fiction();
        } else if ("Nonfiction".equalsIgnoreCase(bookType)) {
            return new Nonfiction();
        } else if ("Scifi".equalsIgnoreCase(bookType)) {
            return new Scifi();
        } else
            return null;
    }
}