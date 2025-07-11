package ArrayLİsst;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


//add()  ekle
//get()  belirtileni döndür
//set()  belirtileni değiştir
//remove()  sil
//size()    öge sayısını döndür
//contains()  olup olmadığının kontrolü

public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        HashSet<String> meyve = new HashSet<String>(); //benzersizlik katar.
        HashMap<String, String> baskent = new HashMap<String,String>(); //anahtar-değer çiftlerini depolar
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        meyve.add("kiraz");
        meyve.add("erik");
        meyve.add("muz");

        baskent.put("England", "London");
        baskent.put("Germany", "Berlin");
        baskent.put("Norway", "Oslo");
        baskent.put("USA", "Washington DC");


        cars.add(0, "Mazda"); //listenin 0.indexine ekle
        System.out.println(cars.get(0)); //0.elenti yazıdr
        cars.set(0, "Opel");

        // cars.clear();
        System.out.println(meyve.size());


        System.out.println(cars);
        System.out.println(meyve);
        System.out.println(baskent);


        ArrayList<String> isim = new ArrayList<String>();

        isim.add("Ahmet");
        isim.add("Nisa");
        isim.add("Fatma");
        isim.add("Mehmet");
        isim.add("Ali");

        for (String i : isim){
            System.out.println(i);
        }



    }
}
