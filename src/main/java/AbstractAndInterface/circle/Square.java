package AbstractAndInterface.circle;

public class Square extends Rectangle implements Resizeable,Colorable {
    private double width,length;
    Square(double squareEdge){
        this.width=squareEdge;
        this.length=squareEdge;

    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent){
        this.width=this.width*percent/100;
        this.length=this.length*percent/100;
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides..");
    }
}
