package bolum03;

public class sıralama {

    public static void main(String[] args) {

        int sayi1 = (int) (Math.random() * 100);
        int sayi2 = (int) (Math.random() * 100);
        int sayi3 = (int) (Math.random() * 100);
        
        if(sayi1>sayi2 && sayi1>sayi3 ){
            System.out.println(sayi1 + "," + sayi2+ "," +sayi3 + ",");
        } else if (sayi1>sayi2 && sayi1>sayi3 && sayi3>sayi2) {
            System.out.println(sayi1 + "," + sayi3 + "," + sayi2 + ",");
        }
          else if (sayi2>sayi1 && sayi1>sayi3 && sayi2>sayi3) {

        }
            
        }


    }
    

