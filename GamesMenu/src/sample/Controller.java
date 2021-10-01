package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public int answer;

    @FXML
    public TextField userGuess;
    @FXML
    public Button playButton;
    @FXML
    public Button playAgain;
    @FXML
    public Button startButton;
    @FXML
    public Label gameResult;

    public void startGame(ActionEvent event){
        int random_int = (int)Math.floor(Math.random()*(999-1+1)+1);

        answer = random_int;
        startButton.setVisible(false);
        playButton.setVisible(true);
        userGuess.setVisible(true);

    }

    public void newGame(ActionEvent event){
        int random_int = (int)Math.floor(Math.random()*(999-1+1)+1);

        answer = random_int;

        gameResult.setText("Results");
        userGuess.setText("");

        playAgain.setVisible(false);
        playButton.setVisible(true);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playAgain.setOnAction(this::newGame);

    }

    public void checkNum(ActionEvent event) {
        String guess = userGuess.getText();

        //int numguess =Integer.parseInt(guess);

        int numguess =Integer.parseInt(guess);

        if(answer == numguess){
            gameResult.setText("IT WAS RIGHT!!");
            playAgain.setVisible(true);
            playButton.setVisible(false);

        }

        if(answer > numguess){
            gameResult.setText("it was to low");
        }

        if(answer < numguess){
            gameResult.setText("it was to high");
        }

    }

}