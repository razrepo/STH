package org.example.sth;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public class GameOverPanel extends Pane {
    private GameEngine engine;
    Button button;

    public GameOverPanel(final GameEngine engine, final GameController controller) {
        this.engine = engine;
        button = new Button();

        button.setGraphic(new ImageView(new Image("file:Images/replay.png")));

        button.setOnAction(e -> controller.replay());
        button.setLayoutX(Images.BACKGROUND_WIDTH / 2 - 180);
        button.setLayoutY(Images.BACKGROUND_HEIGHT / 2 + 100);
        button.setPrefSize(360, 120);
        getChildren().add(button);

        setPrefSize(Images.BACKGROUND_WIDTH, Images.BACKGROUND_HEIGHT);
    }

    @Override
    protected void layoutChildren() {
        ImageView background = new ImageView(new Image("file:Images/background.png"));
        background.setX(-450);
        getChildren().add(background);

        Text gameOverText = new Text(35, 120, "GAME OVER");
        gameOverText.setFont(new Font("Trattatello", 85));
        gameOverText.setFill(Color.BLACK);
        getChildren().add(gameOverText);

        Text scoreText = new Text(130, 250, "SCORE : " + engine.getScore());
        scoreText.setFont(new Font("Trattatello", 60));
        getChildren().add(scoreText);

        Text mushroomText = new Text(40, 330, "MUSHROOMS : " + engine.getMushroomNum());
        mushroomText.setFont(new Font("Trattatello", 60));
        getChildren().add(mushroomText);
    }
}

