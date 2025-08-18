package bolum05;

import java.util.Scanner;

public class BolenEnKucukSayı {
    public static void main (String[] args){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int n = klavye.nextInt();

        int bolen = 2;
        while(bolen <= n){
            if( n % bolen == 0){
                break;
            }
            bolen ++;
        }

        int factor =2 ;
        while (factor <= n && n % factor !=0){
            factor++;
        }

        System.out.println(n+" sayısını bölen birden büyük en küçük sayı: " + bolen + " dir.");

    }
}
