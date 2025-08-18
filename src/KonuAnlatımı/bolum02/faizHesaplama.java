package bolum02;

import java.util.Scanner;

public class faizHesaplama {
    public static void main(String[] args){

        System.out.println("bakiye giriniz.");
        Scanner faiz = new Scanner(System.in);
        double bakiye = faiz.nextDouble();
        System.out.println("yıllık faiz oranı giriniz.");
        double yıllık = faiz.nextDouble();

        double faizGetirisi= bakiye*(yıllık/1200);

        System.out.println(faizGetirisi);





    }
}
