public class Circle {
    final float pi = 3.14f;
    float r;
    int c;

    public Circle(int c){
        this.c = c;
        this.r = c/(2*pi);
    }
    public float calculateArea(){
        float area = pi*(r*r);
        return area;
    }

    public float calculatePerimeter(){
        float perimeter = 2*pi*r;
        return perimeter;
    }
}
