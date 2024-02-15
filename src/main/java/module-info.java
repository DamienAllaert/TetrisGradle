module fr.damienallaert.tetris {
    exports fr.damienallaert.tetris;
    exports fr.damienallaert.tetris.controller;
    exports fr.damienallaert.tetris.model;

    opens fr.damienallaert.tetris to javafx.fxml;
    opens fr.damienallaert.tetris.controller to javafx.fxml;

    requires javafx.fxml;
    requires javafx.graphics;
    requires transitive javafx.controls;
    requires java.desktop;
    requires java.logging;
}