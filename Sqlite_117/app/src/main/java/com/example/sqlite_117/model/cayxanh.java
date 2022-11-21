package com.example.sqlite_117.model;

public class cayxanh {
    private String tenkh,tentg,dactinh,maula;
    private float chiso;

    public cayxanh() {
    }

    public cayxanh(String tenkh, String tentg, String dactinh, String maula, float chiso) {
        this.tenkh = tenkh;
        this.tentg = tentg;
        this.dactinh = dactinh;
        this.maula = maula;
        this.chiso = chiso;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getDactinh() {
        return dactinh;
    }

    public void setDactinh(String dactinh) {
        this.dactinh = dactinh;
    }

    public String getMaula() {
        return maula;
    }

    public void setMaula(String maula) {
        this.maula = maula;
    }

    public float getChiso() {
        return chiso;
    }

    public void setChiso(float chiso) {
        this.chiso = chiso;
    }
}
