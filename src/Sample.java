import java.util.Random;
import java.util.UUID;

/**
 * Created by p-star on 4/23/2017.
 */
public class Sample
{
    public static String getID()
    {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public static void main(String[] args)
    {
        UUID uuid = UUID.randomUUID();
        System.out.println( uuid.toString() );

        Random rand = new Random();

        int  random= rand.nextInt(1000000000);
        String numberAsString = Integer.toString(random);
        System.out.println(numberAsString);

        System.out.println("Hello World");

    }
}
