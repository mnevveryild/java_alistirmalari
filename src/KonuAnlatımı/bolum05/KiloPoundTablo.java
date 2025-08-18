package bolum05;

public class KiloPoundTablo {

    public static void main (String[] args){

                System.out.printf("%-10s%-10s\n", "Kilogram", "Pound");

                for (int kg = 1; kg <= 199; kg += 2) {
                    double pound = kg * 2.2;
                    System.out.printf("%-10d%-10.0f\n", kg, pound);


                }


            }
        }






