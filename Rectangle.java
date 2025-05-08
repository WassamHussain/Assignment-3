public class Rectangle extends Shape2D implements Drawable{
    private double length;
    private double width;
    private Point topleftcorner;

    public Rectangle(String name,boolean isfilled , double width, double length) {
        super(name,isfilled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public void draw() {
        System.out.println("Draw method of Rectangle");
    }

    public Point getTopleftcorner() {
        return topleftcorner;
    }

    public void setTopleftcorner(Point topleftcorner) {
        this.topleftcorner = topleftcorner;
    }
}
