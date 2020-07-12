class Circle {

    double radius;

    public double getLength() {
        return radius * Math.PI * 2;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}