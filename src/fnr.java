import java.util.*;
public class fnr {
        public static int firstNonRepeatingIndex(String str) {
            Map<Character, Integer> charCount = new HashMap<>();

            // Step 1: Count frequency of each character
            for (char ch : str.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            // Step 2: Find the index of the first character with frequency 1
            for (int i = 0; i < str.length(); i++) {
                if (charCount.get(str.charAt(i)) == 1) {
                    return i;
                }
            }

            return -1; // If no non-repeating character is found
        }

        public static void main(String[] args) {
            String input = "swiss";
            int index = firstNonRepeatingIndex(input);

            if (index == -1) {
                System.out.println("No non-repeating character found.");
            } else {
                System.out.println("Index of first non-repeating character: " + index);
            }
        }
    }


