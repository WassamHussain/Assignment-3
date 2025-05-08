public class Circle extends Shape2D implements Drawable{
    private double radius;
    private Point centre;
    Circle(String name, boolean isfilled, double radius){
        super(name,isfilled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw method of Circle");
    }
}
