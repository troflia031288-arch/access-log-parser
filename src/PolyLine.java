interface Measurable {
    double getLength();
}

class Line implements Measurable {
    private Point start;
    private Point end;

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

class PolyLine implements Measurable {

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

            double lenX = firstPoint.getX() - lastPoint.getX();
            double lenY = firstPoint.getY() - lastPoint.getY();
            double Length2 = Math.sqrt(lenX * lenX + lenY * lenY);

            return Length1 + Length2;
        }

    }



