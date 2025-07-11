package Denemeler.Hastane;

public class Doktor extends Kisi implements Calisabilir{

    private String brans;

    public Doktor(String isim, long TC, int yas,String brans) {
        super(isim, TC, yas);
        this.brans=brans;

    }

    @Override
    public void bilgiYaz() {
        System.out.println("Doktor: "+getIsim()+ "| Branş: " + brans );
    }

    @Override
    public void calis() {
        System.out.println(getIsim() + "hasta muayene ediyor.");
    }
}
