
package com.mycompany.th10;

import java.util.ArrayList;

public class LopHoc {
    private ArrayList<SinhVien> DsSV;
    private String lop;

    public LopHoc() {
    }
    
    public LopHoc(ArrayList<SinhVien> DsSV, String lop) {
        this.DsSV = DsSV;
        this.lop = lop;
    }

    public ArrayList<SinhVien> getDsSV() {
        return DsSV;
    }

    public void setDsSV(ArrayList<SinhVien> DsSV) {
        this.DsSV = DsSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    @Override
    public String toString() {
        return DsSV + ", " + lop;
    }
    public void hienThiLopHoc(){
        for(SinhVien sv : DsSV){
            sv.hienThiThongTin();
        }
    }
}
