package Jardines_p2;

public class Application2 {
	   public static void main(String[] args) {
	       String dataFile = "problem2.txt";
	       String outputFile = "unique_word_counts.txt";
	       DuplicateCounter dc = new DuplicateCounter();
	       dc.count(dataFile);
	       dc.write(outputFile);
	   }
	}