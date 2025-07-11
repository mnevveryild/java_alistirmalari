package bolum06;

public class SüreCevirme {

    public static void convertMillis(long millis){
        long toplamSaniye=millis / 1000;
        long saat = toplamSaniye / 3600;
        long dakika = (toplamSaniye % 3600) / 60;
        long saniye = toplamSaniye % 60;
        System.out.println(millis + " milisaniye = " + saat + " saat, " + dakika + " dakika, " + saniye + " saniye");
    }


    public static void main (String[] args ) {

        convertMillis(7265000);
    }
}
