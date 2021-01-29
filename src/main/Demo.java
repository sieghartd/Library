package main;

import model.*;

public class Demo {

    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        AbstractFactory abstractFactory;
        Library library = new Library();

        abstractFactory = FactoryProvider.getFactory("Book");
        Book book1 = (Book) abstractFactory.create("Scifi");
        library.add(book1);
        Author author1 = new Author("Paul", "Pauly");

        book1.setTitle("Star trek vs Star wars");
        book1.setAuthor(author1);
        System.out.println(book1.getType());
        System.out.println(library.toString());
    }
}
