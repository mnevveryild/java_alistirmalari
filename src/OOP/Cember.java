package OOP;

public class Cember {

    double yariCap;


    double alanHesapla(){
        return yariCap * yariCap * Math.PI;
    }

    double cevreHesapla(){
        return 2 * Math.PI * yariCap;
    }


    void yaricapGüncelle(double y){
        yariCap=y;

    }
}
