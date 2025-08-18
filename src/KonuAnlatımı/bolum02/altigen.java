package bolum02;

import java.util.Scanner;

public class altigen {

    public static void main(String[] args) {

        System.out.println("altıgenin kenar uzunluğunu giriniz");
        Scanner altigen = new Scanner(System.in);
        double kenar = altigen.nextDouble();

        double hesap= (Math.sqrt(27) / 2 ) * Math.pow(kenar,2);
        System.out.println("alan: " + hesap);
    }
}
