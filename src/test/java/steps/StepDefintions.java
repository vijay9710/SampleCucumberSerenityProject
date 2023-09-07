package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

public class StepDefintions {

    private static final String URL = "https://petstore.swagger.io";
    public Response response;


    @Given("User GETs details of pets with status: {string}")
    public void user_ge_ts_details_of_pets_with_status(String status) {
        response = SerenityRest.given()
                .queryParam("status", status)
                .get(URL+"/v2/pet/findByStatus");
    }

    @Then("verify status code is {string}")
    public void verifyStatusCode(String expectedStatusCode){
        Assert.assertEquals(response.statusCode(), Integer.parseInt(expectedStatusCode));
    }

}
