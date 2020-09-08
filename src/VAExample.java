
public class VAExample {

    //this add method is having a parameter of type int-varargs (that can accept 0 to n of ints)
    public static void add(int... v){
        int sum=0;
        
        for(int num:v){
            sum=sum+num;
        }
        
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add();                  //{}
        add(10,20);             //{10,20}
        add(10,20,30);
        add(10,20,30,40);
        add(10,20,30,40,50);
        add(10,20,30,40,50,60);
        add(1,2,3,4,5,6,7,8,9,10);
    }
}
/*
    internally varargs uses the concept of arrays.
*/