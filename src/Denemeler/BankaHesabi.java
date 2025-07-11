package Denemeler;

public class BankaHesabi {

    private int bakiye=1990;

    public void paraYatir(int miktar){
        this.bakiye = bakiye+miktar;
        System.out.println("Paranız başarıyla yatırılmıştır.");
        System.out.println(bakiye);


    }

    public void paraCek(int miktar){
        this.bakiye=bakiye-miktar;
        System.out.println("Paranızı alabilirsiniz.");

    }

    public int getBakiye() {
        return bakiye;
    }
}
