package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreateAPIClasses {
	
	public void getMethod()
	{
		RestAssured.given().baseUri("http://localhost:8080").when().log().all().get("/employees").then()
		.log().all().assertThat().statusCode(200);
	}
	
	public void createMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8080")
		.body(getFileContent("C:\\Users\\RAJBISWA\\eclipse-workspace\\EmployeesManagement\\src\\test\\resources\\body.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().post("/employee").then().log().all();
	}
	public void putMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("http://localhost:8080")
		.body(getFileContent("C:\\Users\\RAJBISWA\\eclipse-workspace\\EmployeesManagement\\src\\test\\resources\\put.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().put("/employee/101").then().log().all();
	}
	
	public void deleteMethod()
	{
		RestAssured.given().baseUri("http://localhost:8080")
		.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/employee/134").then().log().all();
	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
	{
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
}