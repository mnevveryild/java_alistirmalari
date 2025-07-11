package Denemeler.Hastane;

public class Main {

    public static void main(String[] args){
        Kisi d1 = new Doktor("Ayşe Yılmaz", 111111111, 40,"Kardiyoloji");
        Kisi h1 = new Hasta("Mehmet Vvan",88888888,32,"Grip");
        Kisi h2 = new Hasta("Zeynep Demir",3333333, 21,"Migren");


        Kisi[] kisiler = {d1,h1,h2};

        System.out.println("----Kisi Bilgileri----");
        for(Kisi kisi : kisiler){
            kisi.bilgiYaz();

            if (kisi instanceof Calisabilir){
                ((Calisabilir) kisi).calis();
            }

            if(kisi instanceof  RandevuAlabilir){
                ((RandevuAlabilir)kisi).randevuAl();
            }

            System.out.println("------------------------------");
        }

    }
}
