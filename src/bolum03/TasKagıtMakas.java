package bolum03;

import java.util.Scanner;

public class TasKagıtMakas {
    public static void main(String[] args) {



        int sayi1 = (int) (Math.random() * 4);


        Scanner taskagıtmakas = new Scanner(System.in);
        System.out.println("makas=0 , taş=1 ,kağıt=2 .Seçiniz.");
        int sayi2 = taskagıtmakas.nextInt();



        if(sayi1==sayi2 ) {
            System.out.println("Berabere kaldınız.");


        }else if(sayi1==0 && sayi2==1) {
            System.out.println("Bilgisayar makas siz taşsınız.Kazandınız");

        }else if (sayi1==1 & sayi2 ==0) {

            System.out.println("Bilgisayar taş siz makassınız.Kaybettiniz.");
        } else if (sayi1==1 && sayi2 ==2) {

            System.out.println("Bilgisayar taş siz kağıtsınız.Kazandınız.");

        } else if (sayi1==2 && sayi2 ==1) {

            System.out.println("Bilgisayar kağıt siz taşsınız.Kaybettiniz.");

        } else if (sayi1==0 && sayi2 ==2) {
            System.out.println("Bilgisayar makas siz kağıtsınız.Kaybettiniz.");

        } else if (sayi1==2 && sayi2 ==0) {

            System.out.println("Bilgisayar kağıt siz makassınız.Kazandınız.");

        }


    }

}

