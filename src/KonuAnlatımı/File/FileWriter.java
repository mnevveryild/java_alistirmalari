package File;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args){

            try {
                java.io.FileWriter myWriter = new java.io.FileWriter("filename.txt");
                myWriter.write("buraya dosyaya ne yazdırmak istersek onu ekleriz. Bir klasiktir. Hello World!");
                myWriter.close();
                System.out.println("yazma işlemi başarılı.");
            } catch (IOException e) {
                System.out.println("bir hata oluştu.");
                e.printStackTrace();
            }




    }
}
