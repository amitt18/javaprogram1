package Strings;
import java.util.*;
public class Pallindromesubstring {
    public static void main(String[] args) {
       String str = "namman";
//
//        // Create StringBuilder for the original string
//        StringBuilder ktr = new StringBuilder(str);
//
//        // Create a StringBuilder for the reversed string
//        StringBuilder gtr = new StringBuilder(str).reverse();
//
//        // Compare the original string with the reversed string
//        if(ktr.toString().equals(gtr.toString())) {
//            System.out.println("p");  // Palindrome
//        } else {
//            System.out.println("np"); // Not palindrome
//        }


        int i = 0, j = str.length() - 1;
        boolean ispa = true;

        // Check if string is a palindrome
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                ispa = false;
                break;
            }
            i++;  // Move i towards the center
            j--;  // Move j towards the center
        }

        if (ispa) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
