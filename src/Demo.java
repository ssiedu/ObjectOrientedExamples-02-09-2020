public class Demo {
    private int x, y;   //instance variables of Demo class (properties of Demo object)
    
    public void show(){
        System.out.println(x+","+y);
    }
    public Demo(int a, int b){
        x=a;
        y=b;
    }
    public static void main(String[] args) {
    
       Demo d1=new Demo(10,20);
       Demo d2=new Demo(30,40);
       Demo d3=new Demo(50,60);
     
       d1.show();
       d2.show();
       d3.show();
    }
}
