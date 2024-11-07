
package com.mycompany.th7;

public class GiangVien extends NhanVien{
    private String maGV;
    private String diaChi;
    private String gioiTinh;
    private String khoa;

    public GiangVien() {
    }

    public GiangVien(String maGV, String diaChi, String gioiTinh, String khoa) {
        this.maGV = maGV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public GiangVien(String maGV, String diaChi, String gioiTinh, String khoa, String id, String hoten) {
        super(id, hoten);
        this.maGV = maGV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        if(khoa.compareToIgnoreCase("DTVT") == 0){
            this.khoa = "DTVT";
        }
        else if(khoa.compareToIgnoreCase("CNTT") == 0){
            this.khoa = "CNTT";
        }
        else if(khoa.compareToIgnoreCase("ATTT") == 0){
            this.khoa = "ATTT";
        }
        else if(khoa.compareToIgnoreCase("MM") == 0){
            this.khoa = "MM";
        }
        else{
            this.khoa = "CB";
        }
    }

    public String getMaGV() {
        return maGV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + maGV + ", " + diaChi + ", " + gioiTinh + "," + khoa;
    }
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.printf("%-15f%-15f%-15f%-15s", this.maGV, this.diaChi, this.gioiTinh, this.khoa);
    }
}
