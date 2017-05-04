package DoctorPlus.DataProvider;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by p-star on 5/4/2017.
 */
public class DataProviderFromExel
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("data.xls");

            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            HSSFSheet worksheet = workbook.getSheet("Sheet1");

            int rowCount= worksheet.getPhysicalNumberOfRows();

            for(int i=1;i<rowCount;i++)
            {
                HSSFRow row = worksheet.getRow(i);
                HSSFCell cellA1 = row.getCell(0);
                String a1Val = cellA1.getStringCellValue();
                HSSFCell cellA2 = row.getCell(0);
                String a2Val = cellA2.getStringCellValue();
                System.out.println("username:" + a1Val+", Password:" + a2Val);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}