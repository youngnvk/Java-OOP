package com.mycompany.th5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inThongTin() {
        System.out.printf("%-15s%-15s%-15s", this.hoTen, this.diaChi, this.ngaySinh);
    }

    @Override
    public String toString() {
        return hoTen + ", " + ngaySinh + ", " + diaChi;
    }
    
    public ThiSinh nhapThongTin(Scanner sc) {
        System.out.print("Nhap ho ten : ");
        String hoten = sc.nextLine();
        System.out.print("Nhap ngay sinh : ");
        String Ngaysinh = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        String diachi = sc.nextLine();
        return new ThiSinh(hoten, Ngaysinh, diachi);
    }
}
