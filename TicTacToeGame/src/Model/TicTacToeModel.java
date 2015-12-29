package Model;

import java.util.Observable;


/**
 * The backend functionality and data representation
 * of the Tic Tac Toe game. Includes piece positions,
 * legal moves and win determination.
 *
 * @author Rachael & Phil <3
 */
public class TicTacToeModel extends Observable {

    private String[][] board;

    public TicTacToeModel(){
        board = new String[3][3];
    }

    public void initializeBoard(){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col ++){
                board[row][col] = " ";
            }
        }
    }

    public String toString(){
        String b = "";
        b += "-------------" + "\n";
        for (int row = 0; row < 3; row++) {
            b += "| ";
            for (int col = 0; col < 3; col++) {
                b += board[row][col] + " | ";
            }
            b += "\n" + "-------------" + "\n";
        }
        return b;
    }

    public static void main(String[] args) {
        // write your code here
        TicTacToeModel tttm = new TicTacToeModel();
        tttm.initializeBoard();
        System.out.println(tttm);
    }
}

