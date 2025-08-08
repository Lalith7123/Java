package design_patterns.behavioural.iterator;

public class Main {

    public static void main(String[] args) {

        BookCollection bookCollection = new BookCollection(5);

        bookCollection.addBook(new Book("Java", "Anand"));
        bookCollection.addBook(new Book("Spring", "Deepak"));
        bookCollection.addBook(new Book("JDBC", "Ram"));
        bookCollection.addBook(new Book("Microservices", "Mukesh"));

        BookIterator bookIterator = bookCollection.iterator();

        while (bookIterator.hasNext()){
            System.out.println(bookIterator.next());
        }

    }
}
