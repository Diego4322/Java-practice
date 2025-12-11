
import java.util.Scanner;




public class GmailChallenge{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter one word: ");

    String words = input.nextLine();

    System.out.print("Enter another word: ");

    String word = input.nextLine();
    
    System.out.print("Enter one whole number less than 50: ");
    String num = input.nextLine();
    int numConverted = Integer.parseInt(num);

    System.out.print("Enter another whole number less than 50: ");
    String num2 = input.nextLine();
    int num2Converted = Integer.parseInt(num2);

    System.out.println(words + word + (num2Converted + numConverted) +"@gmail.com");
    }
}