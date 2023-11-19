package org.example;

public class Kedi extends Hayvan {
    String isim;
    String tuyRengi;
    int age;
    boolean vahsi;



    public Kedi(String tur, int boy, String cins, String saldiriDurumu, String beslenme, String iskeletDurumu, String gozRengi, String ad, String ureme, String insanDurum, String degisim, String buyumeStili, int agirlik, String hareket, String isim, String tuyRengi, int age, boolean vahsi) {
        super(tur, boy, cins, saldiriDurumu, beslenme, iskeletDurumu, gozRengi, ad, ureme, insanDurum, degisim, buyumeStili, agirlik, hareket);
        this.isim = isim;
        this.tuyRengi = tuyRengi;
        this.age = age;
        this.vahsi = vahsi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTuyRengi() {
        return tuyRengi;
    }

    public void setTuyRengi(String tuyRengi) {
        this.tuyRengi = tuyRengi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "isim='" + isim + '\'' +
                ", tuyRengi='" + tuyRengi + '\'' +
                ", age=" + age +
                ", vahsi=" + vahsi +
                ", tur='" + tur + '\'' +
                ", boy=" + boy +
                ", cins='" + cins + '\'' +
                ", saldiriDurumu='" + saldiriDurumu + '\'' +
                ", beslenme='" + beslenme + '\'' +
                ", iskeletDurumu='" + iskeletDurumu + '\'' +
                ", gozRengi='" + gozRengi + '\'' +
                ", ad='" + ad + '\'' +
                ", ureme='" + ureme + '\'' +
                ", insanDurum='" + insanDurum + '\'' +
                ", degisim='" + degisim + '\'' +
                ", buyumeStili='" + buyumeStili + '\'' +
                ", agirlik=" + agirlik +
                ", hareket='" + hareket + '\'' +
                '}';
    }
}





