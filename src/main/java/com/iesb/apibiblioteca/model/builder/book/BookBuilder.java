package com.iesb.apibiblioteca.model.builder.book;

import com.iesb.apibiblioteca.model.book.Book;
import com.iesb.apibiblioteca.model.security.User;
import org.springframework.lang.Nullable;

public class BookBuilder {

    private final Book book;


    private BookBuilder() {
        book = new Book();
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public BookBuilder withName(final String name) {
        book.setName(name);
        return this;
    }

    public BookBuilder withPages(final Long pages) {
        book.setPages(pages);
        return this;
    }

    public BookBuilder withRented(final Boolean isRented) {
        book.setIsRented(isRented);
        return this;
    }

    public BookBuilder withLanguage(final String language) {
        book.setLanguage(language);
        return this;
    }

    public BookBuilder withAuthor(final String author) {
        book.setAuthor(author);
        return this;
    }

    public BookBuilder withPublishingCompany(final String publishingCompany) {
        book.setPublishingCompany(publishingCompany);
        return this;
    }

    public BookBuilder withUser(@Nullable User user) {
        book.setUser(user);
        return this;
    }

    public Book build(){
        return book;
    }

}
