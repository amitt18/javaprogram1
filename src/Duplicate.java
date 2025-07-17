
//    import java.util.Arrays;
//import java.util.HashSet;
import java.util.*;
    public class Duplicate {

        // Method to remove duplicates from an array
        public static int[] removeDuplicates(int[] array) {
            // Use a HashSet to store unique elements
            HashSet<Integer> set = new HashSet<>();

            // Add each element to the set (duplicates are ignored)
            for (int num : array) {
                set.add(num);
            }

            // Convert the set back to an array
            int[] uniqueArray = new int[set.size()];
            int index = 0;
            for (int num : set) {
                uniqueArray[index++] = num;
            }

            return uniqueArray;
        }

        public static void main(String[] args) {
            // Example array with duplicates
            int[] arrayWithDuplicates = {1, 2, 3, 2, 4, 5, 1, 6, 4};

            // Remove duplicates
            int[] uniqueArray = removeDuplicates(arrayWithDuplicates);

            // Print the result
            System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        }
    }


