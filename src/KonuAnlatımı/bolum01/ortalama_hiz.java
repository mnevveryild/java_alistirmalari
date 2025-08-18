package bolum01;

public class ortalama_hiz {

    public static void main(String[] args){
        double mesafe = 14.0;
        int dakika = 45;
        int saniye = 30;

        int toplam_süre= ((dakika * 60 ) + saniye) / 3600;

        double toplam_mesafe= mesafe / 1.6;

        double ortalama_hiz = toplam_mesafe/toplam_süre;

        System.out.println(ortalama_hiz);



    }
}
