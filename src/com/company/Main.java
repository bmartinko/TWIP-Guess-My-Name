package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner placementReader = new Scanner(System.in);
	Scanner answerReader = new Scanner(System.in);
	Scanner intReader = new Scanner(System.in);
	String names[] = {"Bennett", "Prem","Bryce", "Dan", "Brian", "Jacob", "Bobby",
    "Eden", "Emma", "Todd", "Valentina", "Angelo", "Alex", "Sean", "Winston", "Grace",
    "Sydney", "Felipe", "Tanner", "Brendan", "Jackson", "Kate", "Minnie", "MaryKate",
    "Alyssa", "Ryan", "Cj", "Derek", "Ethan", "Sara", "Jordan", "Connor", "Vian", "Jack",
    "Josh", "Mitch", "Tyler", "Matt", "Steve", "Ansley", "Dani", "Charlotte", "Austin",
    "Evan", "Morgan", "Rachel", "Lillian", "Clare", "Hannah", "Phil"};
    Arrays.sort(names);
    int guesses = names.length/2;
    int count = 0;
    System.out.println("Select a name from the list, but don't tell me! I will guess it!");
    for(int i = 0; i < names.length; i++){
        System.out.println(names[i]);

    }
    System.out.println("Are you ready? If you are, press 1!");
    int hereWeGo = intReader.nextInt();

    System.out.println("I'm making my guesses! If i am above the name, say above. If I am below, say below. " +
            "If my guess is correct, say correct!");
    System.out.println("Is the name: " + names[guesses] + "?");
    System.out.println("Is this correct?");
    count = count + 1;
    String responseOne = answerReader.next();
    System.out.println();
    boolean found = false;
    while (found == false){
        if (responseOne.equalsIgnoreCase("yes")){
            System.out.println("Thanks for playing! I guessed this in " + count + " attempts!");
            found = true;
        }else if (responseOne.equalsIgnoreCase("no")) {
            System.out.println("Ok. Is it above or below?");
            String responseLoop = placementReader.next();
            if (responseLoop.equalsIgnoreCase("above")){
                guesses /= 2;
                System.out.println("Is the name: " + names[guesses] + "?");
                count++;
                responseOne = answerReader.next();

            }else if (responseLoop.equalsIgnoreCase("Below")){
                guesses = (guesses/2) + 12;
                System.out.println("Is the name: " + names[guesses] + "?");
                count++;
                responseOne = answerReader.next();

            }
        }
    }



}
}
