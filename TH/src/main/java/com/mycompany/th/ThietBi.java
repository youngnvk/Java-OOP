package com.mycompany.th;

import java.util.Scanner;

public class ThietBi {

    private String tenThietBi;
    private String hangSX;
    private String nuocSX;
    private String ngayNhap;
    private int soLuong;
    private double donGia;

    public ThietBi() {
    }

    public ThietBi(String tenThietBi, String hangSX, String nuocSX, String ngayNhap, int soLuong, double donGia) {
        this.tenThietBi = tenThietBi;
        this.hangSX = hangSX;
        this.nuocSX = nuocSX;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double thanhTien() {
        return soLuong * donGia;
    }

    public void nhapThietBi() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten thiet bi: ");
        setTenThietBi(sc.nextLine());

        System.out.print("Nhap hang san xuat: ");
        setHangSX(sc.nextLine());

        System.out.print("Nhap nuoc san xuat: ");
        setNuocSX(sc.nextLine());

        System.out.print("Nhap ngay nhap (dd/MM/yyyy): ");
        setNgayNhap(sc.nextLine());

        System.out.print("Nhap so luong: ");
        setSoLuong(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap don gia: ");
        setDonGia(Double.parseDouble(sc.nextLine()));
    }

    public void hienThiThongTin(int i) {
        System.out.printf("%-30d%-30s %-30s %-30s %-30d %-30.3f %-30.3f\n", i, this.tenThietBi, this.hangSX + ", " + this.nuocSX, this.ngayNhap, this.soLuong, this.donGia, this.thanhTien());
    }
}
