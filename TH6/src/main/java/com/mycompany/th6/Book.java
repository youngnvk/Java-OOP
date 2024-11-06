package com.mycompany.th6;

public class Book {

    private String id, authors, title;
    private Category category;

    public Book() {
    }

    public Book(String id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        if (category.compareToIgnoreCase("KHXH") == 0) {
            this.category = new Category(category);
        } else if (category.compareToIgnoreCase("KHTN") == 0) {
            this.category = new Category(category);
        } else if (category.compareToIgnoreCase("tap chi") == 0) {
            this.category = new Category(category);
        } else if (category.compareToIgnoreCase("luan van") == 0) {
            this.category = new Category(category);
        }
    }

    public String getId() {
        return id;
    }

    public String getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = new Category(category);
    }

    @Override
    public String toString() {
        return id + ", " + authors + ", " + title + ", " + category.getType();
    }

    public void hienThiThongTin() {
        System.out.printf("%-15s%-15s%-15s%-15s\n", this.id, this.authors, this.title, this.category.getType());
    }
}
