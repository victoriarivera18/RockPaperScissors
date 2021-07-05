import  java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class Main {

    public static String randomVal(){
        Random rand = new Random();
        int random = rand.nextInt(3);

        if (random == 0){
            return "r";
        } else if (random == 1){
            return "p";
        } else {
            return "s";
        }
    }

    public static void main(String[] args) {
        System.out.println("We are going to play Rock-Paper-Scissors!");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter r for Rock, p for Paper or s for Scissor. Enter q to quit.");
        String input =  keyboard.nextLine().toLowerCase();

        while(!input.equals("q")){
            String computer = randomVal();

            if(input.equals(computer)){
                System.out.println("You: "+ input + "\nOpponent: " + computer +"\nIt's a draw.");
            } else if ((input.equals("r") && computer.equals("p")) || ((input.equals("s") && computer.equals("r")) || ((input.equals("p") && computer.equals("s"))))){
                System.out.println("You: "+ input + "\nOpponent: " + computer +"\nOpponent Wins.");
            } else {
                System.out.println("You: "+ input + "\nOpponent: " + computer +"\nYou Win!");
            }

            System.out.println("Enter r for Rock, p for Paper or s for Scissor. Enter q to quit.");
            input = keyboard.nextLine().toLowerCase();
        }
    }
}
