package Pict;


import javax.swing.*;

public class FJP {

        public static void main(String[] args) {

                int computerNumber = (int) (Math.random()*100 + 1);

                int userAnswer = 0;

                System.out.println("The correct guess would be " + computerNumber);

                int count = 1;

                while (userAnswer != computerNumber)

                {
                        //JoptionPane.showInputDialog used for Customizing our Dialog window
                        //Defines the Component that is to be the parent of this dialog box.
                        //type of message used question msg type
                        String response = JOptionPane.showInputDialog(null,

                        "Enter a guess between 1 and 100", "Guessing Game", 1);

                        userAnswer = Integer.parseInt(response);

                        JOptionPane.showMessageDialog(null, ""+ InputGuess(userAnswer, computerNumber, count));

                        count++;

                }

        }

        public static String InputGuess(int userAnswer, int computerNumber, int count){

                if (userAnswer <=0 || userAnswer >100) {

                        return"Your guess is invalid";

                }

                else if (userAnswer == computerNumber ){

                        return"Correct!\nTotal Guesses: " + count;

                }

                else if (userAnswer > computerNumber) {

                        return"Your guess is too high, try again.\nTry Number: " + count;

                }

                else if (userAnswer < computerNumber) {

                        return"Your guess is too low, try again.\nTry Number: " + count;

                }

                else {

                        return"Your guess is incorrect\nTry Number: " + count;

                }

        }

}