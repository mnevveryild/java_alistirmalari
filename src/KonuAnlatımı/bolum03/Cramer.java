package bolum03;

import java.util.Scanner;

public class Cramer {

    public static void main(String[] args) {

        System.out.println(" lütfen a,b,c,d,e,f değerlerini giriniz");
        Scanner sayilar= new Scanner(System.in);
        double a = sayilar.nextDouble();
        double b = sayilar.nextDouble();
        double c = sayilar.nextDouble();
        double d = sayilar.nextDouble();
        double e = sayilar.nextDouble();
        double f = sayilar.nextDouble();

        double x= ((e*d) - (b*f)) / ((a*d) - (b*c));
        double y= ((a*f) - (e*c)) / ((a*d) - (b*c));

        System.out.println("x "+ x + "y " + y );

    }


}
