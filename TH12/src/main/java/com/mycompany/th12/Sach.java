package com.mycompany.th12;

public class Sach {

    private static int maSachBase = 10000; // Biến tĩnh để tạo mã sách duy nhất
    private int maSach; // Mỗi đối tượng sẽ có mã sách riêng
    private String tenSach;
    private String tacGia;
    private String chuyenNganh;
    private int namXuatBan;
    private int soLuong;

    public Sach() {
        this.maSach = maSachBase++;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }
    
    public int getMaSach() {
        return maSach;
    }
    
    public Sach(String tenSach, String tacGia, String chuyenNganh, int namXuatBan, int soLuong) {
        this.maSach = maSachBase++;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        setChuyenNganh(chuyenNganh); // Sử dụng phương thức set để kiểm tra chuyên ngành hợp lệ
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        switch (chuyenNganh.toUpperCase()) {
            case "KHTN":
                this.chuyenNganh = "KHTN";
                break;
            case "VH-NT":
                this.chuyenNganh = "VH-NT";
                break;
            case "CNTT":
                this.chuyenNganh = "CNTT";
                break;
            case "DTVT":
                this.chuyenNganh = "DTVT";
                break;
            case "ATTT":
                this.chuyenNganh = "ATTT";
                break;
            default:
                this.chuyenNganh = "Khác"; // Trường hợp không hợp lệ
        }
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return maSach + ", " + tenSach + ", " + tacGia + ", " + chuyenNganh + ", " + namXuatBan + ", " + soLuong;
    }
}
