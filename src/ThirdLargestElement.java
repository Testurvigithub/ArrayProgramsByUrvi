
import java.util.Scanner;

public class ThirdLargestElement {

	public static void main(String[] args) 
	{
		
     int a[]=new int [10], max;
		
		Scanner sc=new Scanner(System.in);
		
	System.out.print("Enter the Array Elements:");
	
	for(int i=0; i<a.length;i++)
	{
		  a[i]=sc.nextInt();
	  }
	for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1; j<a.length; j++)
		  {
			  if(a[i]>a[j])
			  {
				  
				  max=a[i];
				  a[i]=a[j];
				  a[j]=max;
			  }
		  }
	  }
		  System.out.println("Third Largest Element a: " +a[a.length-3]);
	  }
	}

		  