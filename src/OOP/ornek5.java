package OOP;

public class ornek5 {

    String name;
    String surname;
    int number;
    double vize;
    double fınal;
    double hesap;

    public ornek5(String name, String surname, int number, double vize, double fınal) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.vize = vize;
        this.fınal = fınal;

    }

    public ornek5() {
        String name ;
        String surname;
        int number;
        double vize ;
        double fınal;
    }

    public double hesapla() {



        hesap = vize * 0.4 + fınal * 0.6;


        return hesap;

    }

    public String bilgileriYazdir() {


        return name + " " + surname + " " + number + " " + hesap;

    }

    public void GectiMi(){

        if(hesap<35){
            System.out.println("FF");
        } else if (hesap<50 && hesap>=35 ) {
            System.out.println("CC");
        } else if (hesap>50 && hesap<75) {
            System.out.println("BB");
        }else if (hesap>75){
            System.out.println("AA");
        }else
            System.out.println("Sınava girilmemiş.");

    }

}
