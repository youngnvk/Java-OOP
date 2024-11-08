package com.mycompany.th10;

public class SinhVien {

    private String hoTen;
    private String maSV;
    private double diemHP;
    private double diemQT;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, double diemHP, double diemQT) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemHP = diemHP;
        this.diemQT = diemQT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemHP() {
        return diemHP;
    }

    public void setDiemHP(double diemHP) {
        this.diemHP = diemHP;
    }

    public double getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(double diemQT) {
        this.diemQT = diemQT;
    }

    public Double getDiemTB() {
        return 0.3 * diemQT + 0.7 * diemHP;
    }

    @Override
    public String toString() {
        return hoTen + ", " + maSV + ", " + diemHP + ", " + diemQT + ", " + getDiemTB();
    }

    public void hienThiThongTin() {
        System.out.printf("%-15s%-15s%-15.2f%-15.2f%-15.2f\n", hoTen, maSV, diemHP, diemQT, getDiemTB());
    }
}
