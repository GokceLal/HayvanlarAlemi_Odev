package org.example;

public class Kus extends Hayvan{
    int kanatUzunlugu;
    String gagaSekli;



    public Kus(String tur, int boy, String cins, String saldiriDurumu, String beslenme, String iskeletDurumu, String gozRengi, String ad, String ureme, String insanDurum, String degisim, String buyumeStili, int agirlik, String hareket, int kanatUzunlugu, String gagaSekli) {
        super(tur, boy, cins, saldiriDurumu, beslenme, iskeletDurumu, gozRengi, ad, ureme, insanDurum, degisim, buyumeStili, agirlik, hareket);
        this.kanatUzunlugu = kanatUzunlugu;
        this.gagaSekli = gagaSekli;
    }

    public int getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public String getGagaSekli() {
        return gagaSekli;
    }

    public void setGagaSekli(String gagaSekli) {
        this.gagaSekli = gagaSekli;
    }

    @Override
    public String toString() {
        return "Kus{" +
                "kanatUzunlugu=" + kanatUzunlugu +
                ", gagaSekli='" + gagaSekli + '\'' +
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
