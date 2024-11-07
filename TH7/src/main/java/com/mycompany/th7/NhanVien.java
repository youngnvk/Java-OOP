
package com.mycompany.th7;

public class NhanVien {
    private String id;
    private String hoten;

    public NhanVien() {
    }

    public NhanVien(String id, String hoten) {
        this.id = id;
        this.hoten = hoten;
    }

    public String getId() {
        return id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return id + "," + hoten;
    }
    public void hienThiThongTin(){
        System.out.printf("%-15s%-15s", this.id, this.hoten);
    }  
}
