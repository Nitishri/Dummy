package org.testing.testSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {
Properties pr;
	public HttpMethods(Properties pr)
	{
		
		this.pr = pr;
	}
	public Response PostMethod(String bodyData,String uriKey)
	{	
		
		Response res = 
	
	given()
	.contentType(ContentType.JSON)
	.body(bodyData)
	.when()
	.post(pr.getProperty(uriKey));
	
	System.out.println("Status code is " + res.statusCode());
	
	return res;
	
}
	
	public Response getMethod(String uriKey, String id)
	{
	
	String uri = pr.getProperty(uriKey) +"/" +id;
	
	Response res =
	given().contentType(ContentType.JSON)
	.when().get(uri);
	
	return res;
	
	
}
	
	public Response getAllRecords(String uriKey)
	{
	
	String uri = pr.getProperty(uriKey);
	
	Response res =
	given().contentType(ContentType.JSON)
	.when().get(uri);
	
	return res;
	
	
}
	public Response updateRecord(String bodyData, String uriKey, String idValue)
	{
	
	String uri = pr.getProperty(uriKey) + "/" + idValue;
	
	Response res =
	given().contentType(ContentType.JSON)
	.body(bodyData)
	.when().put(uri);
	
	return res;
	
	
}
	public Response DeleteRecord(String uriKey, String idValue)
	{
	
	String uri = pr.getProperty(uriKey) + "/" + idValue;
	
	Response res =
	given().contentType(ContentType.JSON)
	.when().delete(uri);
	
	return res;
	
}
}