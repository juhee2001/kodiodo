package drive;
import java.util.Scanner;
public class DonorException extends RuntimeException{
	
	 public DonorException(String string) {
		// TODO Auto-generated constructor stub
	}
	public void donation() throws RuntimeException
	   {
		   throw new DonorException("InvalidDonorException");
	   }
   public static void main(String args[])
   {
	  
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter your age");
	   int age=sc.nextInt();
	   System.out.println("Enter your weight");
	   int weight=sc.nextInt();
	   try
	   {
		   DonorException d=new DonorException("");
		   d.donation();
	   if(age>=21 && age<=60)
	   {
		   if(weight>=40 && weight<=70)
		   {
			   System.out.println("You  are valid for Donation");
		   }
	   }
	   
	   }
	   catch(DonorException e)
	   {
		   e.printStackTrace();
	   }
   }
}
