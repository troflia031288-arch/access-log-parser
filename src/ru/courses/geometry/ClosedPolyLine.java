package ru.courses.geometry;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        super(points);
    }
    @Override
    public double getLength() {
        double Length1 = super.getLength();

        // Расстояние от первой точки до последней
        Point firstPoint = points[0];
        Point lastPoint = points[points.length - 1];

        double lenX = firstPoint.getX() - lastPoint.getX();
        double lenY = firstPoint.getY() - lastPoint.getY();
        double Length2 = Math.sqrt(lenX * lenX + lenY * lenY);

        return Length1 + Length2;
    }

}