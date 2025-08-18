package bolum06;

public class PalindromAsal {

    public static boolean Palindrom(int sayi){

        int ters = 0, orijinal = sayi;
        while (sayi != 0) {
            int basamak = sayi % 10;
            ters = ters * 10 + basamak;
            sayi /= 10;
        }
        return ters == orijinal;
    }

    // Asal sayı kontrol metodu
    public static boolean Asal(int sayi) {
        if (sayi <= 1) return false;
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) return false;
        }
        return true;
    }
    public static boolean AsalPalindrom(int sayi) {
        return Asal(sayi) && Palindrom(sayi);


    }


    public static void main (String [] args){
        System.out.println("Palindrom asal sayılar:");
        for (int i = 1; i <= 1000; i++) {
            if (AsalPalindrom(i)) {

                System.out.print(i + " ");


            }

        }
    }
}



