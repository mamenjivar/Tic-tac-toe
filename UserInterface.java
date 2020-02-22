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

    public void gameExit(){
        System.out.println("Game has been terminated...");
    }
}