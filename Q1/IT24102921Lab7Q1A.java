import java.util.Scanner;
public class IT24102921Lab7Q1A
{
 public static void main (String [] args)
 {
  
  int num;
  int sum= 0;
  int count= 1;
  double avg;
  
  Scanner m = new Scanner (System.in);
  
  System.out.print("Enter marks for four subjects:\n ");
  
  while (count < 5)
  {
    System.out.print("Enter Subject Mark "+count+ ":");
    num = m.nextInt();
   
    sum += num;
    count++;
  }

   avg = sum/ 4.0;
   System.out.println("Average is: "+ avg );

  if (avg >= 75)
  {
    System.out.println("Overall Grade is: Distinction");
  }
  else if (avg >=50)
  {
    System.out.println("Overall Grade is: Credit");
  }
  else
  {
    System.out.println("Overall Grade is: Fail");
  }
 }
}