public class Rectangle {
    int x;
    int y;

    public Rectangle(int l, int w){
        this.x = l;
        this.y = w;
    }

    public int calculateArea(){
        int area = x*y;
        return area;
    }

    public int calculatePerimeter(){
        int perimeter = 2*(x+y);
        return perimeter;
    }
}
