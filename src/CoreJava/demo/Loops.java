package CoreJava.demo;

public class Loops
{
  public static void main(String args[])
  {
	int i=10;
	do
	{
		System.out.println("Do while loop"); 
		i++;
	}while (i<=5);

	  int j=0;
   System.out.println("while loop");
	while(j<=10)
	{
	  System.out.println(j++);
	}
	System.out.println("For loop");
	for(int k=0;k<=10;k++)
	{
		 System.out.println(k);
	}
  }	
}