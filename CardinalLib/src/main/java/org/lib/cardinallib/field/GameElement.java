package org.lib.cardinallib.field;

public abstract class GameElement {
    protected double x, y, orientation;

    public GameElement(double x, double y, double orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public abstract void update(double x, double y, double orientation);
}