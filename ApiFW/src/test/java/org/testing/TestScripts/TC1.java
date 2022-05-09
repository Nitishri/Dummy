package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.Json;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.RandomData;
import org.testing.utilities.jsonParsing;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1 {
//post req
	//we require bodydata for the post req
	//we require the properties obj
	
	//this testcase will fetch the bodydata from the utility method
	
	static String responseidValue;
	@Test
	public  void testCase1() throws IOException {
		
		String bodyData = Json.loadJsonFile("../ApiFW/src/test/java/org/testing/Payloads/bodyData.json");
		String randomId = RandomData.random(); 
		bodyData = jsonVariable.jsonVariableReplacement(bodyData, "id", randomId);
		
		
		Properties pr = LoadPropertiesFile.propertiesFile("../ApiFW/URI.properties");
		
		HttpMethods http = new HttpMethods(pr);
		Response res = http.PostMethod(bodyData, "QA_ENV_APIStudents");
 responseidValue = jsonParsing.jsonParse(res.asString(),  "id");
 System.out.println("============TC1=============================");
 System.out.println("Status code is " + res.statusCode());
	System.out.println("Response is " + res.asString());
	 
	
	

		 
	}
 
}
