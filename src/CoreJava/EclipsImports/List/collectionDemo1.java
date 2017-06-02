package CoreJava.EclipsImports.List;

import java.util.ArrayList;
import java.util.List;

public class collectionDemo1
{

	public static void main(String[] args) 
	{
		System.out.println("Hello WOrld!");
		
		List<Object> l=new ArrayList<Object>();
		
//Add Method		
		l.add(null);
		l.add(10);
		l.add("A");
		l.add(10);
		l.add(null);
		System.out.println("this is list l"+l);
		
//Remove Method
		l.remove("A");
		System.out.println("this is list l"+l);
		l.add(3,"A");
		System.out.println("this is list l"+l);
//Add all
		
		List m=new ArrayList();
		m.addAll(l);
		System.out.println("this is list m"+m);

//get
		Object i=l.get(3); 
		
		System.out.println(" Element@ index 3 is = "+i);
//set
		System.out.println(l);
		l.set(3, "xyz");
		System.out.println(l);
		
//indexOf
		int j=l.indexOf(null);
		
		System.out.println("this is the output of index of function with element ="+j);
//size
		System.out.println("Size of Arreylist = "+l.size());
		
		
		
		System.out.println("*********************************************************");
		
		

        ArrayList<Object> al = new ArrayList<Object>();

        al.add(12);
        al.add("A");
        al.add('D');
        al.add(12);
        System.out.println("Al= " + al);

        System.out.println("Size of Array =" + al.size());

        al.remove('D');
        System.out.println("Al= " + al);

        System.out.println("Si9ze of Array =" + al.size());

        al.set(3, "qwerty");
        System.out.println("Al= " + al);

        al.get(2);
        System.out.println("Al= " + al);

	}
}