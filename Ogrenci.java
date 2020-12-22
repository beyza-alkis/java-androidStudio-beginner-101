package com.example.androidstudionotes;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int no;

    public Ogrenci(String ad, String soyad, int no) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getNo() {
        return no;
    }

    public void setAd(String ad) {
        if(ad.length()>=2) {
            this.ad = ad;
        }
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
