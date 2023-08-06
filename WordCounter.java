package codsoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some text:");
        String inputText = scanner.nextLine();

        System.out.println("You entered: " + inputText);

        scanner.close();
                
                // Split the string into an array of words using space or punctuation as delimiters
                String[] words = inputText.split("[\\s\\p{Punct}]+");
                
                
                System.out.println("");
                
                int c=0;
  	          for(String word :words)
  	          {
  	        	  c++;
  	          }
  	      //Display the total count of words
  	          System.out.println("Total count of words : "+c);
  	          
  	          
  	          
  	     // Define a set to store unique words
  	        Set<String> uniqueWords = new HashSet<>();
  	        
  	        // Define a map to store word frequencies
  	        Map<String, Integer> wordFrequency = new HashMap<>();
  	        
  	        // Define common words (stop words) to be ignored
  	        Set<String> stopWords = new HashSet<>(Arrays.asList("this", "is", "a", "it", "and"));


  	        // Count the number of unique words and calculate word frequencies
  	        for (String word : words) {
  	            word = word.toLowerCase(); // 
  	            if (!stopWords.contains(word)) { // Check if the word is not a stop word
  	                uniqueWords.add(word); // Add to the set of unique words
  	                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1); // Update word frequency
  	            }
  	        }
  	        System.out.println();
  	        // Print the array of words
  	        System.out.println("Words in the text:");
  	        for (String word : words) {
  	            System.out.println(word);
  	        }

  	        // Print the number of unique words
  	        System.out.println("\nNumber of unique words: " + uniqueWords.size());

  	        // Print word frequencies
  	        System.out.println("\nWord frequencies:");
  	        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
  	            System.out.println(entry.getKey() + ": " + entry.getValue());
  	          
  	        }
	}

}
