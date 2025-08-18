package Denemeler.ÜniversiteYönetimSistemi;

public class Ders {

    String dersSinifi;
    String dersAdi;
    String dersKodu;
    String dersKredisi;

    public Ders(String dersSinifi, String dersAdi, String dersKodu, String dersKredisi) {
        this.dersSinifi = dersSinifi;
        this.dersAdi = dersAdi;
        this.dersKodu = dersKodu;
        this.dersKredisi = dersKredisi;
    }

    public String toString(){
        return dersAdi + dersKodu + dersKredisi + dersSinifi;

    }
}
