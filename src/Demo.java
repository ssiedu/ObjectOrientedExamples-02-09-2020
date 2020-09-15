public class Demo {
    private int x, y;   //instance variables of Demo class (properties of Demo object)
        
    public void finalize(){
        System.out.println("This method will be called automatically before object's garbage collection");
    }
   
    public Demo(){
    }
                    //20
    public Demo(int p){
        this();
        x=p;
    }
                  //20    30
    public Demo(int a, int b){
        this(a);
        y=b;
    }
    public void show(){
        System.out.println(x+","+y);
    }
    /*
    public Demo(Demo tmp){
        x=tmp.x; 
        y=tmp.y;
    }
    public Demo(){}
    public Demo(int p){
        x=p;
    }
    public Demo(int a, int b){
        x=a;
        y=b;
    }
    */
    public static void main(String[] args) {
        Demo d1=new Demo(10);       // one-arg
        d1.show();
        
        Demo d2=new Demo(20,30);    //two-arg
        d2.show();
        
        
       /*
       Demo d1=new Demo(10,20);  //zero-arg
       Demo d2=new Demo(30,40);
       Demo d3=new Demo(50);
       Demo d4=new Demo();
       Demo d5=new Demo(d3);    //we want the new object d5 to be the clone of d3
     
       d1.show();
       d2.show();
       d3.show();
       d4.show();
       d5.show();
       */
    }
}
