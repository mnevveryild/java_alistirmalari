package Interface;
//Bir interface (arayüz), bir sınıfın hangi işleri yapması gerektiğini söyler, ama nasıl yapacağını söylemez.

//"Bu metotları kullanacaksan, içini sen dolduracaksın!"
//Bizim oyuncaklarımızın hepsinde ses çıkar, hareket eder ve ışık verir özellikleri olacak. Ama bunu nasıl yapacağınız size kalmış
//Farklı sınıflara ortak bir davranış kazandırmak için
//Bir sınıf birden fazla interface kullanabilir

interface Oyuncak {
    void sesCikar();
    void hareketEt();
    void isikVer();
}
