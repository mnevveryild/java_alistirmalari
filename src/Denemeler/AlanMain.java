package Denemeler;

import java.util.Date;

public class AlanMain {
    public static void main(String[] args){

        Kare kare1 = new Kare();
        kare1.kenar=6;
        kare1.Alanhesapla();

        Dikdörtgen dikdörtgen1 = new Dikdörtgen();
        dikdörtgen1.kenar1=4;
        dikdörtgen1.kenar2=6;
        dikdörtgen1.Alanhesapla();

        Daire daire1 = new Daire();
        daire1.yaricap=3;
        daire1.Alanhesapla();


    }
}
