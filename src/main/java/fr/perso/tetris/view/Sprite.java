package fr.perso.tetris.view;

import javafx.scene.image.Image;

public class Sprite {

    private final Image image;

    private String name;

    public Sprite(String name, Image image) {
        this.name = name;
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public int getWidth() {
        return (int) image.getWidth();
    }

    public int getHeight() {
        return (int) image.getHeight();
    }

    public String getName() {
        return name;
    }

}
