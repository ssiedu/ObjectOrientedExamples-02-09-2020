
public class StudentUser {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        s1.setData(111,"AAA",90);
        s2.setData(112,"BBB",80);
        s3.setData(113,"CCC",30);
        
        s1.showResult();
        s2.showResult();
        s3.showResult();
        
        Student.showOverallResult();
    }
}
