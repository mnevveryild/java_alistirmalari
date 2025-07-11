package bolum07;
import java.util.Scanner;
public class NotVer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Kaç öğrenci notu gireceksiniz? ");
        int ogrenciSayisi = input.nextInt();

        int[] notlar = new int[ogrenciSayisi];
        int enYuksekNot = 0;


        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.print("Öğrenci " + (i + 1) + " notunu giriniz: ");
            notlar[i] = input.nextInt();
            if (notlar[i] > enYuksekNot) {
                enYuksekNot = notlar[i];
            }
        }


        System.out.println("\nSonuçlar:");
        for (int i = 0; i < ogrenciSayisi; i++) {
            char harfNotu;

            if (notlar[i] >= enYuksekNot - 10)
                harfNotu = 'A';
            else if (notlar[i] >= enYuksekNot - 20)
                harfNotu = 'B';
            else if (notlar[i] >= enYuksekNot - 30)
                harfNotu = 'C';
            else if (notlar[i] >= enYuksekNot - 40)
                harfNotu = 'D';
            else
                harfNotu = 'F';

            System.out.println("Öğrenci " + (i + 1) + ": Not = " + notlar[i] + ", Harf Notu = " + harfNotu);
        }
    }

}
