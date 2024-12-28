package org.example.sth;

import javafx.scene.layout.BorderPane;

public class GamePanel extends BorderPane {
    private PlayPanel playPanel;
    private StartPanel startPanel;
    private NamePanel namePanel;
    private GameOverPanel gameOverPanel;

    private GameEngine engine;
    private GameController controller;

    public void init(GameEngine engine, GameController controller) {
        this.engine = engine;
        this.controller = controller;

        gameOverPanel = new GameOverPanel(engine, controller);
        namePanel = new NamePanel(engine);
        startPanel = new StartPanel(controller);
        playPanel = new PlayPanel(engine, controller);
        playPanel.setOnMouseClicked(controller::handle);

        this.setCenter(startPanel);
        this.setBottom(namePanel);
    }

    public void goToGame() {
        this.setCenter(playPanel);
    }

    public void gameOver() {
        this.setCenter(gameOverPanel);
    }

    public void replay(GameEngine engine, GameController controller) {
        this.getChildren().removeAll(gameOverPanel, namePanel);
        init(engine, controller);
    }
}
