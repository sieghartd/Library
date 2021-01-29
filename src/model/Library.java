package model;

import java.util.LinkedList;

public class Library {

    public LinkedList<Book> bookList;

    public Library() {
        this.bookList = new LinkedList<>();
    }

    public void add(Book book) {
        this.bookList.add(book);
    }

    public LinkedList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(LinkedList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book : this.getBookList()) {
            sb.append("Title ").append(book.getTitle()).append("\n");
            sb.append("Author ").append(book.getAuthor()).append("\n");
            sb.append("Genre ").append(book.getType()).append("\n");

        }
        return sb.toString();
    }
}
