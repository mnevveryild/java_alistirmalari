package File;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try{
           // File myObj = new File("filename.txt");
            File müni = new File("C:\\Users\\DRAGON\\Desktop\\müni\\müni.txt");
            if(müni.createNewFile()){
                System.out.println("File created: "+müni.getName());
            }else{
                System.out.println("file aldready exists.");
            }
        }catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();

        }


    }
}
