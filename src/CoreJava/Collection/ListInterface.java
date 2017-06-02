package CoreJava.Collection; /**
 * Created by p-star on 4/2/2017.
 */

import java.util.Stack;

public class ListInterface
{
    public static void main(String[] args)
    {
        Stack<String> al = new Stack<String>();

        al.add("12");
        al.add("A");
        al.add("qwerty");
        al.add("ytrewq");
        System.out.println("Al= " + al);

        for(int i=0;i<al.size();i++)
        {
            System.out.println("ArrayList @ index  "+i+"="+ al.get(i));
        }

    }

}
