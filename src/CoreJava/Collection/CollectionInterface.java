package CoreJava.Collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import java.util.UUID;

/**
 * Created by p-star on 4/21/2017.
 */
public class CollectionInterface
{
    public static void main(String[] args)
    {
        String uniqueID = UUID.randomUUID().toString();
        Random random = new Random();

        Collection<Object> collection=new LinkedList<Object>();

        for ( int i=0;i<2;i++)
        {
            collection.add(random);
        }

        for (int i=0;i<collection.size();i++)
        {
            System.out.println(""+collection.toString());

        }
    }

}
