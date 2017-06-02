package CoreJava.ArrayS;

/**
 * Created by p-star on 4/21/2017.
 */
public class ArrayDemo
{
    //dataType[] arr; (or)
    //dataType []arr; (or)
    //dataType arr[];
    public static void main(String[] args)
    {
        int Id[]= new int[5];
        char[] name=new char[5];
        float []dec=new float[5];
        double[] salary={22.2,11.1,33.3,44.4};

        Id[0]=0;
        Id[1]=1;
        Id[2]=2;
        Id[3]=3;
        Id[4]=4;

        for (int i=0;i<Id.length;i++)
        {
            System.out.println( "Integer id Array="+Id[i]);
        }
        for (int i=0;i<salary.length;i++)
        {
            System.out.println( "Double Salary Array="+salary[i]);
        }

    }
}
