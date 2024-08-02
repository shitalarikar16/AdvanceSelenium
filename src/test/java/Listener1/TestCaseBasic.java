package Listener1;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import Baseclass.DwsBaseListener;



@Listeners(com.crm.Listener1.BasicListener.class)

public class TestCaseBasic extends DwsBaseListener{

	

@Test

	public void main1() throws IOException{

	

	String expected_result = "https://demowebshop.tricentis.com";

	String actual_result = driver.getCurrentUrl();

	assertEquals(expected_result,actual_result);



}



@Test

public void main2() {



String expected_result = "https://demowebshop.tricentis.com/";

String actual_result = driver.getCurrentUrl();

assertEquals(expected_result,actual_result);





}

}