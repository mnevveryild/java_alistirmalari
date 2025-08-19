package OOP_tekrar.Encapsulation;

public class main {

    public static void main(String[] args) {

        Calisan calisan = new Calisan(12L,"ali","yılmaz",120678);

        calisan.setId(15L); // long yazdığım için

        System.out.println("çalışanın id si: "+ calisan.getId());




    }
}
