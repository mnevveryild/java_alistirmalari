package Denemeler.Hastane;

public class Hasta extends Kisi implements RandevuAlabilir{

    private String hastalik;
    private RandevuDurumu randevuDurumu;

    public Hasta(String isim, long TC, int yas,String hastalik) {

        super(isim, TC, yas);
        this.hastalik =hastalik;
        this.randevuDurumu=RandevuDurumu.BEKLİYOR;
    }

    @Override
    public void bilgiYaz() {
        System.out.println("Hasta: "+getIsim()+" | Hastalık: "+hastalik+" |Randevu: "+randevuDurumu);

    }

    @Override
    public void randevuAl() {
        this.randevuDurumu = RandevuDurumu.AKTIF;
        System.out.println(getIsim()+ "için randevu oluşturuldu.");
    }
}
