package fr.perso.tetris;

import fr.perso.tetris.controller.TetrisController;
import fr.perso.tetris.model.TetrisGame;
import fr.perso.tetris.view.ISpriteStore;
import fr.perso.tetris.view.SpriteStore;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tetris extends Application {

    private static final int GAME_WIDTH = 800;

    private static final int GAME_HEIGHT = 600;


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // On commence par charger la vue et son contrôleur.
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fr.perso.tetris/view/tetris.fxml"));
        System.out.println();
        Parent viewContent = fxmlLoader.load();
        ISpriteStore spriteStore = new SpriteStore();
        TetrisController controller = fxmlLoader.getController();
        controller.setStage(primaryStage);

        TetrisGame game = new TetrisGame();
        controller.setGame(game);
        game.setController(controller);
        game.prepare();

        Scene scene = new Scene(viewContent, GAME_WIDTH, GAME_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TetrisFX");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
