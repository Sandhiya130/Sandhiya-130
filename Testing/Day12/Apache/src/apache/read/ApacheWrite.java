package apache.read;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApacheWrite{
	public static void main(String[] args) throws Exception, IOException {
		//specify the path of the file
		FileInputStream fis= new FileInputStream("D:\\Sandhiya 130\\Testing\\Day12\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheet("Sheet1");
		
		//create a new row
		Row row= sh1.createRow(5);
		
		//create column
		Cell cell=row.createCell(0);
		
		cell.setCellValue(cell.getStringCellValue());
		
		//create new row value
		cell.setCellValue("Diksheeka");
		FileOutputStream fos= new FileOutputStream("D:\\Sandhiya 130\\Testing\\Day12\\TestData.xlsx");
		wb.write(fos);
		fos.close();
		
		System.out.println("End of file");
	}

}
