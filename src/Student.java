public class Student {
    private int rno, maths, physics, chemistry, total;
    private String name;
    
    public void setData(int a, String b, int c, int d, int e){
        rno=a; name=b; maths=c; physics=d; chemistry=e;
    }
    public void computeTotal(){
        total=maths+physics+chemistry;
        System.out.println("Total Marks Scored By : "+rno+" Is : "+total);
    }
    public void computeGrade(){
        String grade="";
        int per=total/3;
        if(per>=90){
            grade="A";
        }else if(per>=80){
            grade="B";
        }else if(per>=60){
            grade="C";
        }else{
            grade="D";
        }
        System.out.println("Grade Obtained By : "+rno+" Is  : "+grade);
    }
}
