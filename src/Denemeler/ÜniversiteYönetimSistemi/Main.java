package Denemeler.ÜniversiteYönetimSistemi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Kisi> kisiler = new ArrayList<>();
        Ogrenci ogr1 = new Ogrenci("Ayşe","Yılmaz", "234567865",21);
        ogr1.derseKayitOl(new Ders("Z45","Matematik","MAT101","4"));
        ogr1.derseKayitOl(new Ders("Z43","Fizik","FZK102","3"));

        Ogretmen ogretmen1 = new Ogretmen("Dr. Ahmet ","Kaya","33333333",45,"Bil.Müh.");
        kisiler.add(ogr1);
        kisiler.add(ogretmen1);

        for (Kisi k : kisiler) {
            k.bilgileriYazdir();
            System.out.println();
        }

        Dosya.Kaydet(kisiler, "kisiler.txt");
    }
}
