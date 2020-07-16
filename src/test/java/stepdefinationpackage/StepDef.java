package stepdefinationpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.Homepage;
import pageobjectpackage.Resultpage;

public class StepDef {
    Homepage homepage=new Homepage();
    Resultpage resultpage=new Resultpage();

    @Given("^User is on school website$")
    public void user_is_on_school_website() throws Throwable {
    homepage.baseurl();

    }

    @When("^User select year (\\d+) in year learning group$")
    public void user_select_year_in_year_learning_group(int arg1) throws Throwable {
    homepage.yeargroup();
    }

    @Then("^User should able to find out homework for year (\\d+)$")
    public void user_should_able_to_find_out_homework_for_year(int arg1) throws Throwable {
    resultpage.year5();
    }

}


