package CoreJava.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    Created by p-star on 3/28/2017.
 **/

/**
        String dateStr0= "23-June- 2016"
        String dateStr1= "23 | June 16  8:34"
        String dateStr2= "2016 - 06 - 23 | 8:34:23"
        String dateStr3= "Thursday 2016/06/23"
        String dateStr4= "23-06-2016 | thurs | 8:34"
        String dateStr4= "23-06-2016 | thurs | 8:34"
        String dateStr5= "8:34:22"
 **/
public class DateDemo
{
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        //System.out.println(date);

        SimpleDateFormat sd1=new SimpleDateFormat("dd/mm/yy");
        System.out.println( sd1.format(date));

        SimpleDateFormat sd2=new SimpleDateFormat("E");
        System.out.println(sd2.format(date));

 //     String dateStr0= "23-June- 2016"
        SimpleDateFormat sd3=new SimpleDateFormat("dd-MMMM-YYYY");
        System.out.println(sd3.format(date));

 //     String dateStr1= "23 | June 16  8:34"
        SimpleDateFormat sd4=new SimpleDateFormat("dd | MMMM yy  mm:ss");
        System.out.println(sd4.format(date));

//      String dateStr2= "2016 - 06 - 23 | 8:34:23"
        SimpleDateFormat sd5=new SimpleDateFormat("YYYY-MM-dd | HH:MM:SS");
        System.out.println(sd5.format(date));

//      String dateStr3= "Thursday 2016/06/23"
        SimpleDateFormat sd6=new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd6.format(date));

 //     String dateStr4= "23-06-2016 | thurs | 8:34"
        SimpleDateFormat sd7=new SimpleDateFormat("dd-MM-yyyy | EE | hh:mm");
        System.out.println(sd7.format(date));

//      String dateStr5= "8:34:22"
        SimpleDateFormat sd8=new SimpleDateFormat("hh:mm:ss");
        System.out.println(sd8.format(date));


        String str = "30-2-2016";
        System.out.println("The Given date in string is : "+ str);
        Date date1;
        SimpleDateFormat sd11= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("The Formatted date is");
        System.out.println(sd11.parse(str));

    }
}
