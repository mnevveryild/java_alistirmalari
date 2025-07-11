package Polymorphisim;

// aynı isimli metodlar farklı işleri yapabilir ve bunun için kullanır.
// a.Overloading Aynı metot ismini farklı parametrelerle kullanmaktır.
//b.Overriding Alt sınıf, üst sınıftaki metodu kendi ihtiyacına göre yeniden tanımlar.
public class Main {
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myPig = new pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
