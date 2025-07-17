package org.example.book_management_system.model;

import org.example.chapter09_practice.Util.DateUtil;

public class Book {
    private int id;
    private String title;
    private String author;
    private String createdAt;
    private String updatedAt;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createdAt = DateUtil.now();
        this.updatedAt = DateUtil.now();
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCreatedAt() { return createdAt; }
    public String getUpdatedAt() { return updatedAt; }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
        this.updatedAt = DateUtil.now();
    }

    @Override
    public String toString() {
        return "Id: " + id
                + ", Title: " + title
                + ", Author: " + author
                + ", CreatedAt: " + createdAt
                + ", UpdatedAt: " + updatedAt;
    }
}
