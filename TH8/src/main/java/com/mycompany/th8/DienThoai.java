
package com.mycompany.th8;

public class DienThoai extends HangHoa{
    private String nhaSanXuat;
    private int dungLuongBoNho;
    private String color;

    public DienThoai() {
    }

    public DienThoai(String nhaSanXuat, int dungLuongBoNho, String color) {
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.color = color;
    }

    public DienThoai(String nhaSanXuat, int dungLuongBoNho, String color, String maHang, String hoTen, int giaBan) {
        super(maHang, hoTen, giaBan);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuongBoNho = dungLuongBoNho;
        this.color = color;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getDungLuongBoNho() {
        return dungLuongBoNho;
    }

    public void setDungLuongBoNho(int dungLuongBoNho) {
        this.dungLuongBoNho = dungLuongBoNho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +  nhaSanXuat + ", " + dungLuongBoNho + ", " + color;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.printf("%-15s%-15d%-15s", this.nhaSanXuat, this.dungLuongBoNho, this.color);
    }
}
