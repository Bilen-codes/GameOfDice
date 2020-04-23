/*            Pesudo code
* 1, Welcome the user and generate two random numbers
* 2, Check the values of the generated random numbers.
* 3, If one only is 1 then don't change the value of the running sum.
* 4, If both are 1 then add 25 to the running total.
* 5, If it's not any of the two conditions then add the running total with the sum of the two dice.
* 6, Display back the score to the user.
* 7, Give the user the option to roll again. If the user chooses no exit the program.
* 8, Check if the sum is under 100 if not exit the program
* 9, Repet this until  the user enters no for rolling again
* */


/*
* This program will implement a RollDice game. It will roll two dice,
* finds the running sum of the two dice until the value of 100 is reached.
* If user gets 1 on one of the dices then they will lose a turn, if both dice is 1 then they will
* get to add 25 on their running total.  */

import java.util.Scanner;
public class GameofDice {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int roll1 = 0;
        int roll2 = 0;
        int runningTotal = 0;
        String stayOrGo = "";
        System.out.println("Welcome! Let's Play Roll Dice!");
            do {
                roll1 = (int) ((Math.random() * 6) + 1);
                roll2 = (int) ((Math.random() * 6) + 1);
                System.out.println("Your rolls are: " + roll1 + " & " + roll2);

                //checks the values of each roll of Dice and assigns the appropriate value for sum
                //If only one of the Dice is equal to 1
                if ((roll1 == 1) ^ (roll2 == 1)) {
                    runningTotal = runningTotal;
                }
                //If both are equal to 1
                else if ((roll1 == 1) && (roll2 == 1)) {
                    runningTotal += 25;
                } else {
                    runningTotal = runningTotal + roll1 + roll2;
                }

                //Display the value of the runningTotal after the conditions
                System.out.println("Score: " + runningTotal);

                do {
                    //Ask if player would like to continue
                    System.out.println("Roll again?");
                    stayOrGo = sc.next();
                    if (!((stayOrGo.equalsIgnoreCase("YES")) || (stayOrGo.equalsIgnoreCase("No")))) {
                        System.out.println("Sorry, invalid entry! \n Enter yes or no ");
                        stayOrGo = sc.next();
                    }
                } while (!((stayOrGo.equalsIgnoreCase("YES")) || (stayOrGo.equalsIgnoreCase("No"))));

                if (stayOrGo.equalsIgnoreCase("NO")) {
                    System.out.println("Thank you for playing, good bye!");
                    System.exit(0);
                }

                //Now check to see if total is with in 100
                if (runningTotal >= 100) {
                    System.out.println("You have scored over 100");
                    System.exit(0);
                }
            } while (stayOrGo.equalsIgnoreCase("YES"));

    }
}
