package org.example;

public class Hayvan {
    String tur;
    int boy;
    String cins;
    String saldiriDurumu;
    String beslenme;
    String iskeletDurumu;
    String gozRengi;
    String ad;
    String ureme;
    String insanDurum;
    String degisim;
    String buyumeStili;
    int agirlik;
    String hareket;

    public Hayvan() {
    }

    public Hayvan(String tur, int boy, String cins, String saldiriDurumu, String beslenme, String iskeletDurumu, String gozRengi, String ad, String ureme, String insanDurum, String degisim, String buyumeStili, int agirlik, String hareket) {
        this.tur = tur;
        this.boy = boy;
        this.cins = cins;
        this.saldiriDurumu = saldiriDurumu;
        this.beslenme = beslenme;
        this.iskeletDurumu = iskeletDurumu;
        this.gozRengi = gozRengi;
        this.ad = ad;
        this.ureme = ureme;
        this.insanDurum = insanDurum;
        this.degisim = degisim;
        this.buyumeStili = buyumeStili;
        this.agirlik = agirlik;
        this.hareket = hareket;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public String getSaldiriDurumu() {
        return saldiriDurumu;
    }

    public void setSaldiriDurumu(String saldiriDurumu) {
        this.saldiriDurumu = saldiriDurumu;
    }

    public String getBeslenme() {
        return beslenme;
    }

    public void setBeslenme(String beslenme) {
        this.beslenme = beslenme;
    }

    public String getIskeletDurumu() {
        return iskeletDurumu;
    }

    public void setIskeletDurumu(String iskeletDurumu) {
        this.iskeletDurumu = iskeletDurumu;
    }

    public String getGozRengi() {
        return gozRengi;
    }

    public void setGozRengi(String gozRengi) {
        this.gozRengi = gozRengi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getUreme() {
        return ureme;
    }

    public void setUreme(String ureme) {
        this.ureme = ureme;
    }

    public String getInsanDurum() {
        return insanDurum;
    }

    public void setInsanDurum(String insanDurum) {
        this.insanDurum = insanDurum;
    }

    public String getDegisim() {
        return degisim;
    }

    public void setDegisim(String degisim) {
        this.degisim = degisim;
    }

    public String getBuyumeStili() {
        return buyumeStili;
    }

    public void setBuyumeStili(String buyumeStili) {
        this.buyumeStili = buyumeStili;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getHareket() {

        return hareket;
    }

    public void setHareket(String hareket) {
        this.hareket = hareket;

    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "tur='" + tur + '\'' +
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
