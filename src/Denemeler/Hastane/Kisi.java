package Denemeler.Hastane;
enum RandevuDurumu { BEKLİYOR,AKTIF,İPTAL_EDİLDİ }

abstract class Kisi {
    private String isim;
    private long TC;
    private int yas;

    public Kisi(String isim,long TC, int yas) {
        this.TC = TC;
        this.yas = yas;
        this.isim = isim;
    }

    public long getTC() {
        return TC;
    }

    public void setTC(long yeniTC) {
        this.TC = yeniTC;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yeniyas) {
        this.yas = yeniyas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String Yeniisim) {
        this.isim = Yeniisim;
    }

    public abstract void bilgiYaz();
}
