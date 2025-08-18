package bolum05;
import java.util.Scanner;

public class Desen {

    public static void main(String[] args) {
            Scanner klavye = new Scanner(System.in);

            System.out.print("1 ile 15 arasında bir sayı girin: ");
            int n = klavye.nextInt();

            if (n < 1 || n > 15) {
                System.out.println("Hatalı giriş!");
            } else {
                for (int i = 1; i <= n; i++) {


                    for (int j = 1; j <= n - i; j++) {             //Boşluklar
                        System.out.print("  ");
                    }

                                                                   // Artan sayılar
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                                                                   // Azalan sayılar
                    for (int j = i - 1; j >= 1; j--) {
                        System.out.print(j + " ");
                    }

                                                                   // Satır sonu
                    System.out.println();
                }
            }


        }
    }


