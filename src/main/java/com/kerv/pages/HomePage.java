package com.kerv.pages;

import com.kerv.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(id = "CookieBoxTextDescription")
    WebElement cookies;

    @CacheLookup
    @FindBy(id = "CookieBoxSaveButton")
    WebElement saveCookies;
    @CacheLookup
    @FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")
    WebElement careerTab;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'All Open Roles')]")
    WebElement AllOpenRoles;


    public void mouseHoverOnCookiesWarning(){
        mouseHoverToElement(cookies);
    }

    public void clickOnSaveCookieWarning() {
    clickOnElement(saveCookies);

    }
    public void mouseHoverOnCarrierTab(){
    mouseHoverToElement(careerTab);
    }
    public void clickOnAllOpenRoles(){
        clickOnAllOpenRoles();
    }


}
