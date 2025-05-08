public class Cube extends Shape3D implements Drawable{
    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public void draw() {
        System.out.println("Draw method of Cube");
    }
}
