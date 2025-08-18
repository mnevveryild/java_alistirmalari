package File;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try{
            File myObj = new File("filename.txt");
            //File müni = new File("C:\\Users\\DRAGON\\Desktop\\müni\\müni.txt");
            if(myObj.createNewFile()){
                System.out.println("dosya oluşturuldu: "+myObj.getName());
            }else{
                System.out.println("zaten dosya mevcut.");
            }
        }catch (IOException e){
            System.out.println("bir hata oluştu.");
            e.printStackTrace();

        }


    }
}
