package com.mycompany.th;

import java.util.Scanner;

public class Phieu {

    private String sophieu;
    private String ngaylap;
    private String tennguoilap;
    private ThietBi[] thietbis;
    private PhongHoc phonghoc;
    private int sltb;

    public Phieu() {}

    public Phieu(String sophieu, String ngaylap, String tennguoilap, ThietBi[] thietbis, int sltb) {
        this.sophieu = sophieu;
        this.ngaylap = ngaylap;
        this.tennguoilap = tennguoilap;
        this.thietbis = thietbis;
        this.sltb = sltb;
    }

    public String getSophieu() {
        return sophieu;
    }

    public void setSophieu(String sophieu) {
        this.sophieu = sophieu;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getTennguoilap() {
        return tennguoilap;
    }

    public void setTennguoilap(String tennguoilap) {
        this.tennguoilap = tennguoilap;
    }

    public ThietBi[] getThietbis() {
        return thietbis;
    }

    public void setThietbis(ThietBi[] thietbis) {
        this.thietbis = thietbis;
    }

    public int getSltb() {
        return sltb;
    }

    public void setSltb(int sltb) {
        this.sltb = sltb;
    }

    public int tinhTong() {
        int sum = 0;
        for (int i = 0; i < sltb; i++) {
            sum += thietbis[i].thanhTien();
        }
        return sum;
    }

    public void nhapThongTinPhieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phieu: ");
        setSophieu(sc.nextLine());
        System.out.print("Nhap ngay lap (dd/mm/yyyy): ");
        setNgaylap(sc.nextLine());
        System.out.print("Nhap ten nguoi lap: ");
        setTennguoilap(sc.nextLine());

        phonghoc = new PhongHoc();
        phonghoc.nhapPhongHoc();

        System.out.print("Nhap so luong thiet bi: ");
        String qty = sc.nextLine();
        setSltb(Integer.parseInt(qty));

        thietbis = new ThietBi[sltb];
        for (int i = 0; i < sltb; i++) {
            thietbis[i] = new ThietBi();
            thietbis[i].nhapThietBi();
        }
    }

    public void hienThiThongTin() {
        System.out.printf("\tKHOA CONG NGHE THONG TIN\n");
        System.out.printf("\t\tSo phieu: %s\n", sophieu);
        phonghoc.hienThiThongTin();
        System.out.println("Ngay lap: " + ngaylap);
        System.out.printf("%-30s%-30s %-30s %-30s %-30s %-30s %-30s\n", "STT", "Ten Thiet Bi", "Hang SX - Nuoc SX", "Ngay Nhap", "So Luong", "Don Gia", "Thanh Tien");
        for (int i = 0; i < sltb; i++) {
            thietbis[i].hienThiThongTin(i + 1);
        }
        System.out.println("Tong tien: " + tinhTong() + " VND");
        System.out.println("Ha Noi, ngay.... thang...nam 20..");
        System.out.println("Nguoi lap: " + tennguoilap);
    }
}
