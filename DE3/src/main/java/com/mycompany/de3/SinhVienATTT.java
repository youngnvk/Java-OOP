
package com.mycompany.de3;

public class SinhVienATTT extends Student{
    private double hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienATTT(double hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, Double diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }
    @Override
    public String hienThiThongTin(){
        super.hienThiThongTin();
        return super.hienThiThongTin()  + ", " + hocPhi;
    }
    
}
