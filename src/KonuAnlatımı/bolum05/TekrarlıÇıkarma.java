package bolum05;

import java.util.Scanner;

public class TekrarlıÇıkarma {

    public static void main (String[] args){

            int sayi1=(int)(Math.random()*16);
            int sayi2=(int)(Math.random()*16);

        Scanner klavye =new Scanner(System.in);
        System.out.println(sayi1 + "- " + sayi2 + "= ?");
        int cevap =klavye.nextInt();

        while(sayi1 - sayi2 != cevap){

            System.out.println("Yanlış cevap , tekrar deneyiniz.");
            System.out.println(sayi1 + "-" + sayi2 + "= ?");
            cevap =klavye.nextInt();

        }

        System.out.println("Bildiniz.");



    }
}
