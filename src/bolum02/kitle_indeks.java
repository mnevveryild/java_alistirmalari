package bolum02;

import java.util.Scanner;

public class kitle_indeks {
    public static void main(String[] args){




        Scanner yeni = new Scanner(System.in);
        System.out.println("Lütfen boy giriniz.");
        double boy= yeni.nextDouble();
        System.out.println("Lütfen kilo giriniz.");
        double kilo = yeni.nextDouble();

         double boy_yeni = 0.0254 * boy;
         double kilo_yeni= 0.45359237 * kilo;

         double hesap = kilo / Math.pow(boy,2);

         System.out.println("boy: "+ boy_yeni + "kilo: " +kilo_yeni + "VKİ" + hesap);

    }
}
