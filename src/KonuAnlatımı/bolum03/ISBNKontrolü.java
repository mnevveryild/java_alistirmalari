package bolum03;

import java.util.Scanner;

public class ISBNKontrolü {
    public static void main(String[] args) {

        Scanner sayılar = new Scanner(System.in);
        System.out.println("Sayıları giriniz.");
        int d1 = sayılar.nextInt();
        int d2 = sayılar.nextInt();
        int d3 = sayılar.nextInt();
        int d4 = sayılar.nextInt();
        int d5 = sayılar.nextInt();
        int d6= sayılar.nextInt();
        int d7 = sayılar.nextInt();
        int d8 = sayılar.nextInt();
        int d9 = sayılar.nextInt();

        int d10=(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6  * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if(d10==10){
            System.out.println("ISBN numarası: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");


        }else
        System.out.println("ISBN numarası: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);








    }
}
