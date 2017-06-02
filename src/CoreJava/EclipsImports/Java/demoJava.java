package CoreJava.EclipsImports.Java;

public class demoJava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int g=4;
		System.out.println(++g * 6);
		
		
		int x=4;
		int y=0;
		
		for(;y<5;++y)
		{
			if(y%5==0)
			{
				continue;
			}
			else if (y==7)
			{
				break;
			}
			else {
				System.out.println(y);
			}
		}	
		
		Integer a=127;
		Integer b=127;
		
		System.out.println(a==b);
		
		Integer c=127;
		Integer d=127;
		
		System.out.println(c==d);
	}
}
