package File;

// Klasörün silinebilmesi için içinin boş olması gerekmektedir.


import java.io.File;

public class DeleteFolder {

    public static void main(String[] args) {
        File klasörsilme1 = new File("C:\\Users\\MyName\\Test");
        if (klasörsilme1.delete()) {
            System.out.printf("klasör silindi : "+klasörsilme1.getName());


        }else {
            System.out.printf("klasör silinirken bir hata oluştu.");
        }
    }


}
