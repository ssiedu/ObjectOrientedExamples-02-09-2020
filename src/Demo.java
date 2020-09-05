public class Demo {
    private int x; //non-static (instance)
    private static int p;    //static (class)

    public void show(){         //non-static method
        System.out.println(x);  //instance
        System.out.println(p);  //class
    }
    public static void disp(){  //static method
        //System.out.println(x);  //instance
        System.out.println(p);  //class
    }
    
    public static void main(String[] args) {
       
    }
}
