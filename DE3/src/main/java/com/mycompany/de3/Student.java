
package com.mycompany.de3;

public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private Double diemTB;

    public Student() {
    }

    public Student(String maSV, String hoTen, String ngaySinh, String gioiTinh, Double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }
    public String hienThiThongTin(){
         return  maSV + ", " + hoTen + ", " + ngaySinh + ", " + gioiTinh + ", " + diemTB;
    }
}
