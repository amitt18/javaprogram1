import java.util.*;
public class pascal {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Prompt user for the number of rows in Pascal's Triangle
            System.out.print("Enter the number of rows for Pascal's Triangle: ");
            int rows = sc.nextInt();

            // Outer loop for each row
            for (int i = 0; i < rows; i++) {
                int number = 1;  // The first number in each row is always 1

                // Print leading spaces to align the triangle properly
                for (int j = 0; j < rows - i - 1; j++) {
                    System.out.print(" ");  // Print spaces for formatting
                }

                // Inner loop for the actual numbers in the row
                for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");  // Print the number

                    // Calculate the next number in the row
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();  // Move to the next line after each row
            }
        }
    }


