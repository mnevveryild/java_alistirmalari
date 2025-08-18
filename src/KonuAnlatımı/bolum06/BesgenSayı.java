package bolum06;

public class BesgenSayı {

    public static int getPentagonalNumber(int n) {


        int sayi = n*(3*n -1)/2;

        return sayi;

    }

    public static void main (String[] args){

        for(int i = 1 ; i<100 ; i++){


            System.out.println(getPentagonalNumber(i));

        }

    }


}
