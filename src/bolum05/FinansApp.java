package bolum05;

import java.util.Scanner;

public class FinansApp {

    public static void main (String[] args ){

        System.out.println("Okul  ücretini giriniz.");
        Scanner klavye = new Scanner(System.in);
        int ücret =klavye.nextInt();

        for (int yil=0; yil<10; yil++){

            ücret = ücret*95 /100;

        }
        int total=0;
        for (int yeniyil=0 ; yeniyil<4 ; yeniyil++){
            ücret = ücret*95 /100;
            total+=ücret;

        }

        System.out.println("Ücret: " + total);




    }
}
