package org.example.book_management_system.service;

import org.example.book_management_system.exception.BookNotFoundException;
import org.example.book_management_system.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    private final List<Book> bookList = new ArrayList<>();


    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public List<Book> getAllBook() {
        return new ArrayList<>(bookList);
    }

    @Override
    public Book getBookById(int id) {
        for (Book book: bookList) {
            if(book.getId() == id ) {
                return book;
            }
        }
        throw new BookNotFoundException("책을 찾을 수 없습니다.");
    }

    @Override
    public void updateBookAuthor(int id, String newAuthor) {
        Book book = getBookById(id);
        book.setAuthor(newAuthor);
    }

    @Override
    public void deleteBook(int id) {
        Book bookTodelete = null;

        for (Book book: bookList) {
            if (book.getId() == id) {
                bookTodelete = book;
                break;
            }
        }

        if (bookTodelete == null) {
            throw new BookNotFoundException("책을 찾을 수 없습니다.");
        }

        bookList.remove(bookTodelete);
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        List<Book> result = new ArrayList<>();

        for (Book book: bookList) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }

        return result;
    }
}
