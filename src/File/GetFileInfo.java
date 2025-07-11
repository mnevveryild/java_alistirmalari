package File;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args){

        File myObj = new File("filename.txt");
        if(myObj.exists()){

            System.out.println("dosya adı : " + myObj.getName());
            System.out.println("yol : "+ myObj.getAbsolutePath());
            System.out.println("yazılabilir : " + myObj.canWrite());
            System.out.println("okunabilir : "+ myObj.canRead());
            System.out.println("dosya boyutu : " + myObj.length());
        }

    }

}
