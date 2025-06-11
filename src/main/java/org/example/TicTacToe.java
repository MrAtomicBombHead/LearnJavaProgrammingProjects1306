package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTacToe {
    //The game board is stored as a list of 9 characters
    //Fill these in with X, O, or space to represent who has played on that tile
    //Remember, arrays start at 0, so even though the length is 9, the indexes go from 0-8
    private static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    //Scanner is used to get input in the console
    //scanner.nextLine() returns the String of the user's input until they press enter
    //scanner.nextInt() returns the int of the user's next number input. The code will crash if the user does not input a number
    //scanner.nextDouble() and scanner.nextBoolean() work similarly, returning their respective types
    private Scanner scanner = new Scanner(System.in);

    //The main method is where your program starts
    public static void main(String[] args) {
        startGame(); //starts the game. The method's I've written for you are at the bottom, with comments explaining each line.
    }

    //Task #1
    //Write a method that uses the scanner to let the player enter the number of the tile they want to place in
    //You should use the isValidSpace() method to check whether the player can go there
    //Hint: use a while loop to keep trying to get the player's input until they enter an incorrect space
    private static int selectSpace() {
        return 0;
    }

    //Task #2
    //Write a method that assigns the player's letter to a space on the board
    //Use the parameters (space, player) as the space and letter to set
    private static void placeOnBoard(int space, char player) {

    }

    //Task #3
    //Write a method that checks whether a player can place on a space
    //You should check that the space entered is on the board (0-8) and is empty
    //Use the parameter space as the space to check
    private static boolean isValidSpace(int space) {
        return true;
    }

    //Task #4
    //Write a method that checks if any player has three in a row
    //This method should return true if any player has won, and false otherwise
    //Hint: There are 8 winning patterns in tic-tac-toe
    private static boolean isWin() {
        return false;
    }

    //Task #5
    //Write a method that checks if the board is full, but no player has won
    //This method should return true if the game is a tie, and false otherwise
    //You should use your isWin() method in this method
    private static boolean isTie() {
        return false;
    }

    private static void startGame() {
        board = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //sets the board to a new array of spaces
        gameLoop(); //starts the game loop
    }

    private static void gameLoop() {
        System.out.println("Welcome to tic-tac-toe! Player X starts");

        char currentPlayer = 'X'; //stores the currentPlayer as a char variable. Starts as X
        while (!isWin() && !isTie()) { //this loop runs until the game is a tie or win
            printBoard(); //start the turn by printing the board. This method has been written for you.

            System.out.println("Player " + currentPlayer + "'s turn."); //Will print something like: Player X's turn.

            int space = selectSpace(); //calls the selectSpace method and saves its value into an integer variable
            placeOnBoard(space, currentPlayer); //calls the placeOnBoard method using the two variables to place the current player's piece at the selected space.

            if (isWin()) { //if isWin returns true, a congratulations message will show.
                System.out.println("Congratulations player " + currentPlayer + "! You won!");
                printBoard();
            }
            if (isTie()) { //if isTie returns true, the game will let you know it's a draw.
                System.out.println("The game is a draw!");
                printBoard();
            }

            if (currentPlayer == 'X') currentPlayer = 'O'; //if the current player is X, switches to O
            else currentPlayer = 'X'; //otherwise, switch it to X
        }

        startGame(); //starts a new game
    }

    private static void printBoard() {
        for (int i = 0; i < board.length; i++) { //loops though every space on the board
            System.out.print(board[i]); //prints the character at that space
            if (i % 3 != 2) System.out.print(" | "); //if it's not at the end of a row, add a vertical bar
            else if (i != 8) System.out.print("\n---------\n"); //if it is at the end of a row, but not at the end, add a horizontal bar on its own line
        }
        System.out.println();
    }

}