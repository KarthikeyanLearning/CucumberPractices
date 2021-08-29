package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User navigates on Registration Page");

	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable table) {
		List<List<String>> userList = table.asLists(String.class);

		for (List<String> e : userList) {
			System.out.println(e);
		}
	}

	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		List<Map<String, String>> usersMap = dataTable.asMaps(String.class, String.class);
		// System.out.println(usersMap);
		for (Map<String, String> e : usersMap) {
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("phone"));
			System.out.println(e.get("city"));
		}

	}

	@Then("User registratin should be successful")
	public void user_registratin_should_be_successful() {
		System.out.println("User Registration is Successful");
	}

}
