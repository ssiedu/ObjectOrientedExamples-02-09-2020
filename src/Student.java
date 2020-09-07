public class Student {
  //instance (non-static)
  private int rno;
  private String name;
  private int per;
  //class (static)
  private static int totalPass;
  private static int totalFail;
  
  //this method needs to display the avg per of two students.
  public static void showAvg(Student tmp1, Student tmp2){
      System.out.println("Avg Per of "+tmp1.rno+","+tmp2.rno+" : "+(tmp1.per+tmp2.per)/2);
  }
 
  
  //This method will just display the percentage of a student.
  //this method is a static method and needs the instance variables (instance var belongs to an object)
  //so we will pass an object to this method through its parameter and using that object we will access
  //the instance variables
  public static void showPer(Student st){
      System.out.println("Percentage of "+st.rno+" : "+st.per);
  }
  
  //displaying the overall result of the class.
  public static void showOverallResult(){
      System.out.println("Total Passed Candidates : "+totalPass);
      System.out.println("Total Failed Candidates : "+totalFail);
  }
  //it is displaying the result of an individual student and also maitaining the overall result of the class
  public void showResult(){
      System.out.println("Roll Number  : "+rno);
      System.out.println("Stud's Name  : "+name);
      System.out.println("Per Scored   : "+per);
      if(per>=33){
          System.out.println("RESULT : PASSED");
          totalPass++;
      }else{
          System.out.println("RESULT : FAILED");
          totalFail++;
      }
      System.out.println("____________________________________________________");
  }
  
  //it is initializing the details of a student
  public void setData(int x, String y, int z){
      rno=x;
      name=y;
      per=z;
  }
}
