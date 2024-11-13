package com.mycompany.th12;

public class BanDoc {

    private static int maBanDocBase = 10000;
    private int maBD;
    private String hoTen;
    private String diaChi;
    private int soDT;

    // Hàm khởi tạo không đối số
    public BanDoc() {
        this.maBD = maBanDocBase++;  // Sửa lại từ maBDBase thành maBanDocBase
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    // Hàm khởi tạo có tham số
    public BanDoc(String hoTen, String diaChi, int soDT) {
        this.maBD = maBanDocBase++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public int getMaBD() {
        return maBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    @Override
    public String toString() {
        return maBD + ", " + hoTen + ", " + diaChi + ", " + soDT;
    }

}
