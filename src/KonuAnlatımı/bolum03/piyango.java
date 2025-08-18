package bolum03;

import java.time.Clock;
import java.util.Scanner;

public class piyango {

    public static void main(String[] args) {

        int sayi1 = (int) (Math.random() * 1000);
        int birler= sayi1 % 10;
        int onlar = (sayi1 % 100) / 10;
        int yüzler = sayi1 / 100;

        System.out.println(sayi1);



        Scanner sayı = new Scanner(System.in);
        System.out.println("3 basamaklı sayıyı giriniz.");
        int number1 = sayı.nextInt();
        int birler2= number1 % 10;
        int onlar2 = (number1 % 100) / 10;
        int yüzler2 = number1 / 100;


        if(sayi1==number1){
            System.out.println("Tebrikler! 10 000 Tl kazandınız.");

        }else if (birler == birler2 && onlar == onlar2 && yüzler == yüzler2 ) {
            System.out.println("Tebrikler! 3 000 Tl kazandınız.");

        }else if(birler==birler2 || onlar==onlar2 || yüzler==yüzler2){
            System.out.println("Tebrikler! 1 000 Tl kazandınız.");
        }else{
            System.out.println("Kazanamadınız.");

        }


    }


    }


