package org.example.sth;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class GameController implements EventHandler<ActionEvent> {
    public static final int FPS = 60;
    private GameEngine engine;
    private GamePanel panel;
    private boolean isIncreasing;
    private boolean isRunning;
    public boolean upsideDown;

    public void init(GameEngine engine, GamePanel panel) {
        this.engine = engine;
        this.panel = panel;
    }

    public void start() {
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                panel.repaint();
            }
        };
        gameLoop.start();
    }

    public void nextRect(boolean isMushroomEaten) {
        if (isMushroomEaten)
            engine.mushroomEaten();
        engine.nextRectangle();
    }

    public void gameOver() {
        panel.gameOver();
    }

    public void replay() {
        engine.init();
        panel.replay(engine, this);
    }

    public boolean isUpsideDown() {
        return upsideDown;
    }

    @Override
    public void handle(ActionEvent event) {
        panel.goToGame();
    }

    public void mouseClicked(MouseEvent e) {
        upsideDown = !upsideDown;
    }

    public void mousePressed(MouseEvent e) {
        if (engine.isMoving()) {
            return;
        }

        new Thread(() -> {
            isIncreasing = true;
            while (isIncreasing) {
                engine.increaseStickLength();
                try {
                    Thread.sleep(1000 / GameController.FPS);
                } catch (InterruptedException ignored) {
                }
            }
        }).start();
    }

    public void mouseReleased(MouseEvent e) {
        isIncreasing = false;
        engine.setMoving(true);
        engine.checkForGameOver();
    }
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e){
            panel.goToGame();
    }
    }
