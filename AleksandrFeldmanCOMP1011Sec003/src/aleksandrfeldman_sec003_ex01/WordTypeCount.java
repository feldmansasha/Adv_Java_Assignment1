// Fig. 16.17: WordTypeCount.java
// Program counts the number of occurrences of each word in a String.
package aleksandrfeldman_sec003_ex01;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount {
   public static void main(String[] args) {
      // create HashMap to store String keys and Integer values
      Map<String, Integer> myMap = new HashMap<>();            

      createMap(myMap); // create map based on user input
      displayMap(myMap); // display map content
   } 

   // create map from user input
   private static void createMap(Map<String, Integer> map) {
      Scanner scanner = new Scanner(System.in); // create scanner
      System.out.println("Enter a string:"); // prompt for user input
      String input = scanner.nextLine();

      // tokenize the input
      String[] tokens = input.split(" ");
               
      // processing input text 
      for (String token : tokens) {
         String word = token.toLowerCase(); // get lowercase word
                  
         // if the map contains the word
         if (map.containsKey(word)) { // is word in map?
            int count = map.get(word); // get current count
            map.put(word, count + 1); // increment count   
         } 
         else {
            map.put(word, 1); // add new word with a count of 1 to map
         } 
      }
   } 
   
   // display map content
   private static void displayMap(Map<String, Integer> map) {
	   //variable to store min and max counts and words
	  int maximum=0; 
	  String maximumWord="";
	  int minimum=0;
	  String minimumWord="";
      Set<String> keys = map.keySet(); // get keys
      minimum=map.size();
      // sort keys
      TreeSet<String> sortedKeys = new TreeSet<>(keys);
      // generate output for each key in map
      for (String key : sortedKeys) {
    	 //check, if key is repeated more times than max
         if (maximum<map.get(key)) {
        	 maximum=map.get(key);
        	 maximumWord=key;
         }
         //check, if key is repeated less times than previous count
         if (minimum>=map.get(key) && map.get(key)>1) {
        	 minimum=map.get(key);
        	 minimumWord=key;
         }
      }
      if(minimumWord=="") {
    	  minimumWord=maximumWord;
    	  minimum=maximum;
      }
      //if maximum equals to 1 that means there are no duplicates
      if (maximum==1) {
    	  System.out.print("There are no duplicate word in entered string!");
      }
      else {
      System.out.printf("Minimum repeated word: "+minimumWord+" - "+minimum+" times%n");
      System.out.printf("Maximum repeated word: "+maximumWord+" - "+maximum+" times");
      } 
    }
} 

