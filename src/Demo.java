public class Demo {
    private int x, y; //non-static (instance)
    private static int p, q;    //static (class)

    public static void main(String[] args) {
       Demo d1=new Demo();  //first object (instance)
       Demo d2=new Demo();  //second object
       Demo d3=new Demo();  //third object
       d1.x=10;             //storing 10 to x of d1
       d2.x=20;             //storing 20 to x of d2
       d3.x=30;             //storing 30 to x of d3
       System.out.println(d1.x);
       System.out.println(d2.x);
       System.out.println(d3.x);
       d1.p=100;            //storing 100 to class variable p
       d2.p=200;            //storing 200 to class variable p (prev value 100 will overwritten)
       d3.p=300;            //storing 300 to class variable p (prev value 200 will overwritten now p is 300)
       System.out.println(d1.p);
       System.out.println(d2.p);
       System.out.println(d3.p);
    }
}
