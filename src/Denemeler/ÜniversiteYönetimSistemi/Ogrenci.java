package Denemeler.ÜniversiteYönetimSistemi;

import java.util.ArrayList;

public class Ogrenci extends Kisi{
    private ArrayList<Ders> dersler = new ArrayList<>();

    public Ogrenci(String isim, String soyisim, String tc, int yas) {
        super(isim, soyisim, tc, yas);

    }

    public void derseKayitOl(Ders ders){

        dersler.add(ders);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.printf("Ögrenci: "+isim+ "TC: "+ tc+ " Yas: "+yas);
        for (Ders d : dersler){
            System.out.println(" - "+ d);
        }
    }
}
