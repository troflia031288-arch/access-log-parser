class Fraction extends Number {
    int num, denum; //числитель и знаменатель

    public Fraction(int num, int denum) {
        if (denum == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum; // double
    }

    @Override
    public float floatValue() {
        return (float) num / denum; // float
    }

    @Override
    public int intValue() {
        return num / denum; // int
    }

    @Override
    public long longValue() {
        return num / denum; // long
    }

}