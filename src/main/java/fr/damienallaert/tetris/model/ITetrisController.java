package fr.damienallaert.tetris.model;

import javafx.stage.Stage;

public interface ITetrisController {

    void setStage(Stage stage);

    void setGame(TetrisGame game);

    void prepare();
}
