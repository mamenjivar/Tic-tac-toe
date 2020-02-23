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
    int gameChoice = 0;
    String choiceXorOUser = "";

    // String[] boardArray; // keeps track of x's and o's on the board

    // Default constructor
    GameEngine() {
        ui = new UserInterface();
        board = new Board();

        kb = new Scanner(System.in);

        // boardArray = new String[9];
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

        board.printBoardFull();

        boolean loop = true;
        while(loop) {
            ui.userChooses();
            gameChoice = kb.nextInt();


            if(board.isValid(gameChoice - 1)){
                // can throw exception when array out of bounds
                board.addtoBoardUser(gameChoice - 1);
            } else {
                ui.invalidChoiceBoard();
            }

            loop = false;
        }

        board.printPlayingBoard();


        // CHECK: if option is already taken
        // CHECK: if board is full
        // CHECK: throw exception if array out of bounds
    }

    /**
     * have user choose X or O to play the game
     */
    public void decisionXorO() {
        boolean loop = true;

        while (loop) {
            ui.chooseXorO();
            choiceXorOUser = kb.nextLine();
            System.out.println();

            if (choiceXorOUser.toUpperCase().equals("X") || choiceXorOUser.toUpperCase().equals("O")) {
                board.setXoroUser(choiceXorOUser);
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