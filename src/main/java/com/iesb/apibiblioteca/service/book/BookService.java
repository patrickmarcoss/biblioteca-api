package com.iesb.apibiblioteca.service.book;

import com.iesb.apibiblioteca.dto.book.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    BookDTO updateBook(Long id,BookDTO bookDTO);
    String deleteBook(Long bookId);
    List<BookDTO> getAllBooks();
}
