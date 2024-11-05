package com.mycompany.th5;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh {

    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(double diemToan, double diemLy, double diemHoa) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public ThiSinhKhoiA(double diemToan, double diemLy, double diemHoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    public ThiSinhKhoiA nhapThongTinKhoiA(Scanner sc) {
        System.out.print("Nhap ho ten : ");
        String hoten = sc.nextLine();
        System.out.print("Nhap ngay sinh : ");
        String ngaysinh = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        String diachi = sc.nextLine();

        System.out.print("Nhap Diem Toan : ");
        Double diemtoan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap Diem Ly : ");
        Double diemly = Double.parseDouble(sc.nextLine()); 
        System.out.print("Nhap Diem Hoa : ");
        Double diemhoa = Double.parseDouble(sc.nextLine());

        return new ThiSinhKhoiA(diemtoan, diemly, diemhoa, hoten, ngaysinh, diachi);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("%-15s%-15s%-15s%-15.2f%-15.2f%-15.2f\n",this.getHoTen(), this.getDiaChi(), this.getNgaySinh(),  this.diemToan, this.diemLy, this.diemHoa);
    }

    @Override
    public String toString() {
        return super.toString() + diemToan + ", " + diemLy + ", " + diemHoa;
    }

}
