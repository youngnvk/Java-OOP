
package com.mycompany.th8;

public class HangHoa {
    private String maHang;
    private String Ten;
    private int giaBan;

    public HangHoa() {
    }

    public HangHoa(String maHang, String hoTen, int giaBan) {
        this.maHang = maHang;
        this.Ten = hoTen;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getHoTen() {
        return Ten;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return maHang + ", " + Ten + ", " + giaBan;
    }
    public void hienThiThongTin(){
        System.out.printf("%-15s%-15s%-15d\n", this.maHang, this.Ten, this.giaBan);
    }
}
