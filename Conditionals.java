
import java.util.Scanner;




public class Conditionals {
    public static void main(String[] args){


        //basic booleans
        System.out.println("Double equals: " + (3 == 2));
        System.out.println("String equivalent: " + ("Hello".equals("Helloz")));
        System.out.println("Not equals: " + (7 != 4));
        System.out.println("Greater than: " + (4>5));

        System.out.println();

        int num = 11;
        System.out.println(num <=12);  // prints true since num is 11 and 11<= 12
        if (num <= 12){ //if statements
            System.out.println("Num is less than or equal to 12");
        }

        //if else statement

        if (num <= 5){
            System.out.println("Num is less than or equal to 12");
        } else{
            if (num <= 12){ //if statements
            System.out.println("yay you did it! num is greater than 5");
        }

        //if... else if-... else

        int temperature = 93;
        if (temperature >= 85){
            System.out.println("its hot!");
        }else if (temperature >= 60){
            System.out.println("Its nice!");
        }else if (temperature < 40){
            System.out.println("Its cold!");
        }else{
            System.out.println("ERROR!");
        }


        //Logical "and" operator: &&

        int age = 18;
        boolean hasPermit = false;

        if (age >= 17 && hasPermit){
            System.out.println("You can drive");
        }else{
            System.out.println("Can't Drive Yet");
        }



        // Using 'or' ||

        String day = "Friday";

        if (day.equals ("Saturday") || day.equals("Sunday")){
            System.out.println("Its the weekend!");
        } else if (day.equals("Monday") ||
            day.equals("Tuesday") ||
            day.equals("Wednesday") ||
            day.equals ("Thursday") ||
            day.equals("Friday")) {
            System.out.println("Its the weekday " + ":(");
        } else{
            System.out.println("This is not a day");
        }


        String password = "cat";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = input.nextLine();
        

        if (pass = "cat"){

        }





        }
    }
}