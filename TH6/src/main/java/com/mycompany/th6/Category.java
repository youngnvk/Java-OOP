package com.mycompany.th6;

public class Category {

    private String id, type;

    public Category() {
    }

    public Category(String type) {
        this.type = type;
    }

    public Category(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + ", " + type;
    }

    public void hienThiThongTin() {
        System.out.printf("%-15s%-15s\n", this.id, this.type);
    }
}
