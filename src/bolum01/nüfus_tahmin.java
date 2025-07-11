package bolum01;

public class nüfus_tahmin {

    public static void main(String[] args){

        int dogum = (3600/ 7)*365 ;
        int ölüm = (3600 / 13)*365;
        int gocmen= (3600/45)*365;

        int yil1 = 312032486 + (dogum + gocmen) - ölüm;
        int yil2 = yil1 + (dogum + gocmen) - ölüm;
        int yil3 = yil2 + (dogum + gocmen) - ölüm;

        System.out.println("yil 1:"+ yil1 + "yil 2: "+ yil2 + "yil 3: " +yil3);


    }
}
