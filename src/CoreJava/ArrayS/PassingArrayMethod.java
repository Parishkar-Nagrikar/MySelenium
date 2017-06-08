package CoreJava.ArrayS;

/**
 * Created by p-star on 4/21/2017.
 */
public class  PassingArrayMethod
{
    public void min(int arr[])
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
            {
                min = arr[i];
            }
        System.out.println(min);
    }
    public void num(int arr[])
    {
        int num=arr[0];
       for (int i=0;i<=arr.length;i++)
       {
           System.out.println( "print="+arr[i]);
       }
    }

    public static void main(String args[]) throws Exception
    {
        PassingArrayMethod meth=new PassingArrayMethod();
        int a[] = {33, 3, 4, 5};
        meth.min(a);//passing array to method

        int num[]={01,02,03,04,05,06,07};
        meth.num(num);//passing array to method
    }
}