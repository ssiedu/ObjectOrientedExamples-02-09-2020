
//here we are creating the blueprint of a Circle.

public class Circle {

    //data-members (to define the property of an object)
    private double radius, area, circumference;
    
    //methods (to perform the operations on a object)
    public void setRadius(double r){
        radius=r;
    }
    public void computeArea(){
        area=3.14*radius*radius;
        System.out.println("Area of Circle : "+area);
    }
    public void computeCircumference(){
        circumference=2*3.14*radius;
        System.out.println("Circumference of Circle : "+circumference);
    }
    
}
