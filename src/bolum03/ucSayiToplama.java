package bolum03;

import java.util.Scanner;

public class ucSayiToplama {

    public static void main(String[] args) {

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        System.out.println(number1 + "+" + number2 + "+" + number3 + "= ? " );

        Scanner sayi = new Scanner(System.in);
        System.out.println("bu işlemin sonucu nedir?");
        int sonuc = sayi.nextInt();

        int dogruSonuc= number1 + number2 + number3 ;
        if(sonuc ==dogruSonuc){
            System.out.println("Tebrikler dogru cevap :)");
        }else
                System.out.println("Maalesef yanlış cevap :(");



    }

    }
