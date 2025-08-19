package OOP_tekrar.Encapsulation;

public class Calisan {

    //Constructor --- getter setter(kapsülleme)
    private long id;       //dışarıdan erişelemez
    private String isim;
    private String soyisim;
    private int maas;

    public Calisan(long id, String isim, String soyisim, int maas) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;    //private erişebilmek için
        this.maas = maas;
    }

    public long getId() {              // degeri çağırabilirsin
        return id;
    }

    public void setId(long id) {
        this.id = id;                    // deger verebilirsin
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}
