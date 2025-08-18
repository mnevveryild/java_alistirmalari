package bolum03;

import java.util.Scanner;

public class haftanınGünü {

    public static void main(String[] args) {

        Scanner sayı = new Scanner(System.in);
        System.out.println("Bugün kaçıncı gündeyiz?");
        int bugün = sayı.nextInt();
        System.out.println("Kaç gün geçti?");
        int geçen = sayı.nextInt();



        int simdiki= (bugün + geçen) % 7 ;



        switch (simdiki) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 0:
                System.out.println("Pazar");
                break;
        }



    }

}
