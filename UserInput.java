//Scanner library
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name ");

    String name = input.nextLine();
    System.out.println(name);
    
    System.out.print("Enter your age ");
    String age = input.nextLine();
    System.out.println(age);

    int ageConverted = Integer.parseInt(age);
    System.out.println("next year " + name + " will be " + (ageConverted + 1)); //to make the ageConverted + 1 work you must put it into parenthesis

    System.out.println("Whats your height in meters?");
    double height = Double.parseDouble(input.nextLine());

    System.out.println("You are " + height + " meters tall.");

    }
}
