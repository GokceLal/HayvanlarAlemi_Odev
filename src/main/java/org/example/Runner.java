package org.example;

public class Runner {
    public static void main(String[] args) {
     Hayvan hayvan = new Hayvan();
     Hayvan kedi = new Kedi("Ev Kedisi",60,"Tekir","pasif","hem etçil hem otcul",
             "Kemikli","Yeşil","Lokum","Doğurarak",
             "evcil","sevimlilik","karada",6,
             "karada","Lokum","Beyaz",6,false);
     Hayvan balik = new Balik("Süs Balığı",4,"Japon","pasif","hem etçil hem otçul"
     ,"iskelet","Siyah","Portakal","Yumurtlama","evcil"
     ,"süs hayvanı","suda",2,"suda","Küçük","İnce");
     Hayvan kus = new Kus("Kafes Kusu",23,"Muhabbet kuşu","pasif","ot","kemikli","Kahverengi"
     ,"Limon","Yumurta","evcil","karada ve havada","karada",2,"karada ve havada ",12,"Yuvarlak");
        Hayvan yilan = new Yilan("Yılan",34,"Kobra","vahşi","et","kıkırdak","siyah","X","Yumurta","Vahşi/Tehlikeli","Adaptasyon","karada",32,"karada","Pullu",2,true);
        System.out.println(kedi.toString());
        System.out.println("--------------");
        System.out.println(balik.toString());
        System.out.println("--------------");
        System.out.println(kus.toString());
        System.out.println("--------------");
        System.out.println(yilan.toString());




    }
    }
