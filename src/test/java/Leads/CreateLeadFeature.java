package Leads;

import Base.BaseTest;
import org.qa.constants.Constants;
import org.qa.pages.LeadsPage;
import org.qa.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLeadFeature extends BaseTest {
    LeadsPage leadsPage;
    LoginPage loginPage;

    @BeforeClass
    public void initialisation() {
        leadsPage = new LeadsPage(driver);
        loginPage = new LoginPage(driver);
        loginToZoho();
    }

    @AfterClass
    public void logoutFromZoho() {
        loginPage.logOutFromZoho();
    }

    public void loginToZoho() {
        loginPage.goToZohoPage();
        loginPage.clickOnSignIn();
        loginPage.loginToZoho("leela.kuppala@gmail.com", "Welcome@1705");
    }

    /*
    Creating a lead with just mandatory details - company and last name
     */
    @Test
    public void CreateALeadWithMandatoryDetails() {
        leadsPage.redirectToCreateLeadLayout();
        leadsPage.sendMandatoryDetails("Pallet", "K");
        leadsPage.clickOnSave();
    }

    /*
    Creating a lead with  mandatory details and address
     */
    @Test
    public void CreateALeadWithAddressInformation() {
        leadsPage.redirectToCreateLeadLayout();
        leadsPage.sendMandatoryDetails("MS", "john");
        LeadsPage.Address address = new LeadsPage.Address("Avenue", "VJA", "Andhra", "India", "520007");
        leadsPage.sendAddressInformation(address);
        leadsPage.clickOnSave();
    }
    /*
    Creating a lead with  mandatory details and description
     */
    @Test
    public void CreateALeadWithDescriptionInformation() {
        leadsPage.redirectToCreateLeadLayout();
        leadsPage.sendMandatoryDetails("Google", "Doe");
        leadsPage.sendDescription("This lead is created for testing purpose");
        leadsPage.clickOnSave();
    }
    @Test()
    public void CreateALeadWithBasicInformation() throws InterruptedException {
        leadsPage.redirectToCreateLeadLayout();
        leadsPage.sendMandatoryDetails("Google", "Doe");
        leadsPage.sendFirstName("Emily");
        leadsPage.sendTitle("Enginner");
        leadsPage.sendEmail("leela.kuppala@pallet.com");
        leadsPage.sendPhoneNumber(9123456092L);
        leadsPage.sendFax("087-112");
        leadsPage.sendMobileNumber(8374927937L);
        leadsPage.sendWebsite("https://www.trypallet.com/");
        leadsPage.sendNoOfEmployees("500");
        leadsPage.sendAnnualRevenue(11000000);
        leadsPage.sendSkypeID("leelasowjanya");
        leadsPage.sendSecondaryEmail("leelasowjanya@gmail.com");
        leadsPage.sendTwitterValue("leelasowjanya");
        leadsPage.selectLeadSource(Constants.LeadSource.ADVERTISEMENT);
        leadsPage.selectLeadStatus(Constants.LeadStatus.LOST_LEAD);
        leadsPage.selectIndustry(Constants.Industry.ASP);
        leadsPage.selectRating(Constants.Rating.ACQUIRED);
        leadsPage.clickOnSave();
    }
}
