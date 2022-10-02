package com.iesb.apibiblioteca.repository;

import com.iesb.apibiblioteca.model.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
