package CoreJava.EclipsImports.LinkList;

import java.util.LinkedList;

public class DemoLinkList 
{

	public static void main(String[] args)
	{
         		LinkedList l=new LinkedList();
         		
         		l.add(10);
         		l.add(20);
         		l.add(30);
         		l.add(40);
         		l.add(50);
         		l.add(60);
         		System.out.println(l);
         		
         		l.addFirst(-99);
         		System.out.println(l);
         		l.addLast(null);
         		System.out.println(l);

	}

}
