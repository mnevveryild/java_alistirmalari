package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Ogrenci ofr = new Ogrenci();

        ofr.setIsim("melike");
        ofr.setYas(20);

        System.out.println("İsim: "+ ofr.getIsim());
        System.out.println("Yaş: "+ofr.getYas());

        ofr.setYas(-4);
    }
}
