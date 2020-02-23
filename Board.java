/**
 * Tic Tac Toe
 * 
 * author: Miguel Menjivar
 * Date: February 22, 2020
 * 
 * Board.java
 * This file will be in charge of
 * rendering the game board logic
 */
class Board {
    // user x or o
    String xoroUser = "";

    // keeps track of x's and o's on the board in an array
    String[] boardArray;

    /**
     * default constructor
     */
    Board() {
        boardArray = new String[9];
    }

    /**
     * Prints an empty board
     */
    public void printBoardEmpty() {
        System.out.println("   |   |   ");
        System.out.println("   |   |   ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println("   |   |   ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println("   |   |   ");
        System.out.println("   |   |   ");
    }

    /**
     * prints a number board for reference
     */
    public void printBoardFull() {
        System.out.println("   |   |   ");
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("   |   |   ");
    }

    /**
     * print the playing board with x's or o's or empty
     * with numbers
     */
    public void printPlayingBoard() {

        System.out.println("   |   |   ");
        System.out.println(" " + ((boardArray[0] != null) ? boardArray[0] : 1) + " | " + ((boardArray[1] != null) ? boardArray[1] : 2) + " | "+ ((boardArray[2] != null) ? boardArray[2] : 3) + " ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" " + ((boardArray[3] != null) ? boardArray[3] : 4) + " | " + ((boardArray[4] != null) ? boardArray[4] : 5) + " | " + ((boardArray[5] != null) ? boardArray[5] : 6) + " ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" " + ((boardArray[6] != null) ? boardArray[6] : 7) + " | " + ((boardArray[7] != null) ? boardArray[7] : 8) + " | " + ((boardArray[8] != null) ? boardArray[8] : 9) + " ");
        System.out.println("   |   |   ");
    }

    /**
     * Sets if user will be X or O (setter)
     * 
     * @param xoro
     */
    public void setXoroUser(String xoro){
        this.xoroUser = xoro.toUpperCase();
    }

    /**
     * Checks if tile is empty or not
     * 
     * @param tile
     * @return
     * true = empty
     * false = not empty
     */
    public boolean isValid(int tile){
        if(boardArray[tile] == null){
            return true;
        }

        return false;            
    }

    /**
     * Adds value x or o to board in array
     * 
     * @param xoro
     */
    public void addtoBoardUser(int xoro) {
        boardArray[xoro] = xoroUser;
    }

    /**
     * getter for x or o
     * 
     * @return
     */
    public String getXoroUser(){
        return xoroUser;
    }
}