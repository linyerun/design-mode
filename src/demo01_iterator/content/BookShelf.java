package demo01_iterator.content;

import java.util.ArrayList;
import java.util.List;

//书架
public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book getBookAt(int idx) {
        return books.get(idx);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    //使用了Factory Method(Chapter 4)
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
