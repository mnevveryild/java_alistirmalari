package bolum05;

public class AsalSayıYazdır {

    public static void main (String[] args ){
        int asalSayiSayaci = 0;
        int sayi = 2 ;


        while(asalSayiSayaci<50){
            boolean asalMi = true;

            for (int i = 2; i<sayi;i++){
                if(sayi % i ==0){
                    asalMi=false;
                }
            }

            //TODO sayi asal mi

            if (asalMi == true){
                asalSayiSayaci ++;
                System.out.println(asalSayiSayaci + "asal sayi: " + sayi);

            }
            sayi ++;
        }
    }
}
