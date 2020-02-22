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
        ui.mainMenu();
        choice = kb.nextInt();

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