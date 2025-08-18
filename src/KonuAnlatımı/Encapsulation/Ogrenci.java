package Encapsulation;

// Sınıftaki verileri kilitlemek ve kontrollü şekilde açmaktır.
//değişken private olmalı
//get metodu ile oku set metodu ile yaz


public class Ogrenci {
    private String isim;
    private int yas;

    public String getIsim(){
        return isim;
    }

    public void setIsim(String Yeniisim) {
        isim = Yeniisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int Yeniyas) {
        if(Yeniyas >=0){
            yas =  Yeniyas;
        }else {
            System.out.println("hatalı yaş");
        }
    }


}
