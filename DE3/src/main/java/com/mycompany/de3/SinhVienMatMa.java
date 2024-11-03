
package com.mycompany.de3;

public class SinhVienMatMa extends Student {
    private double troCap;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(double troCap) {
        this.troCap = troCap;
    }

    public double getTroCap() {
        return troCap;
    }

    public void setTroCap(double troCap) {
        this.troCap = troCap;
    }
    @Override
    public String hienThiThongTin(){
        return super.hienThiThongTin() + ", " + troCap;
    }
}
