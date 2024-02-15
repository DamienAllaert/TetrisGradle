package fr.damienallaert.tetris.controller;

import fr.damienallaert.tetris.model.ITetrisController;
import fr.damienallaert.tetris.model.TetrisGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TetrisController implements ITetrisController {

    private Stage stage;

    private TetrisGame game;

    @FXML
    private GridPane gameGrid;

    @FXML
    private GridPane holdEmplacement;

    @FXML
    private Text levelDisplay;

    @FXML
    private Text lineDisplay;

    @FXML
    private GridPane nextGrid;

    @FXML
    private Button optionButton;

    @FXML
    private Button playButtton;

    @FXML
    private Button replayButton;

    @FXML
    private Text scoreDisplay;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void setGame(TetrisGame game) {
        this.game = game;
    }

    @Override
    public void prepare() {

    }

    @FXML
    void onOptionClick(ActionEvent event) {

    }

    @FXML
    void onPlayClick(ActionEvent event) {

    }

    @FXML
    void onReplayClick(ActionEvent event) {

    }
}
