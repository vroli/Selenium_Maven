package testcases;

import java.util.concurrent.TimeUnit;

//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	WebDriver driver;

	/*//XSSFWorkbook wbook; //-after  excel download
	//XSSFSheet sheet;
	
	@BeforeTest
	public void DataSetUp() throws IOException {
		
		
		FileInputStream fis = new FileInputStream("exceldata.xlsx");
		
		this.wbook = new XSSFWorkbook(fis);
		this.sheet = wbook.getSheet("Sheet1");
		
		report = new ExtentReports("ExtentReport.html");
		
	}
	
	@AfterTest
	public void DataClean() throws IOException {
		
		wbook.close();
		
		
	}

	
	}*/
	@BeforeMethod
	public void SetUp() {
	
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}
	
	@AfterMethod
	public void TearDown() {
	driver.close();	
	}
}
