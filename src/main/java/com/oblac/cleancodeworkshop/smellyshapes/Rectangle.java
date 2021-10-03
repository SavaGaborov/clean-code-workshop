package com.oblac.cleancodeworkshop.smellyshapes;


public class Rectangle extends SimpleShape {

    protected Color c = new Color("Blue");
    Point point;
    int width;
    int height;

    public Rectangle(Point point, int width, int height) {
        this.point= point;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean contains(Point point) {
        return this.point.getY() <= point.getX() && point.getX() <= this.point.getX() + width && this.point.getY() <= point.getY() && point.getY() <= this.point.getY() + height;
    }

    public int calculate() {
        return width * height;
    }

    public int getX() {
        return point.getX();
    }

    public int getY() {
        return point.getY();
    }

    public String toString() {
        return String.format("Rectangle: (%d,%d) width=%d height=%d color=%s", point.getX(), point.getY(), width, height,
            c.getColorAsHex());
    }
}
