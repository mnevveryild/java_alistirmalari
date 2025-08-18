package OOP;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ornek5Test {

    public static void main(String[] args){

        System.out.println("İsim , Soyisim , numara , vize ve final notlarını giriniz.");
        ornek5 ogr1 = new ornek5("melisa","vargas",211, 56.9,87.5);
        ogr1.hesapla();
        System.out.println(ogr1.bilgileriYazdir());
        ogr1.GectiMi();

        ornek5 ogr2 = new ornek5("ali","yakın",543, 43.1,32.2);
        ogr2.hesapla();
        System.out.println(ogr2.bilgileriYazdir());
        ogr2.GectiMi();

        ornek5 ogr3 = new ornek5();


        Scanner klavye = new Scanner(System.in);


        System.out.print("Adınızı girin: ");
        ogr3.name = klavye.nextLine();
        System.out.print("Soyadınızı girin: ");
        ogr3.surname = klavye.nextLine();
        System.out.print("Numaranızı girin: ");
        ogr3.number = klavye.nextInt();
        System.out.print("Vize notunu girin: ");
        ogr3.vize = klavye.nextDouble();
        System.out.print("Final notunu girin: ");
        ogr3.fınal = klavye.nextDouble();

        ogr3.hesapla();
        System.out.println(ogr3.bilgileriYazdir());
        ogr3.GectiMi();





    }
}
