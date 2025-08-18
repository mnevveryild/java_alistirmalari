package File;

import java.io.File;

public class Delete {

    public static void main(String[] args){
        File dosya1 = new File("filename.txt");
        if (dosya1.delete()){
            System.out.println("dosya silindi : " + dosya1.getName());


        }else {
            System.out.println("dosya silinirken hata oluştu.");

        }

    }

}
