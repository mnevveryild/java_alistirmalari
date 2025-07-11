package Denemeler;

public class Dikdörtgen extends AlanHesapla{
    int kenar1;
    int kenar2;

    @Override
    public void Alanhesapla() {
        alan=kenar1*kenar2;
        System.out.println(alan);
    }
}
