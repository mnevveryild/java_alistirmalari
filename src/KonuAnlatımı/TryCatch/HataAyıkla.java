package TryCatch;

// çalışma zamanı sırasında hataları yakalamanızı ve işlemenizi sağlar böylece programınız çökmez

public class HataAyıkla {

    public static void main(String[] args) {
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);

        }catch (Exception e){
            System.out.println(" bir şeyler ters gitti.");
        }
    }



}
