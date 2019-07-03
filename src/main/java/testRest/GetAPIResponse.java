package testRest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPIResponse {

	
	
	@Test
	public void getResponse() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
//		Response response=httpRequest.request(Method.GET,"/Pune");
		Response response= httpRequest.get("/Pune");
		String responseBody=response.getBody().asString();
		System.out.println("Respnse is ::"+responseBody);
		
		
		System.out.println("Header is :: "+ response.getHeaders());
		response.getHeader("encoding");
		System.out.println("*********************************************");
		System.out.println("Header is :: "+ response.getHeader("Content-Type"));
	}

}
