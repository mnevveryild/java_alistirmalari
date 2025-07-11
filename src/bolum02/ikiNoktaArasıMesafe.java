package bolum02;

import java.util.Scanner;

public class ikiNoktaArasıMesafe {

    public static void main(String[] args){

        Scanner yeni = new Scanner(System.in);
        System.out.println("Lütfen x1 değerini giriniz.");
        double x1 = yeni.nextDouble();
        System.out.println("Lütfen y1 değerini giriniz.");
        double y1 = yeni.nextDouble();
        System.out.println("Lütfen x2 değerini giriniz.");
        double x2 = yeni.nextDouble();
        System.out.println("Lütfen y2 değerini giriniz.");
        double y2 = yeni.nextDouble();

        double hesap = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("x1 ve y1: (" + x1 + ", " + y1 + ")");
        System.out.println("x2 ve y2: (" + x2 + ", " + y2 + ")");
        System.out.println("İki nokta arasındaki mesafe: " + hesap);

    }
}
