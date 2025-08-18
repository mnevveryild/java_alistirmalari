package OOP_tekrar;

import java.util.Scanner;

public class deneme1 {

    public static void main(String[] args) {
        System.out.println("*************HOSGELDINIZ************");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" no degerini giriniz");
        int no = scanner.nextInt();

        System.out.println("isim giriniz ");
        String isim = scanner.next();

        System.out.println("soyisim giriniz ");
        String soyisim = scanner.next();

        System.out.println("tecrube giriniz ");
        int tecrube = scanner.nextInt();

        System.out.println("maas giriniz ");
        int maas = scanner.nextInt();

        Calisan calisan = new Calisan(no, isim,soyisim,tecrube,maas);

        String islemler = "1-Calısan bilgilerini göster\n" + "2-Zam yap"
        + "3-Format at" ;

        System.out.println("---------------------------");
        System.out.println(islemler);
        System.out.println("secim yapiniz  ");
        int secim = scanner.nextInt();

        scanner.nextLine();

        switch (secim){
            case 1:
                calisan.calisanBilgileriniGoster();
                break;
            case 2:
                System.out.println("zam degerini giriniz.");
                int zamDegeri = scanner.nextInt();
                scanner.nextLine();
                calisan.zamYap(zamDegeri);
                break;
            case 3:
                System.out.println("kim format atacak bilgilerini giriniz");
                String kisi = scanner.nextLine();

                System.out.println("isletim sistemini yazınız: ");
                String isletimSistemi = scanner.nextLine();
                calisan.formatAt(isletimSistemi, kisi);
                break;
            default:
                System.out.println("Belirtilen aralıkta bir seçim yapınız lütfen.");
                break;





        }

    }

}
