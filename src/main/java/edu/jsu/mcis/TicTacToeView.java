package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
           String nextLine = "Player ";
           if (isXTurn){
               nextLine = nextLine + "1 (X) Move:";
               nextLine = nextLine +"\nEnter the specified row and column numbers, put a space in between: ";
           }else{
            nextLine = nextLine + "2 (O) Move:";
            nextLine = nextLine +"\nEnter the specified row and column numbers, put a space in between: ";
           }
           System.out.print(nextLine);
           String input = keyboard.nextLine();
           String[] parts = input.split(" ");
           int[] intParts = {Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};

        return null; // remove this line later!

    }

    public void showInputError() {

        System.out.println("Entered location is invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
