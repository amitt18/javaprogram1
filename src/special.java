import java.util.*;
public class special {

        // Function to generate all special numbers up to a reasonable limit
        static TreeSet<Long> specialNumbers = new TreeSet<>();

        static void generateSpecialNumbers(long num, int depth) {
            if (num > 0) specialNumbers.add(num);
            if (depth == 10) return; // Limiting depth to avoid large numbers
            generateSpecialNumbers(num * 10 + 2, depth + 1);
            generateSpecialNumbers(num * 10 + 5, depth + 1);
        }

        static long f(long k) {
            return specialNumbers.ceiling(k); // Find the smallest special number >= k
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            generateSpecialNumbers(0, 0); // Precompute special numbers

            while (T-- > 0) {
                long l = scanner.nextLong();
                long r = scanner.nextLong();
                long sum = 0;

                for (long i = l; i <= r; ) {
                    long nextSpecial = f(i);
                    long nextLimit = Math.min(r, nextSpecial);
                    sum += nextSpecial * (nextLimit - i + 1);
                    i = nextLimit + 1;
                }

                System.out.println(sum);
            }

            scanner.close();
        }
    }


