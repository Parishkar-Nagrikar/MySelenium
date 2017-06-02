package CoreJava.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by p-star on 4/21/2017.
 */
public  class SetInterface
{

    public static void main(String[] args)
    {
     // Create the sorted set
        SortedSet set = new TreeSet();

     // Add elements to the set
        set.add("b");
        set.add("c");
        set.add("a");

        //for each
        for (Object o :set)
        {
            System.out.println("Element is : " + o);
        }
    }
}