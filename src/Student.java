public class Student {
  //instance (non-static)
  private int rno;
  private String name;
  private int per;
  //class (static)
  private static int totalPass;
  private static int totalFail;
  
  public static void showOverallResult(){
      System.out.println("Total Passed Candidates : "+totalPass);
      System.out.println("Total Failed Candidates : "+totalFail);
  }
  public void showResult(){
      System.out.println("____________________________________________________");
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
  public void setData(int x, String y, int z){
      rno=x;
      name=y;
      per=z;
  }
}
