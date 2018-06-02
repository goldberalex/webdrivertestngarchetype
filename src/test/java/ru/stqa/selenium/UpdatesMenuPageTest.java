package ru.stqa.selenium;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.stqa.selenium.pages.*;

public class UpdatesMenuPageTest extends TestNgTestBase {

  //private HomePageHelper homepage;
  private TopMenuPageHelper topMenuBarHelper;
  private UpdatesPageHelper updatePage;
  private FareCalculationPageHelper fareCalculationPage;
  private LinesAndStationsHelper linesAndStationsPage;
  private RavKavHelper ravKavPage;
  private CustomerServiceHelper customerServicePage;
  private EnjoyTheRideHelper enjoyTheRidePage;

  @BeforeMethod
  public void initPageObjects() {
    //homepage = PageFactory.initElements(driver, HomePageHelper.class);
    topMenuBarHelper = PageFactory.initElements(driver, TopMenuPageHelper.class);
    updatePage = PageFactory.initElements(driver, UpdatesPageHelper.class);
    fareCalculationPage = PageFactory.initElements(driver, FareCalculationPageHelper.class);
    linesAndStationsPage = PageFactory.initElements(driver,LinesAndStationsHelper.class);
    ravKavPage = PageFactory.initElements(driver, RavKavHelper.class);
    customerServicePage=PageFactory.initElements(driver,CustomerServiceHelper.class);
    enjoyTheRidePage=PageFactory.initElements(driver,EnjoyTheRideHelper.class);
    driver.get(baseUrl);
    topMenuBarHelper.waitUntilPageLoaded();
  }

  @Test
  public void testUpdatesMenu() {
    topMenuBarHelper.clickUpdatesMenu();
    updatePage.waitUntilPageLoaded();
    Assert.assertTrue(updatePage.isUpdatesPage());
  }

  @Test
  public void testFareCalculationMenu() {
    topMenuBarHelper.clickFareCalculationMenu();
    fareCalculationPage.waitUntilPageLoaded();
    Assert.assertTrue(fareCalculationPage.isFareCalculationPageHelper());
  }
  @Test
  public void LinesAndStationsMenu(){
    topMenuBarHelper.clickLinesAndStationsMenu();
    linesAndStationsPage.waitUntilPageLoaded();
    Assert.assertTrue(linesAndStationsPage.isLinesAndStationsPageHelper());
  }
  @Test
  public void RavKavMenu(){
    topMenuBarHelper.clickRavKavMenu();
    ravKavPage.waitUntilPageLoaded();
    Assert.assertTrue(ravKavPage.isRavKavHelper());
  }
  @Test
  public void CustomerServiceMenu(){
    topMenuBarHelper.clickCustomerServiceMenu();
    customerServicePage.waitUntilPageLoaded();
    Assert.assertTrue(customerServicePage.isCustomerService());
  }
  @Test
  public void EnjoyTheRideMenu(){
    topMenuBarHelper.clickEnjoyTheRideMenu();
    enjoyTheRidePage.waitUntilPageLoaded();
    Assert.assertTrue(enjoyTheRidePage.isEnjoyTheRide());
  }
}
