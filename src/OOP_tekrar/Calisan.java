package OOP_tekrar;

public class Calisan {
    int no;
    String isim;
    String soyisim;
    int tecrübe;
    int maas;

    public Calisan(int no, String isim, String soyisim, int tecrübe, int maas) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.tecrübe = tecrübe;
        this.maas = maas;
    }

    public void calisanBilgileriniGoster(){

        System.out.println("********CALISAN BİLGİLERİ**********");
        System.out.println("No     :"+ no);
        System.out.println("İsim   :"+ isim);
        System.out.println("Soyisim   :"+ tecrübe);

    }

    public void zamYap(int zamDegeri){
        System.out.println("Maasınıza"+ zamDegeri + "TL zam yapıldı.");
        System.out.println("Şuanki güncel maaşınız "+ (maas+zamDegeri));

    }

    public void formatAt(String isletimSistemi, String kim){
        System.out.println(kim+ "şuanda "+ isletimSistemi+ "isletim sistemine format atıyor.");

    }
}


