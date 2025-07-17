import java.util.Scanner;
public class listofint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] ratings = input.split(",");
        for(String ratingStr:ratings){
            int rating = Integer.parseInt(ratingStr.trim());
            if(rating<0){
                continue;
            }
            else if(rating==0){
                System.out.println("Zero");
            }
            else if(rating%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
}
