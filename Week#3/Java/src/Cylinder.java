public class Cylinder {
    private float radius;
    private float height;

    final float pi;
    public Cylinder(float r, float h){
        this.radius = r;
        this.height = h;
        this.pi = 3.14f;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }

    public void setHeight(float height){
        this.height = height;
    }
    public float getHeight(){
        return height;
    }

    public float calcSurface(){
        float surface = (2*pi*radius*height) + (2*pi*(radius*radius));
        return surface;

    }
    public float calcVolume(){
        float volume = (pi*(radius*radius)*height);
        return volume;

    }


    public static void main(String[] args){
        Cylinder c1 = new Cylinder(4, 10);
        System.out.println(c1.getRadius() + "\n" + c1.getHeight() + "\n" + "----------");
        System.out.println("Surface: " + c1.calcSurface());
        System.out.println("Volume: " + c1.calcVolume());

    }

}
