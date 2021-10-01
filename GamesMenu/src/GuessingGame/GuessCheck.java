package GuessingGame;

import javafx.event.ActionEvent;

public class GuessCheck {

        public void checkNum(int randomNum, String Playerguess, ActionEvent e){

            int guess =Integer.parseInt(Playerguess);

            if(randomNum == guess){

                    System.out.println("IT WAS RIGHT!!");

            }

            if(randomNum > guess){

                    System.out.println("it was to low");


            }

            if(randomNum < guess){

                    System.out.println("it was to high");

            }

        }

}