package ru.courses.geometry;

public class Line implements Measurable {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public double getLength() {
        double lenX = start.getX() - end.getX();
        double lenY = start.getY() - end.getY();
        return Math.sqrt(lenX * lenX + lenY * lenY);
    }
}
