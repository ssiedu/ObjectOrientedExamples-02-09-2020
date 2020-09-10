
public class VAExample {

    public static void add(){
        System.out.println("NOTHING-TO-ADD.......");
    }
    public static void add(int a, int b){
        System.out.println("SUM =  "+(a+b));
    }
    public static void add(String...v){
        String res="";
        for(String s:v){
            res=res+s;
        }
        System.out.println(res);
    }
    //this add method is having a parameter of type int-varargs (that can accept 0 to n of ints)
    public static void add(int... v){ //will called for 1string and 0-n int values
        int sum=0;
        
        for(int num:v){
            sum=sum+num;
        }
        
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add();
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add(10,20,30,40,50);
        add("aa","bb");         //{"aa","bb"}
        add("xx","yy","zz");
    }
}
/*
    some points to be remember for using varargs
    1. only one varargs per method.
    2. normal parameters (non-varargs) are allowed with varargs.
    3. varargs must be always on last position in parameter list.
    4. varargs methods can also be overloaded.


*/