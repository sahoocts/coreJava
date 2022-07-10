package Java8.MCQS;
class Point {
    protected int x, y;
   public Point(){

   }
    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}
public class Test3 {
    public static void main(String args[])
    {
        Point p = new Point();
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}
