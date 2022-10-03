public class Rectangle {
    //your code here
    Point p1;
    Point p2;
    public Rectangle(Point p1, Point p2) {
        //your code here
        this.p1 = new Point(p1.getX(),p1.getY());
        this.p2 = new Point(p2.getX(),p2.getY());
    }
    //copy constructor
    public Rectangle(Rectangle rectangle) {
        //your code here
        this(rectangle.p1,rectangle.p2);
    }

    public void moveBy(int x, int y) {
        //your code here
        p1.setX(p1.getX()+x);
        p2.setX((p2.getX()+x));

        p1.setY(p1.getY()+y);
        p2.setY(p2.getY()+y);
    }

    @Override
    public String toString() {
        //your code here
        return String.format("Rectangle[(%d,%d),(%d,%d)]",p1.getX(),p1.getY(),p2.getX(),p2.getY());
    }
}