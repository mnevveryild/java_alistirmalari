package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args){
        try{
            File dosya1 = new File("filename.txt");
            Scanner reader = new Scanner(dosya1);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();


        }catch (FileNotFoundException e){
            System.out.println("bir hata oluştu.");
            e.printStackTrace();
        }
    }

}
