package stepDefination;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^user is on Netbankinglanding page$")
    public void user_is_on_netbankinglanding_page() throws Throwable {
        //code to navigate to login url
    	System.out.println("navigated to login url");
    }

    @When("^User login into application with user name and password$")
    public void user_login_into_application_with_user_name_and_password() throws Throwable {
        //code to login
    	System.out.println("loged in sucessfully");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
    	System.out.println("validated home page");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //validating the cards
    	System.out.println("validated cards");
    }

}