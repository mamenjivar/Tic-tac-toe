/**
 * Tic Tac Toe
 * 
 * Author: Miguel Menjivar
 * Date: February 22, 2020
 * 
 * UserInterface.java
 * This file will be in charge of all
 * the print statements to the console.
 */
class UserInterface {

    public void introduction() {
        System.out.println("Welcome to the game of Tic-Tac-Toe!");
    }

    /**
     * The title of the game
     */
    public void title() {
        System.out.println("Tic Tac Toe\n");
    }

    /**
     * Main menu choices for user to choose from
     */
    public void mainMenu(){
        System.out.print("Main Menu:\n"
                            + "1) Play game\n"
                            + "2) Exit Game\n"
                            + ">> ");
    }

    /**
     * When the user chooses an option that doesn't
     * match the given choices
     */
    public void mainMenuOptionNotExist(){
        System.out.println("This option you've chosen does not exist");
    }

    /**
     * When user chooses a letter rather than a number
     */
    public void noLetterMainMenuError(){
        System.out.println("Please input a number NOT A LETTER\n");
    }

    /**
     * When the user chooses a number that is outside the range
     * from the main menu
     */
    public void mainMenuNumberError() {
        System.out.println("The number you have chosen is not in the choice provided, please choose another number\n");
    }

    /**
     * Have user choose between X or O to play game
     */
    public void chooseXorO() {
        System.out.print("Please choose either X or O:\n"
                        + ">> ");
    }

    /**
     * When the user chooses a value outside X or O
     */
    public void xorOErrorChoice(){
        System.out.println("The option you've provided is not valid, please try again");
    }

    /**
     * prompts what user will choose
     */
    public void userChooses() {
        System.out.print("User Chooses (number):\n"
                        + ">> ");
    }

    /**
     * Prints board array of x's and o's to keep track
     * and for testing
     * 
     * @param array
     */
    public void printBoardArrayTest(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(i + " => " + array[i]);
        }
    }

    /**
     * When the user/oponent chooses an invalid option
     */
    public void invalidChoiceBoard(){
        System.out.println("That number has been taken, please choose another one");
    }

    /**
     * prompts what oponent uses
     */
    public void oponentChooses() {
        System.out.print("Opponent Chooses:\n"
                        + ">> ");
    }

    /**
     * when there are no winners in this game
     */
    public void gameEndedDraw() {
        System.out.println("Game has ended in draw");
    }

    /**
     * game ended and USER wins
     */
    public void gameEndedUser() {
        System.out.println("User has won!");
    }

    /**
     * game ended and OPPONENT wins
     */
    public void gameEndedOpponent() {
        System.out.println("Opponent has won!");
    }

    /**
     * Exits the game
     */
    public void gameExit(){
        System.out.println("Game has been terminated...");
    }
}