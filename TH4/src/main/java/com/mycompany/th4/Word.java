package com.mycompany.th4;

public class Word implements Comparable<Word> {

    private String id;
    private String en;
    private String vn;

    public Word() {
    }

    public Word(String id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public String getId() {
        return id;
    }

    public String getEn() {
        return en;
    }

    public String getVn() {
        return vn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public void hienThiThongTin() {
        System.out.printf("%-10s%-10s%-10s", getId(), getEn(), getVn());
    }

    @Override
    public String toString() {
        return id + "," + en + "," + vn;
    }

    @Override
    public int compareTo(Word o) {
        return getEn().compareToIgnoreCase(o.getEn());
    }
}