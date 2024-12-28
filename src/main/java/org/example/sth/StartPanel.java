package org.example.sth;


import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class StartPanel extends Pane {
    private GameController controller;
    Button button;

    public StartPanel(GameController controller) {
        this.controller = controller;

        ImageView buttonImage = new ImageView(new Image("file:images/StartButton.png"));
        button = new Button("", buttonImage);

        button.setOnAction(controller::actionPerformed);
        button.setLayoutX(Images.BACKGROUND_WIDTH/2 - 75);
        button.setLayoutY(Images.BACKGROUND_HEIGHT/2 + 25);
        button.setPrefSize(150, 150);
        getChildren().add(button);

        setPrefSize(Images.BACKGROUND_WIDTH, Images.BACKGROUND_HEIGHT);
    }

    @Override
    protected void layoutChildren() {
        ImageView bgImage = new ImageView(new Image("file:images/background.png"));
        bgImage.setX(-450);
        getChildren().add(bgImage);

        Text title1 = new Text("STICK");
        title1.setFont(Font.font("Trattatello", 100));
        title1.setFill(Color.DARKGRAY);
        title1.setX(125);
        title1.setY(120);
        getChildren().add(title1);

        Text title2 = new Text("HERO");
        title2.setFont(Font.font("Trattatello", 100));
        title2.setFill(Color.DARKGRAY);
        title2.setX(130);
        title2.setY(200);
        getChildren().add(title2);
    }
}

