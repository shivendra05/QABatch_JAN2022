package com.restbasics;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestPost {

	@Test
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

		List str = given().contentType(ContentType.JSON).get(url).
				then().extract().response().jsonPath().get("cca3");
		System.out.println(str);
		/*
		 * given().contentType(ContentType.JSON).get(url).then().body("[0].cca3",
		 * containsString("URY"));
		 * given().contentType(ContentType.JSON).get(url).then().body("[0].cca3",
		 * equalTo("URY"));
		 * //given().contentType(ContentType.JSON).get(url).then().body("[0].ccn3",
		 * startsWith(3));
		 * //given().contentType(ContentType.JSON).get(url).then().body("[0].ccn3",
		 * endsWith(3));
		 * given().contentType(ContentType.JSON).get(url).then().body("[0].ccn3",
		 * hasItem(3));
		 * given().contentType(ContentType.JSON).get(url).then().body("[0].ccn3",
		 * hasItems(3));
		 * given().contentType(ContentType.JSON).get(url).then().body("[0].ccn3",
		 * greaterThan(3000));
		 */
		Map<String ,String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("Accept", "*/*");
		Response response1=  given().headers(headers).get(url).then().extract().response();
		System.out.println(response1.asPrettyString());
	}
}
