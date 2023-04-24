package AbstractAndInterface.circle;

public class ResizeableTest {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Shape [] array=new Shape[3];
        array[0]=new Circle(2.0);
        array[1]=new Square(3);
        array[2]=new Rectangle(2,3);
        double random = (double)(Math.random() * (max - min + 1) + min);
        for (Shape value:array){
            if(value instanceof Circle){
                System.out.println("a");
            }
            else if(value instanceof Square){
                System.out.println("b");
            }
            else if (value instanceof Rectangle){
                System.out.println("c");
            }
        }

    }
}
