package Jardines_p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
   private Set<String> uniqueWords;
   
   public void remove(String dataFile) throws FileNotFoundException
   {
       String word;
       uniqueWords = new HashSet<String>();
       Scanner sc=new Scanner(new File(dataFile));
       while(sc.hasNext())
       {
           word=sc.next();
           uniqueWords.add(word);
       }
       sc.close();
      
      
   }
  

   public void write(String outputFile) throws IOException
   {
       File x;
       FileWriter fw = null;

       x = new File(outputFile);
      
       if(x.exists()) {
    	  fw = new FileWriter(x,false);
          fw = new FileWriter(x,true);
          Iterator itr=uniqueWords.iterator();

          while(itr.hasNext())
          {
              String str=(String)itr.next();
              fw.write(str+"\n");     
          }
          fw.close();
       }
      
       else
       {
          x.createNewFile();
          fw=new FileWriter(x);
          Iterator itr=uniqueWords.iterator();

          while(itr.hasNext())
          {
              String str=(String)itr.next();
              fw.write(str+"\n");     
          }
          fw.close();
          System.out.println("Data Written to File");
        }

   }

}