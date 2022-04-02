package com.restbasics;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestGetPost {

	@Test(enabled = false)
	public static void getCountryAll(){
		baseURI = "https://restcountries.com/v3.1/";
		String url="all";
		System.out.println(url);
		Response response =null;
		response = given().contentType(ContentType.JSON).get(url);

		//System.out.println(response.asPrettyString());
		List name = response.body().jsonPath().get("ccn3");
		System.out.println(name);

		System.out.println("Status code:: "+given().
				contentType(ContentType.JSON).
				get(url).then().
				extract().response().statusCode());

		String str = given().contentType(ContentType.JSON).get(url).then().extract().response().jsonPath().get("cca3");
		System.out.println(str);
	}

	@Test(enabled = false)
	public static void getCountryByName(){
		baseURI = "https://restcountries.com/v2/";
		String url="name/{cName}";
		System.out.println(url);
		Response response =null;
		response = given().contentType(ContentType.JSON).pathParam("cName", "united").get(url);

		System.out.println(response.asPrettyString());


		int sizeOfList = response.body().jsonPath().getInt("$.size()"); 

		System.out.println(sizeOfList);

		for (int i = 0; i < sizeOfList; i++) {
			System.out.println(response.body().jsonPath().getString("["+i+"].name"));
		}
	}
	
	@Test
	public static void createUserAccount() {
		baseURI = "https://reqres.in/api/";
		String url = "users";
		
		JSONObject payload = new JSONObject();
		
		payload.put("name", "morpheus");
		payload.put("job", "leader");
		
		System.out.println(payload);
		
		Response repsosne =  given().contentType(ContentType.JSON).body(payload.toString()).post(url).then().extract().response();
		
		System.out.println(repsosne.asPrettyString());
		
		JSONObject studPayLoad = new JSONObject();

		JSONObject studData = new JSONObject();
		studData.put("name", "test");
		studData.put("salary", "123");
		studData.put("age", "23");
		studData.put("id", 25);
		
		studPayLoad.put("status", "success");
		studPayLoad.put("Data", studData);
		
		System.out.println("Request Body:: "+studPayLoad);
		
		JSONObject jsonObj1 = new JSONObject();
		jsonObj1.put("name", "test");
		jsonObj1.put("salary", "123");
		jsonObj1.put("age", "23");
		jsonObj1.put( "id", 25);
		
		JSONObject jsonObj2 = new JSONObject();
		jsonObj2.put("name", "test");
		jsonObj2.put("salary", "123");
		jsonObj2.put("age", "23");
		jsonObj2.put( "id", 25);
		
		JSONObject jsonObj3 = new JSONObject();
		jsonObj3.put("name", "test");
		jsonObj3.put("salary", "123");
		jsonObj3.put("age", "23");
		jsonObj3.put( "id", 25);
		
		
		JSONArray jsonArr = new JSONArray();
		jsonArr.put(jsonObj1);
		jsonArr.put(jsonObj2);
		jsonArr.put(jsonObj3);
		
		JSONObject jsonArrayObjectPayload = new JSONObject();
		jsonArrayObjectPayload.put("status", "success");
		jsonArrayObjectPayload.put("data", jsonArr);
		
		System.out.println(jsonArrayObjectPayload);
	}
}
