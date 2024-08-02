

package chronologicalOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chronologicalOrderAnnotation {

 @BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
 @BeforeTest
   public void beforeTest()
	{
		System.out.println("beforeTest");
	}
 @BeforeClass
 public void beforeClass()
	{
		System.out.println("beforeClass");
	}
 @BeforeMethod
 public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
 
 @Test
 
 
 public void testcase()
	{
		System.out.println("testcase");
	}
 
 @AfterMethod
 public void afterMethod()
	{
		System.out.println("afterMethod");
	}
 	@AfterClass
 	 public void afterclass()
 		{
 			System.out.println("afterclass");
 		}
 	
 	@AfterTest
 	 public void afterTest()
 		{
 			System.out.println("aftertest");
 		}
 	
 	@AfterSuite
 	 public void aftersuite()
 		{
 			System.out.println("aftersuite");
 		}
 
 
 
 
 
}
