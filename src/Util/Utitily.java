package Util;

import java.util.Random;
import java.util.UUID;

/**
 * Created by p-star on 4/23/2017.
 */
public class Utitily
{

    public static String getName()
    {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public static String getID()
    {
        Random rand = new Random();

        int  random= rand.nextInt(1000000000);
        String numberAsString = Integer.toString(random);
        return numberAsString;
    }
}
