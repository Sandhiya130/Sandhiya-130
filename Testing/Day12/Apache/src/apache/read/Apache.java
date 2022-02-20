package apache.read;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Apache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//path of the file
			File src=new File("D:\\Sandhiya 130\\Testing\\Day12\\TestData.xlsx");
			
			//load the file
			
			FileInputStream fis=new FileInputStream(src);
			
		//load the work book
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//load the sheet
			
		    XSSFSheet sh1=wb.getSheetAt(0);
		
		//spectify the row and cell count which we want to read
		
		System.out.println(sh1.getRow(0).getCell(0));
		System.out.println(sh1.getRow(1).getCell(0));
		System.out.println(sh1.getRow(2).getCell(0));
		System.out.println(sh1.getRow(3).getCell(0));
		System.out.println(sh1.getRow(4).getCell(0));
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
