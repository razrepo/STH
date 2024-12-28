package org.example.sth;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StickHero extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GameController controller = new GameController();
        GameEngine engine = new GameEngine("Player");
        GamePanel panel = new GamePanel(engine, controller);

        engine.init();
        controller.init(engine, panel);

        primaryStage.setTitle("Stick Hero");
        primaryStage.setScene(new Scene(panel, GamePanel.WIDTH, GamePanel.HEIGHT));
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.show();

        controller.start();
    }
}
