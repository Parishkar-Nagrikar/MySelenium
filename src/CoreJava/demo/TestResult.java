package CoreJava.demo;

class TestResult
{
public static void main(String args[])
{
	int marks=40;
	
	if(marks>=75)
	{
	  	System.out.println(marks+"=distingsion" );
	}
	else if(marks>=60 && marks<75)
	{
     	System.out.println(marks+"=pass with first class" );
	}
	else if(marks>=40 && marks<60)
	{
       System.out.println(marks+"=pass with Second class" );
	}
	else
	{
		System.out.println(marks+"=fail");
	}
}
}