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

    public void gameExit(){
        System.out.println("Game has been terminated...");
    }
}