package mmp.stepdefinitions;


import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mmp.helper.BaseClass;
import mmp.pages.LoginPage;
public class ScheduleApponitment extends BaseClass{

	LoginPage login;
    @Given("login into Patient Module successfully")
    public void login() throws IOException {
    	instantiateDriver();
    	login = new LoginPage(driver);
		login.login("ria1","Ria12345");
    }

    @When("Patient is able to do booking")
    public void bookAppointment() {
    }

    @Then("the booking is successful")
    public void validateBooking() {
    }

}
