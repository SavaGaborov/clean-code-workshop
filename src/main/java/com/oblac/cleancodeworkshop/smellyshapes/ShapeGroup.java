package com.oblac.cleancodeworkshop.smellyshapes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ShapeGroup extends ComplexShape {

    public enum Readibility {
        READ_ONLY,
        READ_WRITE
    }

    public static final int INITIAL_SIZE_OF_SHAPES = 10;
    public static final int GROWN_SIZE_OF_SHAPES = 10;
    List<Shape> shapes = new ArrayList<>();
    int size = 0;

    public ShapeGroup() {
    }

    public ShapeGroup(Shape[] shapes, final Readibility readibility) {
        this.shapes = new ArrayList<>();
        this.size = shapes.length;
        this.readOnly = readibility == Readibility.READ_ONLY ? true : false;
    }

    public void add(Shape shape) {
        if (!readOnly) {
            if (contains(shape)) {
                return;
            }
            this.shapes.add(shape);
            this.size = this.shapes.size();
        }
    }

    public boolean contains(Shape shape) {
        return this.shapes.contains(shape);
    }

    public boolean contains(int x, int y) {
        for (Shape shape : shapes) {
            if (shape != null) {
                if (shape.contains(x, y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ShapeGroup forEachShape(Consumer<Shape> shapeConsumer) {

    }
}
