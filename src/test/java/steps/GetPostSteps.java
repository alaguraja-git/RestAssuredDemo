package steps;

import Utilities.RestAssuredExtension;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.hamcrest.Matchers.is;

public class GetPostSteps {

    @Given("I perform GET operation")
    public void i_perform_get_operation(){
       // given().contentType(ContentType.JSON);
    }

//    @And("I perform GET for the post number {string}")
//    public void iPerformGETForThePostNumber(String postNumber) {
////        when().get(String.format("http://localhost:3000/posts/%s",postNumber))
////                .then().body("title", is("a title"));
//
//        BDDStyleMethod.SimpleGETpost(postNumber);
//
//    }

    @Then("I should see the title as {string}")
    public void i_should_see_the_title_as(String string) {
    }

    @Then("I should see the title names")
    public void iShouldSeeTheTitleNames() {
    BDDStyleMethod.performContainsCollections();
    }

    @Then("I should see verify GET parameter")
    public void iShouldSeeVerifyGETParameter() {
        BDDStyleMethod.performPathParameter();
    }

    @Then("I should see verify GET query parameter")
    public void iShouldSeeVerifyGETQueryParameter() {
        BDDStyleMethod.performQueryParameter();
    }

    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) throws Throwable{
        RestAssuredExtension.GetOps(url);
    }
}
