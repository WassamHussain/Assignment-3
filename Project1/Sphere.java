public class Sphere extends Shape3D implements Drawable{
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double volume() {
        return 4/3*Math.PI*radius*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw method of Sphere");
    }
}
