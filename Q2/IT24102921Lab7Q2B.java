public class IT24102921Lab7Q2B
{
 public static void main (String [] args)
 {

  int i,j;

  for (i=1; i<6; i++)
  {
   System.out.print(i+ " - ");
    
    for (j=1; j<=i; j++)
    {
      System.out.print(" * ");
    }
    System.out.println();
  }
 }
}