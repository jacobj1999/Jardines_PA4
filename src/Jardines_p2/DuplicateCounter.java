package Jardines_p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter
{
   private Map<String, Integer> wordCounter;
  
   public DuplicateCounter(){
       wordCounter = new HashMap<String,Integer>();
   }
  
   public void count(String dataFile){
       Scanner sc = null;
       try {
           sc = new Scanner(new File(dataFile));
       } 
       catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
           return;
       }
       sc.useDelimiter("([0-9]|[.,!?:;'\"-]|\\s)+");
       while(sc.hasNext()) {
           String word = sc.next();
           Integer count = wordCounter.get(word); 
           if(count == null) 
        	   count = 1;
           else 
        	   count = count + 1;
           wordCounter.put(word, count);
        }
       sc.close();
   }
   
  
   public void write(String outputFile){
       try {
           PrintWriter outfile = new PrintWriter(new File(outputFile));
           for(String k : wordCounter.keySet()) {
               outfile.println(k + " " + wordCounter.get(k));
           }
           outfile.close();
       } 
       catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       }
   }
  
}