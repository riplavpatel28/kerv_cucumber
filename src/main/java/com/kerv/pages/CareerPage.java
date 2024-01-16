package com.kerv.pages;

import com.kerv.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CareerPage.class);




    @CacheLookup
    @FindBy(xpath = "//body/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement seeAllOpenRoleButton;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Search vacancies here']")
    WebElement searchBar;
    @CacheLookup
    @FindBy(xpath = "//body/main[1]/section[4]/div[1]/div[1]/div[1]/input[1] ")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//body/main[1]/section[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1] ")
    WebElement TestEngineer;

    @CacheLookup
    @FindBy(id = "candidate_first_name ")
    WebElement FirstName;

    @CacheLookup
    @FindBy(id = "candidate_last_name ")
    WebElement LastName;

    @CacheLookup
    @FindBy(id = "candidate_email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "candidate_phone ")
    WebElement phone;

    @CacheLookup
    @FindBy(id = "resume ")
    WebElement resume;
    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/label[1] ")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/label[1]")
    WebElement rightToWorkCheckBox;

    @CacheLookup
    @FindBy(xpath = "//label[@for='please_note_this_role_requires_weekly_onsite_presence_at_our_client_site_in_swansea_every_wednesday_-0'] ")
    WebElement weeklyPresenceCheckBox;


    @CacheLookup
    @FindBy(xpath = "//body/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1] ")
    WebElement submit;








    public void clickOnSeeAllOpenRoleButton() {
        clickOnElement(seeAllOpenRoleButton);
    }


    public void clickOnSearchBar() {clickOnElement(searchBar);}


    public void enterRoleInToElement(String role){
        sendTextToElement(searchBar,role);

    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }
    public void clickOnTestEngineer(){
        clickOnElement(TestEngineer);
    }
    public void enterFirstName(String fName){
        sendTextToElement(FirstName,fName);
    }
    public void enterLastName(String lName){
        sendTextToElement(LastName,lName);
    }
    public void enterEmail(String email){
        sendTextToElement(emailAddressField,email);
    }
    public void enterTelephone(String telephone){
        sendTextToElement(phone,telephone);
    }
    public void selectFile(String file){
        sendTextToElement(resume,file);
    }
    public void clickOnPrivacyPolicyCheckBox(){
        clickOnElement(privacyPolicyCheckBox);

    }
    public void clickOnRightToWorkCheckBox(){
        clickOnElement(rightToWorkCheckBox);

    }
    public void clickOnWeekleyPresenceCheckBox(){
        clickOnElement(weeklyPresenceCheckBox);

    }
    public void clickOnSubmit(){
        clickOnElement(submit);
    }





}
