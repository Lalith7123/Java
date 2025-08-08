package design_patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookIterator{

    private final Book[] books;
    private int index;

    public Library(Book[] books){
        this.books = books;
    }

    public boolean hasNext(){
        return books.length > 0 && index< books.length && books[index]!=null;
    }

    public Book next(){
        return books[index++];
    }
}
