package com.mycompany.th;

import java.util.Scanner;

public class PhongHoc {

    private int phong;
    private String loaiphong;
    private int soTang;
    private int dienTich;

    public PhongHoc() {
    }

    public PhongHoc(int phong, String loaiphong, int soTang, int dienTich) {
        this.phong = phong;
        this.loaiphong = loaiphong;
        this.soTang = soTang;
        this.dienTich = dienTich;
    }

    public int getPhong() {
        return phong;
    }

    public void setPhong(int phong) {
        this.phong = phong;
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(String loaiphong) {
        this.loaiphong = loaiphong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public void nhapPhongHoc() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phong: ");
        setPhong(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap loai phong: ");
        setLoaiphong(sc.nextLine());

        System.out.print("Nhap so tang: ");
        setSoTang(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap dien tich (m2): ");
        setDienTich(Integer.parseInt(sc.nextLine()));

    }

    public void hienThiThongTin() {
        System.out.printf("Phong: %-10d Loai Phong: %-15s\n", phong, loaiphong);
        System.out.printf("Tang: %-10d Dien Tich: -5d(m2)\n", soTang, dienTich);
    }

}
