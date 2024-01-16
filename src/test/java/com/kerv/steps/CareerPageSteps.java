package com.kerv.steps;

import com.kerv.pages.CareerPage;
import com.kerv.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CareerPageSteps {
    @Given("I am on career page")
    public void iAmOnCareerPage() {
    }

    @When("I click on see all open roles")
    public void iClickOnSeeAllOpenRoles() {new CareerPage().clickOnSeeAllOpenRoleButton();
    }
    @And("I click on search Bar")
    public void iClickOnSearchBar() {new CareerPage().clickOnSearchBar();
    }

    @And("I enter job Role Test Engineer")
    public void iEnterJobRoleTestEngineer() {new CareerPage().enterRoleInToElement();
    }


    @And("I click on search button")
    public void iClickOnSearchButton() {new CareerPage().clickOnSearchButton();
    }

    @And("I click on Test engineer")
    public void iClickOnTestEngineer() {new CareerPage().clickOnTestEngineer();
    }
    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstName) {new CareerPage().enterFirstName(firstName);
    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String lastName) {new CareerPage().enterLastName(lastName);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new CareerPage().enterEmail(email);
    }

    @And("I enter phone number {string}")
    public void iEnterPhoneNumber(String telephone) {new CareerPage().enterTelephone(telephone);
    }

    @And("I select resume file")
    public void iSelectResumeFile() {
    }
    @And("I click on privacy policy checkbox")
    public void iClickOnPrivacyPolicyCheckbox() {new CareerPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("I click on right to work checkbox")
    public void iClickOnRightToWorkCheckbox() {new CareerPage().clickOnRightToWorkCheckBox();
    }

    @And("I click on weekly onsite presence checkbox")
    public void iClickOnWeeklyOnsitePresenceCheckbox() {new CareerPage().clickOnWeekleyPresenceCheckBox();
    }

    @And("I click submit button")
    public void iClickSubmitButton() {new CareerPage().clickOnSubmit();
    }

    @Then("I should see application send successfully")
    public void iShouldSeeApplicationSendSuccessfully() {
    }



}
