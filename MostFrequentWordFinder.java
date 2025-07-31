import java.io.*;
import java.util.*;

public class MostFrequentWordFinder {

    public static void main(String[] args) {
        String fileName = "check.txt"; // Change this to your actual file path

        try {
            // Step 1: Read the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            HashMap<String, Integer> wordCount = new HashMap<>();
            String line;

            // Step 2: Process each line and count word occurrences
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+"); // Splitting words by space
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", ""); // Removing punctuation
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            reader.close();

            // Step 3: Find the most frequent word
            String mostFrequentWord = "";
            int maxCount = 0;
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostFrequentWord = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            // Step 4: Display the result
            if (!mostFrequentWord.isEmpty()) {
                System.out.println("Most Frequent Word: " + mostFrequentWord);
                System.out.println("Count: " + maxCount);
            } else {
                System.out.println("No words found in the file.");
            }
                   System.out.println(wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}