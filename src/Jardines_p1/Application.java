package Jardines_p1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

   public static void main(String[] args) throws IOException {
       DuplicateRemover d=new DuplicateRemover();
       d.remove("problem1.txt");
       d.write("unique_words.txt");
   }

}