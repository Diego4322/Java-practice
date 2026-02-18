// ENCAPSULATION and Getters and Setters
// Read: https://www.w3schools.com/java/java_encapsulation.asp

import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("pineappleghost333"); //sets (or mutates) username to new value
        player1.setID(101);
        player1.setRank("Hacker");
        System.out.println(player1.getUsername()); //displays new username 
        System.out.println(player1.getID());
        System.out.println(player1.getRank());

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        player2.setID(202);
        player2.setRank("Novice");
        System.out.println(player2.getUsername()); //displays new username 
        System.out.println(player2.getID());
        System.out.println(player2.getRank());

        // taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();
        player3.setUsername(userInput);

        System.out.print("Enter an ID: ");
        int idInput = input.nextInt();
        input.nextLine();
        player3.setID(idInput);

        System.out.print("Enter a rank (N00b, Bruh, Novice, Hacker, Gawd): ");
        String rankInput = input.nextLine();
        player3.setRank(rankInput);

        System.out.println(player3.getUsername()); //displays new username 
        System.out.println(player3.getID());
        System.out.println(player3.getRank());

        if (player1.getUsername().equals("pineappleghost333")) {
            System.out.println("You are an admin");
        } else {
            System.out.println("Access denied");
        }

        if (player3.getRank().equals("Hacker")) {
            System.out.println("You are one powerful hacker!");
        } else if (player3.getRank().equals("Gawd")) {
            System.out.println("You have reached ultimate status!");
        } else if (player3.getRank().equals("Novice")) {
            System.out.println("Keep practicing!");
        } else if (player3.getRank().equals("Bruh")) {
            System.out.println("You're getting there!");
        } else if (player3.getRank().equals("N00b")) {
            System.out.println("Welcome to the game!");
        }

        
    }
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username = "No user name";
    //ADD ID attribute
    private int id;
    //ADD "rank" attribute: (5 ranks of your choice, like N00b, Bruh, Novice, Hacker, Gawd)
    private String rank;

    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }

    public int getID(){
        return id;
    }

    public String getRank(){
        return rank;
    }
    
    //mutator methods aka SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setID(int newID){
        this.id = newID;
    }

    public void setRank(String newRank){
        this.rank = newRank;
    }

}
