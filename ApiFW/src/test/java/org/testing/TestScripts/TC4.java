package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.Json;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 {
	@Test
	public void testcase4() throws IOException
	
	{
	
Properties pr = LoadPropertiesFile.propertiesFile("../ApiFW/URI.properties");
	
	

String bodyData = Json.loadJsonFile("..//ApiFW/src/test/java/org/testing/Payloads/bodyDataUpdate.json");
bodyData = jsonVariable.jsonVariableReplacement(bodyData, "id", TC1.responseidValue);

HttpMethods http = new HttpMethods(pr);
// Not req http.updateRecord(bodyData, "id", TC1.responseidValue);
Response  res =	http.getMethod("QA_ENV_APIStudents", TC1.responseidValue );   


   
System.out.println("=========================TC4  ===========================");
System.out.println("Status code is " + res.statusCode());
System.out.println("Response is " + res.asString());
 
	
	
}
}