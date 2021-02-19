package ru.job4j.pojo;

public class Book {
    private int page;
    private String name;

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public String getName() {
        return name;
    }

    public void setPage(int page) {
        this.page = page;
    }
}