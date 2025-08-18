package bolum01;

public class pi_hesaplama {

    public static void main(String[] args){
        int n = 1;
        double toplam = 1.0;

        if( n % 2 == 0){
            for( int i = 1 ; i<=13 ; i=i+2) {

                toplam = toplam + 1.0 / i;
                n++;
                return;
            }

        }else {
            for( int i = 1 ; i<=13 ; i=i+2){

                toplam = toplam - 1.0 / i;
                n++;
                 return;

        }

        System.out.println(toplam);




        }

    }
}
