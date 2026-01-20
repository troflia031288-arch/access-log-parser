package ru.courses.geometry;

public class PolyLine implements Measurable {

    protected Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    @Override
    public double getLength() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double lenX = points[i].getX() - points[i + 1].getX();
            double lenY = points[i].getY() - points[i + 1].getY();
            sum += Math.sqrt(lenX * lenX + lenY * lenY);
        }
        return sum;
    }
}





