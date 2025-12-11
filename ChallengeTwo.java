
import java.util.Scanner;





public class ChallengeTwo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("User please provide the necessary information for this program to function correctly");
        System.out.println("One number: ");
        double num = Double.parseDouble(input.nextLine());

        System.out.println("Another number: ");
        double num2 = Double.parseDouble(input.nextLine());

        System.out.println(num/num2);
    }
}
