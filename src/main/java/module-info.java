module fr.perso.tetris {
    exports fr.perso.tetris;
    exports fr.perso.tetris.controller;
    exports fr.perso.tetris.model;

    opens fr.perso.tetris to javafx.fxml;
    opens fr.perso.tetris.controller to javafx.fxml;

    requires javafx.fxml;
    requires javafx.graphics;
    requires transitive javafx.controls;
    requires java.desktop;
    requires java.logging;
}