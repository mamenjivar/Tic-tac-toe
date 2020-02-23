/**
 * Tic Tac Toe
 * 
 * Author: Miguel Menjivar
 * Date: February 22, 2020
 * 
 * GameEngine.java
 * This is where the logic of the game
 * to be handled
 */
import java.util.InputMismatchException;
import java.util.Scanner;

class GameEngine{
    UserInterface ui;
    
    Scanner kb;

    int choice = 0;

    // Default constructor
    GameEngine() {
        ui = new UserInterface();
        kb = new Scanner(System.in);
    }

    /**
     * Entry point for starting program
     */
    public void begin(){
        ui.title();

        mainMenu();
    }

    /**
     * Main menu choices
     * 1 = play
     * 2 = exit
     */
    public void mainMenu(){
        boolean loop = true;

        // loop until choice is made
        while(loop) {
            try {
                ui.mainMenu();
                choice = kb.nextInt();
                if(choice == 1 || choice == 2) {
                    loop = false;
                } else {
                    ui.mainMenuNumberError();
                }

            } catch(InputMismatchException e){
                System.out.println(e);
                ui.noLetterMainMenuError();
                kb.nextLine();
            }
        }

        switch(choice){
            case 1: 
                playGame();
                break;
            case 2:
                exitGame();
                break;
            default:
                ui.mainMenuOptionNotExist();
        }
    }

    /**
     * commences game of tictactoe
     */
    public void playGame(){

    }

    /**
     * exits the game
     */
    public void exitGame(){
        ui.gameExit();
        System.exit(0);
    }
}