package Abstract;

public class Main {

    public static void main(String[] args) {
        Hayvan h1 = new Kedi();
        Hayvan h2 = new Köpek();

        h1.sesCikar();
        h2.sesCikar();
        h1.hareketEt();
}}

