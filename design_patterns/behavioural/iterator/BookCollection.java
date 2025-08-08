package design_patterns.behavioural.iterator;

public class BookCollection {

    private final Book[] books;
    private int index;

    public BookCollection(int size){
        books = new Book[size];
    }

    public void addBook(Book book){
        this.books[index++] = book;
    }

    public BookIterator iterator(){
        return new Library(books);
    }

}
