package Super;

import Polymorphisim.Animal;

public class Dog extends Animal {
    public void animalSound(){
        super.animalSound(); // üst sınıfın metoduna eriş.
        System.out.println("The dog says: bow wow");


    }

    Dog(){
        super();
        System.out.println("Dog is created.");
    }

}
