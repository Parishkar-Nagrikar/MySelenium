package CoreJava.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by p-star on 3/29/2017.
 */
public class DemoDateII
{
    public static void main(String[] args) throws ParseException
    {
        Date d=new Date();
        System.out.println(d);
        String startDate = "06/04/2016 09:29:58";
        String stopDate = "01/06/2016 10:31:48";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d1 ;
        Date d2 ;

        d1 = format.parse(startDate);
        d2 = format.parse(stopDate);

        long diff = d2.getTime() - d1.getTime(); //difference in milliseconds

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.print(diffDays + " days, ");
        System.out.print(diffHours + " hours, ");
        System.out.print(diffMinutes + " minutes, ");
        System.out.print(diffSeconds + " seconds.");

    }

}
