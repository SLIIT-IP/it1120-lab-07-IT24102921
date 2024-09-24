import java.util.Scanner;
public class IT24102921Lab7Q1B
{
 public static void main (String [] args)
 {
 
  int stu,num,mark;
  int sum = 0;
  double avg;
  String grade;

  Scanner m = new Scanner (System.in);

  for (stu = 1; stu < 4; stu++)
  {
    System.out.println("Student "+stu );
    
    System.out.print("Enter marks: ");

    for (num = 1; num<5; num++)
    {
     mark = m.nextInt();
     sum += mark;
    }

    avg= sum/4.0;
    System.out.println("Average is : "+avg);

    if (avg>= 75)
    {
      grade = "Distinction";
    }
    else if (avg>= 50)
    {
      grade = "Credit";
    }
    else 
    {
      grade = "Fail";
    }
 
    System.out.println("Overall Grade is : "+grade);
    System.out.println();
   }
 }
}


      
    
    