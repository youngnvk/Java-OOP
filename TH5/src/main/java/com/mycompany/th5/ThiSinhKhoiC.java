package com.mycompany.th5;

import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh {

    private double diemVan;
    private double diemSu;
    private double diemDia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(double diemVan, double diemSu, double diemDia) {
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public ThiSinhKhoiC(double diemVan, double diemSu, double diemDia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public double getDiemSu() {
        return diemSu;
    }

    public double getDiemDia() {
        return diemDia;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public void setDiemSu(double diemSu) {
        this.diemSu = diemSu;
    }

    public void setDiemDia(double diemDia) {
        this.diemDia = diemDia;
    }

    public ThiSinhKhoiA nhapThongTinKhoiA(Scanner sc) {
        System.out.print("Nhap ho ten : ");
        String hoten = sc.nextLine();
        System.out.print("Nhap ngay sinh : ");
        String ngaysinh = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        String diachi = sc.nextLine();
        System.out.print("Nhap Diem Van : ");
        Double diemvan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap Diem Su : ");
        Double diemsu = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap Diem Dia : ");
        Double diemdia = Double.parseDouble(sc.nextLine());

        return new ThiSinhKhoiA(diemvan, diemsu, diemdia, hoten, ngaysinh, diachi);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15s%-15s%-15s%-15.2f%-15.2f%-15.2f\n",this.getHoTen(), this.getDiaChi(), this.getNgaySinh(),  this.diemVan, this.diemSu, this.diemDia);
    }

    @Override
    public String toString() {
        return super.toString() + diemVan + ", " + diemSu + ", " + diemDia;
    }

}
