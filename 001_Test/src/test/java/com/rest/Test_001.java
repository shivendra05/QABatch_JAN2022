package com.rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_001 {

	@Test
	public static void	getPage2_GetUsersDetails(){
		//	https://reqres.in/api/users?page=2
		System.out.println("------------------------------------------");
		String getURL = "https://reqres.in/api/users?page=2";
		Response response =  given().
				get(getURL).then().extract().response();

		System.out.println("Service Response:: "+response.asPrettyString());
		System.out.println("------------------------------------------");
	}

	@Test
	public static void	getPage2_FindArraySize(){
		//	https://reqres.in/api/users?page=2
		System.out.println("------------------------------------------");
		String getURL = "https://reqres.in/api/users?page=2";
		Response response =  given().
				get(getURL).then().extract().response();
		int arrSize = response.body().jsonPath().get("data.size()");
		System.out.println("Service Response Array Size is:: "+arrSize);
		System.out.println("------------------------------------------");
	}
	
	@Test
	public static void	getPage2_GetNamelName(){
		//	https://reqres.in/api/users?page=2
		System.out.println("------------------------------------------");
		String getURL = "https://reqres.in/api/users?page=2";
		Response response =  given().
				get(getURL).then().extract().response();
		int arrSize = response.body().jsonPath().get("data.size()");
		System.out.println("Service Response Array Size is:: "+arrSize);
		
		for (int i = 0; i < arrSize; i++) {

			System.out.print("FirstName:: "+response.body().jsonPath().get("data["+i+"].first_name"));
			System.out.println("    LastName:: "+response.body().jsonPath().get("data["+i+"].last_name"));
		}
		System.out.println("------------------------------------------");
	}
}