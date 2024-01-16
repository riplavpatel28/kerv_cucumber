package com.kerv.steps;

import com.kerv.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }
    @When("I mouse hover on  cookies warning")
    public void iMouseHoverOnCookiesWarning() {
    }


    @And("I click on save cookies")
    public void iClickOnSaveCookies() {new HomePage().clickOnSaveCookieWarning();
    }

    @And("I should see right side menu on Homepage")
    public void iShouldSeeRightSideMenuOnHomepage() {
    }

    @And("I mouse hover on career tab")
    public void iMouseHoverOnCareerTab() {new HomePage().mouseHoverOnCarrierTab();
    }

    @And("I click on all open roles")
    public void iClickOnAllOpenRoles() {new HomePage().clickOnAllOpenRoles();
    }

    @Then("I should navigate to career page successfully")
    public void iShouldNavigateToCareerPageSuccessfully() {
    }


}
