package ru.stqa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatesPageHelper extends Page {
    @FindBy(xpath = "//h1[contains(text(),'Updates')]")
    WebElement updatesHader;

    @FindBy(xpath = "//div[@class='updates_banner']")
    WebElement updetesBanner;

    public UpdatesPageHelper(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void waitUntilPageLoaded() {
        this.waitUntilIsLoadedCustomTime(updetesBanner,40);
        this.waitUntilIsLoadedCustomTime(updatesHader,40);

    }

    public boolean isUpdatesPage() {
        return exists(updatesHader);
    }
}
