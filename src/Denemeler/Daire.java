package Denemeler;

public class Daire extends AlanHesapla{

    int yaricap;

    @Override
    public void Alanhesapla() {
        alan= (int) (Math.pow(yaricap,2) * Math.PI);
        System.out.println(alan);
    }
}
