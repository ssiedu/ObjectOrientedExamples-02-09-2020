public class Student {
  //instance (non-static)
  private int rno;
  private String name;
  private int per;
  //class (static)
  private static int totalPass;
  private static int totalFail;
  
  
  public static void showAvg(Student... s){
      //all objects passed to this method will be accepted as an array 1st obj to s[0], 2nd to s[1] and so on
      //to find avg per we will add the per of all objects and will divide by no students (size of array)
      int size=s.length;
      int total=0;
      for(Student tmp:s){
          total=total+tmp.per;
      }
      System.out.println("Avg of "+size+" Students : "+(total/size));
      
  }
  /*
  //here we are having overloaded method showAvg
  //showAvg method is having 3 forms : one is with 2 args and another is with 3 args and 4 args
  
  //this method needs to display the avg per of two students.
  public static void showAvg(Student tmp1, Student tmp2){
      System.out.println("Avg Per of "+tmp1.rno+","+tmp2.rno+" : "+(tmp1.per+tmp2.per)/2);
  }
  //this methd needs to display the avg per of three students
  public static void showAvg(Student tmp1, Student tmp2, Student tmp3){
      System.out.println("Avg Per of "+tmp1.rno+","+tmp2.rno+","+tmp3.rno+" : "+(tmp1.per+tmp2.per+tmp3.per)/3);
  }
  
  public static void showAvg(Student tmp1, Student tmp2, Student tmp3, Student tmp4){
      System.out.println("Avg Per of "+tmp1.rno+","+tmp2.rno+","+tmp3.rno+","+tmp4.rno+" : "+(tmp1.per+tmp2.per+tmp3.per+tmp4.rno)/4);
  }
    */
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
