package TryCatch;

public class checkAge {

    static void checkAge(int age) {
        if (age <= 17){
            throw new ArithmeticException("erişim reddedildi , en az 18 yaşında olmalısınız. ");

        }else{
            System.out.printf("eriştiniz.");
        }
    }

    public static void main(String[] args) {
        checkAge(11);
        //checkAge(21);
    }

}
