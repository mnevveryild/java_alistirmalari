package Denemeler.ÜniversiteYönetimSistemi;

public class Ogretmen extends Kisi{

    private String brans;

    public Ogretmen(String isim, String soyisim, String tc, int yas, String brans) {
        super(isim, soyisim, tc, yas);
        this.brans = brans;
    }

    @Override
    public void bilgileriYazdir() {
        System.out.printf("Öğretmen: "+ isim+" TC : "+ tc+"Yas: "+ yas+"Brans: "+brans);

    }
}
