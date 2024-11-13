package com.mycompany.th12;

public class QLMuonSach {

    private Sach sach;
    private BanDoc bandoc;
    private int soluong;

    public QLMuonSach() {
        this.sach = new Sach();
        this.bandoc = new BanDoc();
    }

    public QLMuonSach(Sach sach, BanDoc bandoc, int soluong) {
        this.sach = sach;
        this.bandoc = bandoc;
        this.soluong = soluong;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public Object[] toObject() {
        return new Object[]{sach.getMaSach(), sach.getTenSach(), bandoc.getMaBD(), bandoc.getHoTen(), soluong};
    }
}
