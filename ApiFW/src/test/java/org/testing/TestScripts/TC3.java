package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3 {
	@Test
public void testcase3() throws IOException
{
	
	Properties pr = LoadPropertiesFile.propertiesFile("../ApiFW/URI.properties");
	
	HttpMethods http = new HttpMethods(pr);
Response  res =	http.getAllRecords("QA_ENV_APIStudents");   


System.out.println("=========================TC3===========================");
System.out.println("Status code is " + res.statusCode());
System.out.println("Response is " + res.asString());
 


	
}
}