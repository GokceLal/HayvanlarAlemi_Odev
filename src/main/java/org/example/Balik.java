package org.example;

public class Balik extends Hayvan{
    String pulKalinligi;
    String solungacGenisligi;



    public String getPulKalinligi() {
        return pulKalinligi;
    }

    public void setPulKalinligi(String pulKalinligi) {
        this.pulKalinligi = pulKalinligi;
    }

    public String getSolungacGenisligi() {
        return solungacGenisligi;
    }

    public void setSolungacGenisligi(String solungacGenisligi) {
        this.solungacGenisligi = solungacGenisligi;
    }

    public Balik(String tur, int boy, String cins, String saldiriDurumu, String beslenme, String iskeletDurumu, String gozRengi, String ad, String ureme, String insanDurum, String degisim, String buyumeStili, int agirlik, String hareket,String solungacGenisligi,    String pulKalinligi) {
        super(tur, boy, cins, saldiriDurumu, beslenme, iskeletDurumu, gozRengi, ad, ureme, insanDurum, degisim, buyumeStili, agirlik, hareket);
        this.solungacGenisligi = solungacGenisligi;
        this.pulKalinligi = pulKalinligi;
    }


    @Override
    public String toString() {
        return "Balik{" +
                "pulKalinligi='" + pulKalinligi + '\'' +
                ", solungacGenisligi='" + solungacGenisligi + '\'' +
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
