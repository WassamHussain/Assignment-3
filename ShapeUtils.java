public class ShapeUtils {
    public ShapeUtils() {
    }
    public void shapedetails(Shape[] shape){
        for(int i=0;i<20;i++){
            if(shape[i]instanceof Shape3D){
                System.out.println(shape[i].area());
                System.out.println(((Shape3D) shape[i]).volume());

            }
            if(shape[i]instanceof Shape2D){
                System.out.println(shape[i].area());

            }
        }

    }
    public void increasereclength(Shape [] shape,int length){
        for(int i=0;i<20;i++){
            if(shape[i]instanceof Rectangle){
                ((Rectangle) shape[i]).setLength(((Rectangle) shape[i]).getLength()+length);
            }
            //System.out.println(((Rectangle) shape[i]).getLength());
        }
    }
    public void drawDrawables(Drawable[]drawables){
        for(int i=0;i<20;i++){
            drawables[i].draw();
        }
    }
    public void intersect(Shape[] shape, Rectangle rectangle) {
        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shape[i];

                // Coordinates and dimensions of the rectangles
                r.setTopleftcorner(new Point(5,10));
                int x1 = r.getTopleftcorner().getX();
                int y1 = r.getTopleftcorner().getY();
                int w1 = (int) r.getWidth();
                int h1 = (int) r.getLength();

                int x2 = rectangle.getTopleftcorner().getX();
                int y2 = rectangle.getTopleftcorner().getY();
                int w2 = (int)rectangle.getWidth();
                int h2 = (int)rectangle.getLength();

                // Check if the rectangles intersect
                if (x1 < x2 + w2 && x1 + w1 > x2 && y1 < y2 + h2 && y1 + h1 > y2) {
                    System.out.println("intersecting");
                } else {
                    System.out.println("not intersecting");
                }
            }
        }
    }

}
