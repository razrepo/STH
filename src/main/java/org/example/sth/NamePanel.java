package org.example.sth;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;


public class NamePanel extends Pane {
    private static final int BORDERS_LENGTH = 2;
    private static final int MAX_SIZE = 100;

    private Label name;

    public NamePanel(final GameEngine engine) {
        super();
        this.setPadding(new Insets(BORDERS_LENGTH, BORDERS_LENGTH, BORDERS_LENGTH, BORDERS_LENGTH));

        name = new Label(engine.getName());

        name.setPadding(new Insets(BORDERS_LENGTH, BORDERS_LENGTH, BORDERS_LENGTH, BORDERS_LENGTH));

        name.setMaxSize(MAX_SIZE, MAX_SIZE);

        name.setFont(new Font("Helvetica", 22));

        this.getChildren().add(name);
    }
}
