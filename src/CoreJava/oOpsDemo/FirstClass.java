package CoreJava.oOpsDemo;

/**
 * Created by p-star on 4/3/2017.
 */
public class FirstClass
{
    protected int id;
    String name;
    boolean gender;

     public FirstClass()
     {
         id=100;
         name = "parish";
         gender=true;
     }


    public static void main(String[] args)
    {
        FirstClass f=new FirstClass();

        System.out.println(f.id);

    }
}
