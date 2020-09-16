
public class Test {

    private int x, y;

    public boolean equals(Test tmp){
        if(x==tmp.x && y==tmp.y){
            return true;
        }else{
            return false;
        }
    }
    
    public Test(int a, int b){x=a;y=b;}
    public void show(){System.out.println(x+","+y);}
    public static void main(String[] args) {
        
        
        
        Test t1=new Test(10,20);
        Test t2=new Test(10,20);
        
        boolean b1=(t1==t2);            //comparing ref
        boolean b2=(t1.equals(t2));     //comparing obj's data
        
        System.out.println(b1);
        System.out.println(b2);
        
        
        
        /*
        boolean res=(t1==t2);
        System.out.println(res);
        Test t3=t2;
        boolean res1=(t2==t3);
        System.out.println(res1);
        */
        
        /*
        Test t1;    //only declaring a ref
        new Test(10,20);    //creating an object but not storing its address (its eligible for GC)
        Test t2=new Test(30,40);    //creating an object and storing its address to reference t2.
        Test t3=t2;                 //address stored in t2 is assigned to new reference t3.
        t1=t2;                      //address stored in t2 is assigned to an existing reference t1
        t1.show();
        t2.show();
        t3.show();
        System.out.println("_______________________________________________");
        t3=new Test(50,60);
        t1.show();
        t2.show();
        t3.show();
        System.out.println("_______________________________________________");
        t2=t3;
        t1.show();
        t2.show();
        t3.show();
        System.out.println("_______________________________________________");
        */
    }

}
