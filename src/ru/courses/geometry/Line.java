package ru.courses.geometry;

public class Line implements Cloneable {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line other = (Line) obj;
        return (start.equals(other.start) && end.equals(other.end)) ||
                (start.equals(other.end) && end.equals(other.start));
    }

    @Override
    public int hashCode() {
        return start.hashCode() + end.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Point clonedStart = (Point) start.clone();
        Point clonedEnd = (Point) end.clone();
        return new Line(clonedStart, clonedEnd);
    }

    // Строковое представление линии
    @Override
    public String toString() {
        return "Линия от точки " + start + " до точки " + end;
    }
}
