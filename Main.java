//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle("c",false,6);
        Shape circle1=new Circle("c",false,6);
        Shape circle2=new Circle("c",false,6);
        Shape circle3 =new Circle("c",false,6);
        System.out.println(circle3.area());
       Shape2D shape=new Circle("a",true,5.0);
        Shape2D shape1=new Circle("a",true,5.0);
        Shape2D shape2=new Circle("a",true,5.0);
        Shape2D shape3=new Circle("a",true,5.0);
        Shape2D shape4=new Circle("a",true,5.0);
        Shape2D shape5=new Circle("a",true,5.0);
        System.out.println(shape.area());
       Shape2D rectangle=new Rectangle("b",false,5,6);
        Shape2D rectangle1=new Rectangle("b",false,5,6);
        Shape2D rectangle2=new Rectangle("b",false,5,6);
        Rectangle rectangle3=new Rectangle("b",false,5,6);
        Shape2D rectangle4=new Rectangle("b",false,5,6);
        Shape2D rectangle5=new Rectangle("b",false,5,6);
        System.out.println(rectangle.area());
        Shape3D sphere=new Sphere("d",5);
        Shape3D sphere1=new Sphere("d",5);
        Shape3D sphere2=new Sphere("d",5);
        Shape3D sphere3=new Sphere("d",5);
        System.out.println(sphere.area());
        System.out.println(sphere.volume());
        Shape3D cube=new Cube("e",5);
        System.out.println(cube.area());
        System.out.println(cube.volume());

        Shape[] arr =new Shape[20];
        arr[0]= circle3;
        arr[1]=shape;
        arr[2]=rectangle;
        arr[3]=sphere;
        arr[4]=cube;
        arr[5]=circle1;
        arr[6]=circle2;
        arr[7]=circle3;
        arr[8]=shape1;
        arr[9]=shape2;
        arr[10]=shape3;
        arr[11]=shape4;
        arr[12]=rectangle1;
        arr[13]=rectangle2;
        arr[14]=rectangle3;
        arr[15]=rectangle4;
        arr[16]=rectangle5;
        arr[17]=sphere1;
        arr[18]=sphere2;
        arr[19]=sphere3;

        ShapeUtils shapeUtils=new ShapeUtils();
        shapeUtils.shapedetails(arr);
        shapeUtils.increasereclength(arr,5);
        shapeUtils.drawDrawables(arr);
        Point point=new Point(5,10);
        Rectangle rectangle6=new Rectangle("f",false,5,5);
        rectangle6.setTopleftcorner(point);
        rectangle3.setTopleftcorner(point);

        shapeUtils.intersect(arr,rectangle6);





    }
}