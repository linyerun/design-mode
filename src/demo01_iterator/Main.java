package demo01_iterator;

import demo01_iterator.content.Book;
import demo01_iterator.content.BookShelf;
import demo01_iterator.content.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("<<Lin>>"));
        bookShelf.appendBook(new Book("<<Ye>>"));
        bookShelf.appendBook(new Book("<<Run>>"));
        bookShelf.appendBook(new Book("<<GOGO>>"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
