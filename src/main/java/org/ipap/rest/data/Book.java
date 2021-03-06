package org.ipap.rest.data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Book {

    @NotBlank(message = "Name shouldn't be blank")
    private String name;

    @NotBlank(message = "Author shouldn't be blank")
    private String author;

    @Min(value = 1, message = "Pages should be minimum 1")
    private Integer pages;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.pages = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
