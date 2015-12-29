package GUI;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;
import Model.TicTacToeModel;

/**
 * Created by Phil on 12/29/2015.
 */
public class TicTacToeGUI extends Application implements Observer{

    private TicTacToeModel model;



    public void init() {
        model = new TicTacToeModel();
        model.addObserver( this );
    }

    public void start( Stage stage ){
        //stage.setScene( new Scene() );
        //stage.sizeToScene();
        //stage.show();
    }

    public void update( Observable o, Object arg ){}

    public static void main( String[] args ) {
        Application.launch( args );
    }
}
