package GUI;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

import Model.TicTacToeModel;

/**
 * The visual representation of the Tic Tac Toe Game
 * It will keep track of the users moves and provides real-time
 * updates, along with a button to restart the game.
 *
 */
public class TicTacToeGUI extends Application implements Observer{

    private TicTacToeModel model;


    @Override
    public void init() {
        model = new TicTacToeModel();
        model.addObserver( this );
    }

    @Override
    public void start( Stage stage ){
        //stage.setScene( new Scene() );
        //stage.sizeToScene();
        //stage.show();
    }

    @Override
    public void update( Observable o, Object arg ){}

    public static void main( String[] args ) {
        Application.launch( args );
    }
}
