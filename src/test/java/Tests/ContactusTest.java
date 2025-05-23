package Tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactusTest {
  @Test
  public void tc004_verifytestingcourse() throws Exception {
	  System.out.println("testingcourse");
	  WebDriver driver=new ChromeDriver();
	  //system.out.println;
	  FileInputStream file=new FileInputStream("filepath");  
	  
	  HSSFWorkbook  wb=new HSSFWorkbook(file);  
	  }
}
