package org.example.sth;

import java.util.Random;


public class Rectangle {
    public static final int MIN_SIZE = 50;
    public static final int MAX_SIZE = 120;
    private int width;

    public Rectangle() {
        Random rand = new Random();

        width = 0;
        while (width < Rectangle.MIN_SIZE)
            width = rand.nextInt(Rectangle.MAX_SIZE);
    }

    public int getWidth() {
        return width;
    }
}
