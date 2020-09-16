
public class Trial {
    private int p, q;
    
    public Trial(int a, int b){p=a;q=b;}
    public void disp(){
        int p=100;                  //this method is having a local variable whose name is same as instance
        //System.out.println(p);      //local variable variable p (hide the instance var p)
        //if you still want to use instance variable p, you can access it with this ref (ref to calling obj)
        System.out.println(this.p);
        System.out.println(q);      //belongs to calling obj
        System.out.println("_________________");
    }
            
    public static void main(String[] args) {
        Trial ob1=new Trial(5,6);
        Trial ob2=new Trial(7,8);
        ob1.disp();
        ob2.disp();
        
        /*
        String s1=new String("indore");
        String s2=new String("indore");
        String s3=s2;
        boolean res1=(s1==s2);
        boolean res2=(s2==s3);
        boolean res3=s1.equals(s2);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        
        String s4=null;
        String s5=null;
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
        */
    }
}
