class PolyLine {

    Point [] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i+1].x;
            len2 = points[i].y - points[i+1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
}

class ClosedPolyLine extends PolyLine {
    @Override
    public double length() {
        double Length1 = super.length();

        // Расстояние от первой точки до последней
        Point firstPoint = points[0];
        Point lastPoint = points[points.length - 1];

        double len1 = firstPoint.x - lastPoint.x;
        double len2 = firstPoint.y - lastPoint.y;
        double Length2 = Math.sqrt(len1 * len1 + len2 * len2);

        return Length1 + Length2;
    }
}