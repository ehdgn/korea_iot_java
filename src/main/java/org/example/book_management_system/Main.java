package org.example.book_management_system;

import org.example.book_management_system.exception.BookNotFoundException;
import org.example.book_management_system.model.Book;
import org.example.book_management_system.service.BookService;
import org.example.book_management_system.service.BookServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();

        // 도서 등록
        bookService.addBook(new Book(1,"Java","김동후"));
        bookService.addBook(new Book(2,"C","김동"));
        bookService.addBook(new Book(3,"Python","김후"));


        // 도서 전체 조회
        System.out.println("== 책 전체 조회 ==");
        List<Book> books = bookService.getAllBook();
        for (Book book: books) {
            System.out.println(book);
        }


        System.out.println("== 1번 책 수정 ==");

        // 도서 저자 수정
        try {
            bookService.updateBookAuthor(1,"후동김");
        } catch (BookNotFoundException e) {
            System.out.println("수정 실패: " + e.getMessage());
        }

        // 도서 ID로 조회
        Book book = bookService.getBookById(1);
        System.out.println(book);

        System.out.println("== 책 수정 실패 ==");

        // 수정 실패
        try {
            bookService.updateBookAuthor(6,"후동김");
        } catch (BookNotFoundException e) {
            System.out.println("수정 실패: " + e.getMessage());
        }


        System.out.println("== 책 단건 조회 실패 ==");

        try {
            bookService.getBookById(7);
        } catch (BookNotFoundException e) {
            System.out.println("조회 실패: " + e.getMessage());
        }


        System.out.println("== 책 삭제 ==");

        // 도서 삭제
        try {
            Book result = bookService.getBookById(2);
            System.out.println(result);

            bookService.deleteBook(2);
            System.out.println("책이 삭제되었습니다.");
        } catch (BookNotFoundException e) {
            System.out.println("삭제 실패: " + e.getMessage());
        }

        System.out.println("== 책 삭제 실패 ==");

        // 책 삭제 실패
        try {
            Book result = bookService.getBookById(1);
            System.out.println(result);

            bookService.deleteBook(7);
            System.out.println("책이 삭제되었습니다.");
        } catch (BookNotFoundException e) {
            System.out.println("삭제 실패: " + e.getMessage());
        }

        System.out.println("== 책 검색 ==");

        // 도서 제목으로 검색
        String searchTitle = "Java";
        List<Book> searchedBooks = bookService.findBookByTitle(searchTitle);

        System.out.println("검색된 책 목록: ");
        for (Book searchBook: searchedBooks) {
            System.out.println(searchBook);
        }
    }
}
