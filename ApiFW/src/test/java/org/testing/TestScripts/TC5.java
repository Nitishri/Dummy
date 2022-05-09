package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.Json;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5 {
	@Test
	public void testcase5() throws IOException
	{
	
		Properties pr = LoadPropertiesFile.propertiesFile("../ApiFW/URI.properties");
		
		
		HttpMethods http = new HttpMethods(pr);
		Response res = http.DeleteRecord("QA_ENV_APIStudents", TC1.responseidValue);
		
		
		   
		System.out.println("=========================TC5  ===========================");
		System.out.println("Status code is " + res.statusCode());
		System.out.println("Response is " + res.asString());
		 
			
	
	
	
	
}
}