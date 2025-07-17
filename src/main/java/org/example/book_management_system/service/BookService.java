package org.example.book_management_system.service;

import org.example.book_management_system.model.Book;

import java.util.List;

public interface BookService {

    // 도서 등록
    void addBook(Book book);

    // 도서 전체 조회
    List<Book> getAllBook();

    // 도서 ID로 조회
    Book getBookById(int id);

    // 도서 저자 수정
    void updateBookAuthor(int id, String newAuthor);

    // 도서 삭제
    void deleteBook(int id);

    // 도서 제목으로 검색
    List<Book> findBookByTitle(String title);
}
