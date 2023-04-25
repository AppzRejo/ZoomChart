package TestSuitTestCases;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.ExcelReader;
import CommonUtil.ShorteningValues;

public class ShorteningValueTest {
  @Test(dataProvider = "FetchTestData")
  public void f(String n, String u) {
	  ShorteningValues result= new ShorteningValues();
	  result.shortening(n, u);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] FetchTestData() throws Exception {
	  ExcelReader reader= new ExcelReader();	
	  String path = System.getProperty("user.dir");
	  Object[][] testObjArray=ExcelReader.getTableArray(path+"\\src\\main\\java\\CommonUtil\\TestData.xlsx","Sheet");

          return testObjArray;
  }
  
  
}
