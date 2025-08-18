package OuterInner;

// İç i.e sınıfları oluşturmak mümkündür.
//Amacı kodu daha okunabilir kılmaktır.
// Erişebilmek için dış sınıfın bir nesnesini oluştur, ardından iç sınıfın nesnesini oluştur.
// Eğer dış sınıfın erişmesini istemezsek  iç sınıfı private yap.
// İç sınıf staticte olabilir bu dış sınıftan nesne oluşturmadan da direkt iç nesneye erişebileceğimizi gösteriir.


public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
}}
