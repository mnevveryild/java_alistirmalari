package Denemeler.ÜniversiteYönetimSistemi;

public abstract class Kisi {

    protected String isim;              // protected kullandık çünkü ;
    protected String soyisim;           // Bir sınıfın alt sınıflarının (yani miras alanların) o alanlara erişebilmesini istiyorum
    protected String tc;                // Ama diğer sınıfların erişmesini istemiyorum
    protected int yas;

    public Kisi(String isim, String soyisim, String tc, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tc = tc;
        this.yas = yas;
    }


    public abstract void bilgileriYazdir();
}
