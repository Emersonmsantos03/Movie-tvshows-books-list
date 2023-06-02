package gerenciador.midias;

import java.util.ArrayList;

public class Book {

    private String author;
    private String name;
    private int releaseDate;
    private int parentalRating;
    private int pageNumber;

    public Book(String author, String name, int releaseDate, int parentalRating, int pageNumber) {
        this.author = author;
        this.name = name;
        this.releaseDate = releaseDate;
        this.parentalRating = parentalRating;
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getParentalRating() {
        return parentalRating;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    private ArrayList<Book> books = new ArrayList<Book>();

    public void adiciona(Book book) {
        this.books.add(book);
    }
}