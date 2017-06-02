package CoreJava.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by p-star on 3/29/2017.
 String dateStr0= "23-June- 2016"
 String dateStr1= "23 | June 16  8:34"
 String dateStr2= "2016 - 06 - 23 | 8:34:23"
 String dateStr3= "Thursday 2016/06/23"
 String dateStr4= "23-06-2016 | thu | 8:34"
 String dateStr5= "8:34:22"
 */
//converting String Date to Date
public class StringToDate
{
    public static void main(String[] args) throws ParseException
    {
        String dateStr0= "23-June- 2016";
        SimpleDateFormat sd1=new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(sd1.parse(dateStr0));

        String dateStr1= "23 | June 16  8:34";
        SimpleDateFormat sd2=new SimpleDateFormat("dd | MMMM yy hh:mm");
        System.out.println(sd2.parse(dateStr1));

        String dateStr2= "2016 - 06 - 23 | 8:34:23";
        SimpleDateFormat sd3=new SimpleDateFormat("yyyy - MM - dd | hh:mm:ss");
        System.out.println( sd3.parse(dateStr2));

        String dateStr3= "Thursday 2016/06/23";
        SimpleDateFormat sd4=new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd4.parse(dateStr3));

        String dateStr4= "23-06-2016 | thu | 8:34";
        SimpleDateFormat sd5=new SimpleDateFormat("dd-MM-yyyy | EEE | hh:mm");
        System.out.println(sd5.parse(dateStr4));

        String dateStr5= "8:34:22";
        SimpleDateFormat sd6=new SimpleDateFormat("hh:mm:ss");
        System.out.println(sd6.parse(dateStr5));
    }
}
