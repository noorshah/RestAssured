package StepDefinitions;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.Given;
import  cucumber.api.java.en.When;
import  cucumber.api.java.en.Then;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.hasItem;


public class CountriesStepDefinitions {
    public Response response;
    @Given("^I call countries web api$")
    public void i_call_countries_web_api() throws Throwable {
        response = get("http://restcountries.eu/rest/v1/all");

    }

    @Then("^the first country is Afghanistan$")
    public void the_first_country_is_Armenia() throws Throwable {
        response.then().body("name", hasItem("Afghanistan"));
    }@Then("^I should see (\\d+) status code$")
     public void i_should_see_status_code(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        response.then().statusCode(arg1);
    }



}