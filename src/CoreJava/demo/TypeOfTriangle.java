package CoreJava.demo;

public class TypeOfTriangle
{
public static void main(String args[])
{
	int angle1=120;
	int angle2=30;
	int angle3=30;
	
	int totalAngle=angle1+angle2+angle3;
	
	if(totalAngle==180)
	{
		if(angle1==angle2 && angle1==angle3)
		{
			System.out.println("Equilateral Tringle");
		}
		else if(angle1==90 || angle2==90 || angle3==90)
		{
			System.out.println("Right Angle a Tringle");
		}
		else if((angle1==angle2  && angle1!=angle3)||(angle1==angle3 && angle1!=angle2)|| (angle2==angle3 && angle1!=angle3))
		{
			System.out.println("isoscelus a Tringle");
		}
		else if(angle1!=angle2 && angle1!=angle3 )
		{
			System.out.println("scelen a Tringle");
		}
	}
	else
	{
		System.out.println("Not a Tringle");
	}
}
}