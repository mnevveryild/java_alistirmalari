package Denemeler;

public class Main {
    public static void main(String[] args){
        BankaHesabi hesap1 = new BankaHesabi();
        hesap1.paraYatir(24);
        hesap1.paraCek(13);
        System.out.println(hesap1.getBakiye());

    }

}
