
package com.mycompany.th9;

public class CauThu {
    private String id;
    private String tenCauThu;
    private int namSinh;
    private String viTri;

    public CauThu() {
    }

    public CauThu(String id, String tenCauThu, int namSinh, String viTri) {
        this.id = id;
        this.tenCauThu = tenCauThu;
        this.namSinh = namSinh;
           if(viTri.equalsIgnoreCase("thu mon")){
            this.viTri = "thu mon";
        }
        else if(viTri.equalsIgnoreCase("hau ve")){
            this.viTri = "hau ve";
        }
        else if(viTri.equalsIgnoreCase("tien ve")){
            this.viTri = "tien ve";
        }
        else if(viTri.equalsIgnoreCase("tien dao")){
            this.viTri = "tien dao";
        }
        else{
            this.viTri = null;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenCauThu() {
        return tenCauThu;
    }

    public void setTenCauThu(String tenCauThu) {
        this.tenCauThu = tenCauThu;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        if(viTri.equalsIgnoreCase("thu mon")){
            this.viTri = "thu mon";
        }
        else if(viTri.equalsIgnoreCase("hau ve")){
            this.viTri = "hau ve";
        }
        else if(viTri.equalsIgnoreCase("tien ve")){
            this.viTri = "tien ve";
        }
        else if(viTri.equalsIgnoreCase("tien dao")){
            this.viTri = "tien dao";
        }
        else{
            this.viTri = null;
        }
    }
    @Override
    public String toString() {
        return id + ", " + tenCauThu + ", " + namSinh + ", " + viTri;
    }
    public void hienThiThongTin(){
        System.out.printf("%-15s%-15s%-15d%-15s\n", this.id, this.tenCauThu, this.namSinh, this.viTri);
    }
}
