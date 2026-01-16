interface Measurable {
    double getLength();
}

class Line implements Measurable {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public double getLength() {
        double lenX = start.x - end.x;
        double lenY = start.y - end.y;
        return Math.sqrt(lenX * lenX + lenY * lenY);
    }
}

class PolyLine implements Measurable {

    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    @Override
    public double getLength() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i + 1].x;
            len2 = points[i].y - points[i + 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
}

class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        super(points);
    }
        @Override
        public double getLength() {
            double Length1 = super.getLength();

            // Расстояние от первой точки до последней
            Point firstPoint = points[0];
            Point lastPoint = points[points.length - 1];

            double len1 = firstPoint.x - lastPoint.x;
            double len2 = firstPoint.y - lastPoint.y;
            double Length2 = Math.sqrt(len1 * len1 + len2 * len2);

            return Length1 + Length2;
        }

    }



