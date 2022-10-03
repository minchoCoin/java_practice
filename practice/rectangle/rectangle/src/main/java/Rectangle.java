public class Rectangle {
    //Your code here
    Point p1;
    Point p2;
    public Rectangle(Point p1, Point p2) {
        //Your code here
        this.p1= new Point(p1.getX(),p1.getY());
        this.p2= new Point(p2.getX(),p2.getY());
    }

    public void moveBy(int x, int y) {
        //Your code here
        p1.setX(p1.getX()+x);
        p2.setX(p2.getX()+x);

        p1.setY((p1.getY()+y));
        p2.setY((p2.getY()+y));
    }

    public void moveBy(int position) {
        //Your code here
        p1.setX(p1.getX()+position);
        p2.setX(p2.getX()+position);

        p1.setY((p1.getY()+position));
        p2.setY((p2.getY()+position));
    }

    @Override
    public String toString() {
        //Your code here

        return String.format("Rectangle[(%d, %d, (%d, %d)]",p1.getX(),p1.getY(),p2.getX(),p2.getY());
    }
}