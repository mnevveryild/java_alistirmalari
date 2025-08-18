package Kalıtım;
// Main kısımda constructor oluşuturulursa eğer subclass larda da da oluşuturulması gerekir.
public class Akademisyen extends Calısan{
String bolum,gorevler;
String[] dersler;

    public Akademisyen(String adSoyad, String eposta, int telefon, String bolum, String gorevler, String[] dersler) {

        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.dersler = dersler;
    }


    }

