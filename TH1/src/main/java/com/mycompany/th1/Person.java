package com.mycompany.th1;

import java.text.SimpleDateFormat;

public class Person {

    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void hienThiThongTin() {
        System.out.printf("%-22s%-22s%-22s%-22s", this.hoTen, this.ngaySinh, this.diaChi, this.gioiTinh);
    }
}
