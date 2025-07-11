package Abstract;

abstract class Hayvan {
    abstract void sesCikar();

    void hareketEt(){
        System.out.println("Hayvan hareket ediyor");
    }
}
//Hayvan bir soyut kavramdır.
//Ama “hayvan” deyince hangi hayvan? Kedi mi? Köpek mi? Tavuk mu?
//
//Yani:
//
//Hayvan soyuttur (abstract class)
//
//Kedi, Köpek gerçektir (somut class) → ses çıkarma şekilleri farklıdır
//abstract sınıf = taslak

//abstract metot = ne yapılacağını bilir ama nasılını bilmez