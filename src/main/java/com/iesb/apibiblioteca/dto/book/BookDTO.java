package com.iesb.apibiblioteca.dto.book;

import com.iesb.apibiblioteca.model.book.Book;
import com.iesb.apibiblioteca.model.security.User;

import java.io.Serializable;

public class BookDTO implements Serializable {

    private Long pages;
    private String name;
    private Boolean isRented;
    private String language;
    private String author;
    private String publishingCompany;
    private User user;

    public BookDTO(final Book book) {
        pages = book.getPages();
        name = book.getName();
        isRented = book.getIsRented();
        language = book.getLanguage();
        author = book.getAuthor();
        publishingCompany = book.getPublishingCompany();
        user = book.getUser();
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(Boolean rented) {
        isRented = rented;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
