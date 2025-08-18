package Denemeler.ÜniversiteYönetimSistemi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Dosya {

    public static void Kaydet(List<Kisi> kisiler , String dosyaAdi) {
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter(dosyaAdi));
            for (Kisi k : kisiler){
                if (k instanceof Ogrenci){
                    bw.write("Ogrenci " +k.isim + " , "+ k.tc+ " , "+ k.yas+" \n ");

                }else if (k instanceof Ogretmen){
                    Ogretmen og = (Ogretmen) k;
                    bw.write("Ogretmen " +k.isim + " , "+ k.tc+ " , "+ k.yas+ " , "+" \n ");
                }
            }
            System.out.printf(" Veriler "+ dosyaAdi+" dosyasına kaydedildi.");
        }catch (IOException e){
            System.out.println("Dosya yazma hatası : "+ e.getMessage());
        }


    }
}
