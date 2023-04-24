package Inheritance;

public class Cylinder extends Circle{
    private final double PI=3.14;
    private double height;
    public Cylinder(String color, boolean filled,double radius,double height ){
            super(radius,color,filled);
            this.height=height;
    }

    public double calculateVolumeCylinder (){
        return this.height * this.getArea()/3;
    }
    @Override
    public String toString() {
       return  super.toString()+
               ", height3" + this.height;

    }
    public static void main(String[] args) {
        Cylinder a =new Cylinder("red",true,5.0,2.0);
        System.out.println(a.calculateVolumeCylinder());
    }
}
