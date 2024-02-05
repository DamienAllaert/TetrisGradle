package fr.perso.tetris.view;

public interface ISpriteStore {

    Sprite getSprite(String identifier);

    default int getSpriteSize() {
        return 16;
    }
}
