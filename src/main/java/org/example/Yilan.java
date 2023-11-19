package org.example;

public class Yilan extends Hayvan{
    private String deriDurumu;
    private int dilUzunlugu;
    private boolean deriSoyulma;



    public Yilan(String tur, int boy, String cins, String saldiriDurumu, String beslenme, String iskeletDurumu, String gozRengi, String ad, String ureme, String insanDurum, String degisim, String buyumeStili, int agirlik, String hareket, String deriDurumu, int dilUzunlugu, boolean deriSoyulma) {
        super(tur, boy, cins, saldiriDurumu, beslenme, iskeletDurumu, gozRengi, ad, ureme, insanDurum, degisim, buyumeStili, agirlik, hareket);
        this.deriDurumu = deriDurumu;
        this.dilUzunlugu = dilUzunlugu;
        this.deriSoyulma = deriSoyulma;
    }

    public String getDeriDurumu() {
        return deriDurumu;
    }

    public void setDeriDurumu(String deriDurumu) {
        this.deriDurumu = deriDurumu;
    }

    public int getDilUzunlugu() {
        return dilUzunlugu;
    }

    public void setDilUzunlugu(int dilUzunlugu) {
        this.dilUzunlugu = dilUzunlugu;
    }

    public boolean isDeriSoyulma() {
        return deriSoyulma;
    }

    public void setDeriSoyulma(boolean deriSoyulma) {
        this.deriSoyulma = deriSoyulma;
    }

    @Override
    public String toString() {
        return "Yilan{" +
                "deriDurumu='" + deriDurumu + '\'' +
                ", dilUzunlugu=" + dilUzunlugu +
                ", deriSoyulma=" + deriSoyulma +
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
