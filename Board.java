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
    String xoro = "";

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
     * Sets if user will be X or O (setter)
     * 
     * @param xoro
     */
    public void setXoro(String xoro){
        this.xoro = xoro.toUpperCase();
    }

    /**
     * getter for x or o
     * 
     * @return
     */
    public String getXoro(){
        return xoro;
    }
}