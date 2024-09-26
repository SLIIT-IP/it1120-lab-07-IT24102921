import java.util.Scanner;
public class IT24102921Lab7Q3
{
 public static void main (String [] args)
 {

  int amount = 0;
  double discountedAmount;
  double discount;
  char modeOfPayment;
   
  Scanner m = new Scanner (System.in);

  for (int i = 1; i<6; i++)
  {
   System.out.println("Customer "+i);

  System.out.print("Enter total bill amount: ");
  amount = m.nextInt();

  System.out.print("Enter mode of payment (C for cash, o for other):"); 
  modeOfPayment = m.next().charAt(0);

  discountedAmount = amount;

  if (modeOfPayment == 'C' || modeOfPayment == 'c' )
  {
   discount = amount * 0.05;
   System.out.println("Discount is: "+discount);
   discountedAmount = amount - discount;
  }
  else if (modeOfPayment == 'O' || modeOfPayment == 'o')
  {
   System.out.println("No discount applicable");
  }
  else 
  {
   System.out.println("Payment mode is not valid");
  }

  System.out.println("Amount to be paid: "+discountedAmount);
  System.out.println();
  }
 }
}
