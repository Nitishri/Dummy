package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2 {
	@Test
	public void testcase2() throws IOException
	{
	
Properties pr = LoadPropertiesFile.propertiesFile("../ApiFW/URI.properties");
		
		HttpMethods http = new HttpMethods(pr);
	Response  res =	http.getMethod("QA_ENV_APIStudents", TC1.responseidValue );   
	
	System.out.println("=========================TC2===========================");
	System.out.println("Status code is " + res.statusCode());
	System.out.println("Response is " + res.asString());
	 
	
	
	
	
	
	
	
	
}
}