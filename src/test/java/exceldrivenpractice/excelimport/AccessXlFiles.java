package exceldrivenpractice.excelimport;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessXlFiles {

	public static void main(String[] args) throws IOException {
		
        FileInputStream fis=new FileInputStream("C://Users//Ramendra Gupta//Documents//Book.xlsx");
        @SuppressWarnings("resource")
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
        int sheets=workbook.getNumberOfSheets();
        
        for(int i=0;i<sheets;i++)
        {
        	if(workbook.getSheetName(i).equalsIgnoreCase("second"))
        	{
        		XSSFSheet sheet=workbook.getSheetAt(i);
        		Iterator<Row> rows=sheet.iterator();
        		Row firstrow=rows.next();
        		Iterator<Cell> ce=firstrow.cellIterator();
        		int k=0;
        		int column = 0;
        		
        		while(ce.hasNext())
        		{
        			Cell value=ce.next();
        			if(value.getStringCellValue().equalsIgnoreCase("Data 3")) 
        			{
        				column=k;
        			}
        			k++;
        		}
        		System.out.println(column);
        		
        	}
        }
	}

}
