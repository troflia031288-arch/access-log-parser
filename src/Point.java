class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y); //Вызываем конструктор класса Point
        this.z = z;
    }
}