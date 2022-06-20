package StepDef;
import java.io.FileNotFoundException;
import ApiUtils.CreateAPIClasses;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGet {
	CreateAPIClasses ref;
	@Given("Calling Get Method")
	public void calling_get_Method() {
	   
		ref=new CreateAPIClasses();
		ref.getMethod();
	}
	@And("Create Post")
	public void create_Post() throws FileNotFoundException {
		ref=new CreateAPIClasses();
		ref.createMethod();
	}
	@And("Update Put")
	public void put_Method() throws FileNotFoundException {
		ref=new CreateAPIClasses();
		ref.putMethod();
	}
	@And("Update Delete")
	public void Delete_Method() throws FileNotFoundException {
		ref=new CreateAPIClasses();
		ref.deleteMethod();
	}

	@Then("executed Successfully")
	public void executed_successfully() {
	    System.out.println("Get Method executed successfully");
	}

}

