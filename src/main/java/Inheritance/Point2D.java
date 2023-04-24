package Inheritance;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    Point2D(){

    }
    Point2D(float x , float y){

    }

    public float getX(){
        return this.x;
    }
    public void setX(float x){
       this.x = x;
    }

    public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float [] array={this.x,this.y};
        return array;
    }
    @Override
    public String toString(){
        return "Tọa độ điểm X:"+this.x+"/n Tọa độ điểm Y: "+this.y;
    }
}
