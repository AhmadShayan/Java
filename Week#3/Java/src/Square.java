public class Square {
    int size;

    public Square(int size){
        this.size = size;
    }

    public int calculateArea(){
        int area = size*size;
        return area;
    }

    public int calculatePerimeter(){
        int perimeter = size * 4;
        return perimeter;
    }
}
