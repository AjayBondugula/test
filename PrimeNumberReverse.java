package jsp.org.app;

import java.util.Scanner;

public class PrimeNumberReverse 
{
	public static void main(String[] args)
	{
		try 
		{
			int count=0;
			Scanner sc=new Scanner(System.in);
			//input from user
			System.out.print("Enter Starting Number : ");
			int startNumber = sc.nextInt();
			System.out.print("Enter Ending Number : ");
			int endNumber = sc.nextInt();
			if(endNumber>startNumber)
			{
				System.out.println("Prime numbers between "+startNumber+" and "+endNumber+" are : ");
				
				for(int i=endNumber;i>=startNumber;i--)
				{
					count=0;
					for(int j =1;j<=i;j++)	
					{
						if(i % j == 0)
						{
							count = count+1;
						}
					}
					if(count== 2)
					{
						System.out.print(i+" ");
					}					
				}
			}
			else
			{
				throw new Exception("end number should not less than start number");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			//if we opened any files we need to close in this block .
			//like connections ,file related operations 
		}
		
	}
	
}

