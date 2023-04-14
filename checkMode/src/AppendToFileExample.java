import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendToFileExample {
   public static void main( String[] args ) {

      try {
         String data = " Tutorials Point is a best website in the world";
         File f1 = new File("D:/Git/POS-System/checkMode/src/oceans.txt");
         // if(!f1.exists()) {
         //    f1.createNewFile();
         // }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data + "\n");
         bw.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}