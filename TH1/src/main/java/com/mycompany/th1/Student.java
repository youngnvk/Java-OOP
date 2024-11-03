package com.mycompany.th1;

public class Student extends Person {

    private String maSV;
    private String email;
    private double diemTK;

    public Student() {
    }

    public Student(String maSV, String email, double diemTK) {
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public Student(String maSV, String email, double diemTK, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getEmail() {
        return email;
    }

    public double getDiemTK() {
        return diemTK;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDiemTK(double diemTK) {
        this.diemTK = diemTK;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.printf("%-22s%-22s%-22.02f\n", this.maSV, this.email,this.diemTK);
    }
}
