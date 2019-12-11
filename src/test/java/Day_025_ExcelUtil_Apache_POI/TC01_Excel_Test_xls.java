package Day_025_ExcelUtil_Apache_POI;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.*;

//Step 1
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.CellType;


public  class TC01_Excel_Test_xls
{
		
	
	//Step 2
    
    
    public HSSFWorkbook workbook = null;
    public HSSFSheet sheet = null;
    public HSSFRow row = null;
    public HSSFCell cell = null;
    
    public FileInputStream fis = null;
    public FileOutputStream fout=null;
    
    
    
    
    String TestURL,UserName,Password;
    WebDriver driver;

    @Test
    public void hello()throws Exception
    {
    	
    	 TC01_Excel_Test_xls eat=new TC01_Excel_Test_xls();
    	 
    	 TestURL=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality.xls","Sheet1",1,0);
    	 UserName=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality.xls","Sheet1",1,1);
		 Password=eat.getCellData("C://HTML Report//OrangeHRM6//TC01_Nationality.xls","Sheet1",1,2);
		
		 System.out.println("TestURL : "+TestURL);
		 System.out.println("UserName : "+UserName);
		 System.out.println("Password : "+Password);
		
		 
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	     driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
		 driver.get(TestURL);
				
		 findElement(By.name("txtUsername")).sendKeys(UserName);
		 findElement(By.name("txtPassword")).sendKeys(Password);
		 findElement(By.id("btnLogin")).click();
		 driver.quit();

    }
    
 
    
  
    public String getCellData(String xlFilePath, String sheetName,int rowNum,int column) throws Exception
    {
    	
    	
    	fis = new FileInputStream(xlFilePath); //C://HTML Report//OrangeHRM6//TC01_Nationality.xls
    	
        workbook = new HSSFWorkbook(fis); //WorkBook-->/TC01_Nationality.xls
        sheet = workbook.getSheet(sheetName); //Sheet1
        row = sheet.getRow(rowNum); //1
        cell = row.getCell(column); //0
       
        if(cell.getCellTypeEnum() == CellType.STRING)
        {	
        	String str6=cell.getStringCellValue();
        	workbook.close();
        	fis.close();
            return str6;
        }
        else if(cell.getCellTypeEnum() == CellType.NUMERIC)
        {	
        	
        	int i = (int)cell.getNumericCellValue(); 
        	String str6 = String.valueOf(i); 
        	workbook.close();
        	fis.close();
            return str6;
        }
        else 
        {
        	String str6=cell.getStringCellValue();
        	workbook.close();
        	fis.close();
            return str6;
        }
        
    } 
    
      
    
    
    
    
    

	 public  WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}

	
    
    
    
    
    
    
    
    
    
}

