
public class StudentUser {

    public static void main(String[] args) {

        Student s1=new Student();
        s1.setData(111, "AAA", 90, 80, 70);
        s1.computeTotal();
        s1.computeGrade();
        
        Student s2=new Student();
        s2.setData(112, "BBB", 40, 50, 60);
        s2.computeTotal();
        s2.computeGrade();
    }
}
