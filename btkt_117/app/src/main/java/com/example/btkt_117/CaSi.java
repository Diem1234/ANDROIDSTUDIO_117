package com.example.btkt_117;

public class CaSi {
    private String ten;
    private String nghedanh;
    private String quocgia;
    private int sosao;
    private int hinh;

    public CaSi(String ten, String nghedanh, String quocgia, int sosao, int hinh) {
        this.ten = ten;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.sosao = sosao;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public int getSosao() {
        return sosao;
    }

    public void setSosao(int sosao) {
        this.sosao = sosao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
