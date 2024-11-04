package com.mycompany.th4;

import java.util.ArrayList;

public class Dictonary {

    private ArrayList<Word> tuDien;

    public Dictonary() {
        tuDien = new ArrayList<>();
        tuDien.add(new Word("001", "One", "Số 1"));
        tuDien.add(new Word("002", "Two", "Số 2"));
        tuDien.add(new Word("003", "Three", "Số 3"));
        tuDien.add(new Word("004", "Four", "Số 4"));
        tuDien.add(new Word("005", "Five", "Số 5"));
        tuDien.add(new Word("006", "Six", "Số 6"));
        tuDien.add(new Word("007", "Seven", "Số 7"));
        tuDien.add(new Word("008", "Eight", "Số 8"));
        tuDien.add(new Word("009", "Nine", "Số 9"));
        tuDien.add(new Word("010", "Ten", "Số 10"));

    }

    public Dictonary(ArrayList<Word> tuDien) {

    }

    public ArrayList<Word> getTuDien() {
        return tuDien;
    }

    public void setTuDien(ArrayList<Word> tuDien) {
        this.tuDien = tuDien;
    }

}
