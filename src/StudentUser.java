
public class StudentUser {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        
        s1.setData(111, "AAA", 90);
        s2.setData(112, "BBB", 80);
        s3.setData(113, "CCC", 30);
        s4.setData(114, "DDD", 40);
        s5.setData(115, "EEE", 50);
        Student.showPer(s1);
        Student.showPer(s2);
        Student.showPer(s3);
        Student.showPer(s4);
        Student.showPer(s5);
        Student.showAvg(s1, s2);    //{s1,s2}
        Student.showAvg(s1, s2, s3);//{s1,s2,s3}
        Student.showAvg(s1, s2, s3, s4);//{s1,s2,s3,s4}
        Student.showAvg(s1, s2, s3, s4, s5); //{s1,s2,s3,s4,s5}
        //Student.showAvg(s2, s3);
        //s1.showAvg(s2);
        //s1.showAvg(s3);
        //s3.showAvg(s1);
        //s1.showPer();
        //s2.showPer();
        //s3.showPer();
        
        
        
        
        //s1.showResult();
        //s2.showResult();
        //s3.showResult();
        
        //Student.showOverallResult();
    }
}
