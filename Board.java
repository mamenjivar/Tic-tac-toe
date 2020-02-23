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
    String xoroOpponent = "";

    // keeps track of x's and o's on the board in an array
    String[] boardArray;

    /**
     * default constructor
     */
    Board() {
        boardArray = new String[9];
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
     * checks if user wins
     * @return
     */
    public boolean didUserWin() {
        // 1st row
        if((boardArray[0] == xoroUser) && (boardArray[1] == xoroUser) && (boardArray[2] == xoroUser)){
            return true;
        } // 2nd row
         else if((boardArray[3] == xoroUser) && (boardArray[4] == xoroUser) && (boardArray[5] == xoroUser)) {
            return true;
        } // 3rd row
        else if((boardArray[6] == xoroUser) && (boardArray[7] == xoroUser) && (boardArray[8] == xoroUser)){
            return true;
        } // 1st column
        else if((boardArray[0] == xoroUser) && (boardArray[3] == xoroUser) && (boardArray[6] == xoroUser)) {
            return true;
        } // 2nd column
        else if((boardArray[1] == xoroUser) && (boardArray[4] == xoroUser) && (boardArray[7] == xoroUser)) {
            return true;
        } // 3rd column
        else if ((boardArray[2] == xoroUser) && (boardArray[5] == xoroUser) && (boardArray[8] == xoroUser)) {
            return true;
        } // diagonal left
        else if((boardArray[0] == xoroUser) && (boardArray[4] == xoroUser) && (boardArray[8] == xoroUser)) {
            return true;
        } // diagonal right
        else if((boardArray[2] == xoroUser) && (boardArray[4] == xoroUser) && (boardArray[6] == xoroUser)) {
            return true;
        } // no winner
        else {
            return false;
        }
    }

    /**
     * checks if opponent wins
     * 
     * @return
     */
    public boolean didOpponentWin() {
        // 1st row
        if ((boardArray[0] == xoroOpponent) && (boardArray[1] == xoroOpponent) && (boardArray[2] == xoroOpponent)) {
            return true;
        } // 2nd row
        else if ((boardArray[3] == xoroOpponent) && (boardArray[4] == xoroOpponent) && (boardArray[5] == xoroOpponent)) {
            return true;
        } // 3rd row
        else if ((boardArray[6] == xoroOpponent) && (boardArray[7] == xoroOpponent) && (boardArray[8] == xoroOpponent)) {
            return true;
        } // 1st column
        else if ((boardArray[0] == xoroOpponent) && (boardArray[3] == xoroOpponent) && (boardArray[6] == xoroOpponent)) {
            return true;
        } // 2nd column
        else if ((boardArray[1] == xoroOpponent) && (boardArray[4] == xoroOpponent) && (boardArray[7] == xoroOpponent)) {
            return true;
        } // 3rd column
        else if ((boardArray[2] == xoroOpponent) && (boardArray[5] == xoroOpponent) && (boardArray[8] == xoroOpponent)) {
            return true;
        } // diagonal left
        else if ((boardArray[0] == xoroOpponent) && (boardArray[4] == xoroOpponent) && (boardArray[8] == xoroOpponent)) {
            return true;
        } //  diagonal right
        else if ((boardArray[2] == xoroOpponent) && (boardArray[4] == xoroOpponent) && (boardArray[6] == xoroOpponent)) {
            return true;
        } // no winner yet
        else {
            return false;
        }
    }

    /**
     * checks what user chooses, then
     * gives oponnent the opposite choice
     */
    public void setOpponent(){
        if(xoroUser.equals("X")) {
            xoroOpponent = "O";
        } else {
            xoroOpponent = "X";
        }
    }

    /**
     * Sets if user will be X or O (setter)
     * 
     * @param xoro
     */
    public void setXoroUser(String xoro){
        this.xoroUser = xoro.toUpperCase();

        setOpponent();
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
     * checks if game board is full
     * 
     * @return
     * true = not empty
     * false = empty
     */
    public boolean isBoardFull(){
        for(int i = 0; i < boardArray.length; i++){
            if(boardArray[i] == null){
                return false;
            }
        }
        return true;
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
     * Adds value x or o to board in array
     * 
     * @param xoro
     */
    public void addtoBoardOpponent(int xoro){
        boardArray[xoro] = xoroOpponent;
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