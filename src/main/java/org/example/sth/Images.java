package org.example.sth;

import javafx.scene.image.Image;
import java.io.File;

public class Images {
    public static Image background;
    public static Image startButton;
    public static Image stand;
    public static Image walk1;
    public static Image walk2;
    public static Image walk3;
    public static Image walk4;
    public static Image replay;
    public static Image mushroom;

    public static final int BACKGROUND_WIDTH = 500;
    public static final int BACKGROUND_HEIGHT = 600;
    public static final int MARIO_WIDTH = 25;
    public static final int MARIO_HEIGHT = 50;

    static {

        try {

            background = new Image(new File("images/background.png").toURI().toString());
            startButton = new Image(new File("images/StartButton.png").toURI().toString());
            stand = new Image(new File("images/stand.png").toURI().toString());
            walk1 = new Image(new File("images/walk1.png").toURI().toString());
            walk2 = new Image(new File("images/walk2.png").toURI().toString());
            walk3 = new Image(new File("images/walk3.png").toURI().toString());
            walk4 = new Image(new File("images/walk2.png").toURI().toString());
            replay = new Image(new File("images/replay.png").toURI().toString());
            mushroom = new Image(new File("images/mushroom.png").toURI().toString());

        } catch (Exception e) {

        }
    }
}
