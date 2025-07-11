package bolum06;

public class KarakterTekrarı {

    public static int count (String str, char a){
       int  sayac = 0;
        for(int i=0; i<str.length();i++ ){
            if (str.charAt(i)==a){

                sayac ++;
            }

        }

        return sayac;

    }

    public static void main(String[] args) {

        int toplam = count("münevver", 'e');

        System.out.println(toplam);


    }

}
