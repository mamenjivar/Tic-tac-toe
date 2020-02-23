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
    Board board;
    
    Scanner kb;

    int choiceMainMenu = 0;
    String choiceXorO = "";

    // Default constructor
    GameEngine() {
        ui = new UserInterface();
        board = new Board();

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
                choiceMainMenu = kb.nextInt();
                kb.nextLine();
                System.out.println();

                if(choiceMainMenu == 1 || choiceMainMenu == 2) {
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

        switch(choiceMainMenu){
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
        decisionXorO();

        
    }

    /**
     * have user choose X or O to play the game
     */
    public void decisionXorO() {
        boolean loop = true;

        while (loop) {
            ui.chooseXorO();
            choiceXorO = kb.nextLine();
            System.out.println();

            if (choiceXorO.toUpperCase().equals("X") || choiceXorO.toUpperCase().equals("O")) {
                loop = false;
            } else {
                ui.xorOErrorChoice();
            }
        }
    }

    /**
     * exits the game
     */
    public void exitGame(){
        ui.gameExit();
        System.exit(0);
    }
}