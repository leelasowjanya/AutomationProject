package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.qa.constants.Constants;
import org.testng.Assert;

public class LeadsPage extends BasePage{
    @FindBy(xpath = "//button[@aria-label='Create Lead']")
    public static WebElement createLeadButton;
    @FindBy(id = "Visible_Leads")
    public static WebElement leadsTab;
    @FindBy(id = "Crm_Leads_LASTNAME_LInput")
    public static WebElement lastNameField;
    @FindBy(id = "Crm_Leads_COMPANY")
    public static WebElement companyField;
    @FindBy(id = "Crm_Leads_FIRSTNAME_LInput")
    public static WebElement firstNameField;
    @FindBy(id = "Crm_Leads_EMAIL_LInput")
    public static WebElement emailField;
    @FindBy(id = "crm_create_savebutn")
    public static WebElement saveButton;
    @FindBy(id = "Crm_Leads_LANE_LInput")
    public static WebElement streetField;
    @FindBy(id = "Crm_Leads_STATE_LInput")
    public static WebElement stateField;
    @FindBy(id = "Crm_Leads_CITY_LInput")
    public static WebElement cityField;
    @FindBy(id = "Crm_Leads_COUNTRY")
    public static WebElement countryField;
    @FindBy(id = "Crm_Leads_CODE_LInput")
    public static WebElement zipCodeField;
   // @FindBy(xpath = "//*[@id='Crm_Leads_DESCRIPTION']/div")
    @FindBy(id = "Crm_Leads_DESCRIPTION")
    public static WebElement descriptionField;
    @FindBy(id = "Crm_Leads_STATUS")
    public static WebElement leadStatusField;
    @FindBy(xpath = "//*[@data-value='Attempted to Contact']")
    public static WebElement attemptedToContactValue;
    @FindBy(xpath = "//*[@data-value='Contact in Future']")
    public static WebElement contactInFutureValue;
    @FindBy(xpath = "//*[@data-value='Contacted']")
    public static WebElement contactedValue;
    @FindBy(xpath = "//*[@data-value='Junk Lead']")
    public static WebElement junkLeadValue;
    @FindBy(xpath = "//*[@data-value='Lost Lead']")
    public static WebElement lostLeadValue;
    @FindBy(xpath = "//*[@data-value='Not Contacted']")
    public static WebElement notContactedValue;
    @FindBy(xpath = "//*[@data-value='Pre-Qualified']")
    public static WebElement preQualifiedValue;
    @FindBy(xpath = "//*[@data-value='Not Qualified']")
    public static WebElement notQualifiedValue;
    @FindBy(id = "Crm_Leads_DESIGNATION_LInput")
    public static WebElement titleField;
    @FindBy(id = "Crm_Leads_PHONE_LInput")
    public static WebElement phoneField;
    @FindBy(id = "Crm_Leads_MOBILE_LInput")
    public static WebElement mobileField;
    @FindBy(id = "Crm_Leads_FAX_LInput")
    public static WebElement faxField;
    @FindBy(id = "Crm_Leads_WEBSITE_LInput")
    public static WebElement websiteField;
    @FindBy(id = "Crm_Leads_LEADSOURCE")
    public static WebElement leadSourceField;
    @FindBy(xpath = "//*[@data-value='Advertisement']")
    public static WebElement advertisementValue;
    @FindBy(xpath = "//*[@data-value='Cold Call']")
    public static WebElement coldCallValue;
    @FindBy(xpath = "//*[@data-value='Employee Referral']")
    public static WebElement employeeReferralValue;
    @FindBy(xpath = "//*[@data-value='External Referral']")
    public static WebElement externalReferralValue;
    @FindBy(xpath = "//*[@data-value='Online Store']")
    public static WebElement onlineStoreValue;
    @FindBy(xpath = "//*[@data-value='Partner']")
    public static WebElement partnerValue;
    @FindBy(xpath = "//*[@data-value='Public Relations']")
    public static WebElement publicRelationsValue;
    @FindBy(xpath = "//*[@data-value='Sales Email Alias']")
    public static WebElement salesEmailAliasValue;
    @FindBy(xpath = "//*[@data-value='Seminar Partner']")
    public static WebElement seminarPartnerValue;
    @FindBy(xpath = "//*[@data-value='Internal Seminar']")
    public static WebElement internalSeminarValue;
    @FindBy(xpath = "//*[@data-value='Trade Show']")
    public static WebElement tradeShowValue;
    @FindBy(xpath = "//*[@data-value='Web Download']")
    public static WebElement webDownloadValue;
    @FindBy(xpath = "//*[@data-value='Web Research']")
    public static WebElement webResearchValue;
    @FindBy(xpath = "//*[@data-value='Chat']")
    public static WebElement chatValue;
    @FindBy(xpath = "//*[@data-value='X (Twitter)']")
    public static WebElement twitterValue;
    @FindBy(xpath = "//*[@data-value='Facebook']")
    public static WebElement facebookValue;
    @FindBy(id = "Crm_Leads_INDUSTRY")
    public static WebElement industryField;
    public  String  industryValue = "//*[@data-value='industryValue']";
    @FindBy(id = "Crm_Leads_ANNUALREVENUE_LInput")
    public static WebElement annualRevenueField;
    @FindBy(id = "Crm_Leads_EMPCT_LInput")
    public static WebElement noEmployeesField;
    @FindBy(id = "Crm_Leads_SKYPEIDENTITY_LInput")
    public static WebElement skypeIdField;
    @FindBy(id = "Crm_Leads_ADDN_EMAIL_LInput")
    public static WebElement secondaryEmailField;
    @FindBy(id = "Crm_Leads_TWITTER_LInput")
    public static WebElement twitterField;
    @FindBy(id = "Crm_Leads_RATING")
    public static WebElement ratingField;
    @FindBy(id = "errorMsg_Crm_Leads_COMPANY")
    public static WebElement companyError;
    @FindBy(id = "errorMsg_Crm_Leads_LASTNAME")
    public static WebElement lastNameError;
    public  String  ratingValue = "//*[@data-value='ratingValue']";
    @FindBy(xpath = "//button[@aria-label='Edit']")
    public static WebElement editButton;
    public LeadsPage(WebDriver driver) {
        super(driver);
    }
    public static class Address{
        protected  String street;
        protected  String state;
        protected  String city;
        protected  String country;
        protected  String zipcode;
        public Address(String street, String city, String state, String country, String zipcode){
            this.street = street;
            this.city = city;
            this.state = state;
            this.country = country;
            this.zipcode = zipcode;
        }
    }
    public void redirectToCreateLeadLayout(){
        clickOnLeadsTab();
        clickOnCreateLead();
    }
    public void clickOnLeadsTab(){
        elementToBeVisible(leadsTab);
        leadsTab.click();
    }
    public void clickOnCreateLead(){
        elementToBeVisible(createLeadButton);
        createLeadButton.click();
    }
    public void sendLastName(String lastName){
        elementToBeVisible(lastNameField);
        lastNameField.sendKeys(lastName);
    }
    public void sendCompanyName(String company){
        elementToBeVisible(companyField);
        companyField.sendKeys(company);
    }
    public void sendFirstName(String firstName){
        elementToBeVisible(firstNameField);
        firstNameField.sendKeys(firstName);
    }
    public void sendEmail(String email){
        scrollToTheElement(descriptionField);
        emailField.sendKeys(email);
    }
    public void sendWebsite(String website){
        scrollToTheElement(descriptionField);
        websiteField.sendKeys(website);
    }
    public void sendFax(String fax){
        scrollToTheElement(descriptionField);
        faxField.sendKeys(fax);
    }
    public void sendMobileNumber(long mobile){
        scrollToTheElement(descriptionField);
        mobileField.sendKeys(""+mobile);
    }
    public void sendPhoneNumber(long phone){
        scrollToTheElement(descriptionField);
        phoneField.sendKeys(""+phone);
    }
    public void sendTitle(String title){
        scrollToTheElement(descriptionField);
        titleField.sendKeys(title);
    }
    public void sendStreetName(String street){
        scrollToTheElement(descriptionField);
        streetField.sendKeys(street);
    }
    public void sendCityName(String city){
        scrollToTheElement(descriptionField);
        cityField.sendKeys(city);
    }
    public void sendStateName(String state){
        scrollToTheElement(descriptionField);
        stateField.sendKeys(state);
    }
    public void sendCountryName(String country){
        scrollToTheElement(descriptionField);
        countryField.sendKeys(country);
    }
    public void sendZipCode(String zipCode){
        scrollToTheElement(descriptionField);
        zipCodeField.sendKeys(zipCode);
    }
    public void sendDescription(String description) {
        scrollToTheElement(descriptionField);
        descriptionField.sendKeys(description);
    }
    public void sendNoOfEmployees(String noOfEmployees){
        scrollToTheElement(descriptionField);
        noEmployeesField.sendKeys(noOfEmployees);
    }
    public void sendSkypeID(String skypeID){
        scrollToTheElement(descriptionField);
        skypeIdField.sendKeys(skypeID);
    }
    public void sendSecondaryEmail(String secondaryEmail){
        scrollToTheElement(descriptionField);
        secondaryEmailField.sendKeys(secondaryEmail);
    }
    public void sendTwitterValue(String twitter){
        scrollToTheElement(descriptionField);
        twitterField.sendKeys(twitter);
    }
    public void sendAnnualRevenue(long annualRevenue){
        scrollToTheElement(descriptionField);
        annualRevenueField.sendKeys(""+annualRevenue);
    }
    public void sendMandatoryDetails(String company, String lastname){
        sendCompanyName(company);
        sendLastName(lastname);
    }
    public void sendAddressInformation(Address address){
        sendStreetName(address.street);
        sendCityName(address.city);
        sendStateName(address.state);
        sendCountryName(address.country);
        sendZipCode(address.zipcode);
    }
    public void verifyErrorMessage(WebElement element, String expectedErrorMessage){
        elementToBeVisible(element);
        String actualMessage = element.getText();
        Assert.assertEquals(actualMessage,expectedErrorMessage,"Error message is not same ");
    }
    public void selectLeadStatus(Constants.LeadStatus leadStatus){
        elementToBeVisible(leadStatusField);
        leadStatusField.click();
        switch (leadStatus){
            case ATTEMPTED_TO_CONTACT: attemptedToContactValue.click();break;
            case CONTACT_IN_FUTURE: contactInFutureValue.click();break;
            case CONTACTED: contactedValue.click();break;
            case JUNK_LEAD: junkLeadValue.click();break;
            case LOST_LEAD: lostLeadValue.click();break;
            case NOT_CONTACTED: notContactedValue.click();break;
            case PRE_QUALIFIED: preQualifiedValue.click();break;
            case NOT_QUALIFIED: notQualifiedValue.click();break;
        }
    }
    public void selectLeadSource(Constants.LeadSource leadSource) throws InterruptedException {
        elementToBeVisible(leadSourceField);
        leadSourceField.click();
        switch (leadSource){
            case ADVERTISEMENT: advertisementValue.click(); break;
            case COLD_CALL: coldCallValue.click();break;
            case EMPLOYEE_REFERRAL: employeeReferralValue.click();break;
            case EXTERNAL_REFERRAL: externalReferralValue.click();break;
            case ONLINE_STORE: onlineStoreValue.click();break;
            case PARTNER: partnerValue.click();break;
            case PUBLIC_RELATIONS: publicRelationsValue.click();break;
            case SALES_EMAIL_ALIAS: salesEmailAliasValue.click();break;
            case SEMINAR_PARTNER: seminarPartnerValue.click();break;
            case INTERNAL_SEMINAR: internalSeminarValue.click();break;
            case TRADE_SHOW: tradeShowValue.click();break;
            case WEB_DOWNALOD: webDownloadValue.click();break;
            case WEB_RESEARCH: webResearchValue.click();break;
            case CHAT: chatValue.click();break;
            case X: twitterValue.click();break;
            case FACEBOOK: facebookValue.click();break;
        }
    }
    /*
    Overriding industry value field based on option selected and clicked from the dropdown
     */
    public void selectIndustry(Constants.Industry industry){
        scrollToTheElement(industryField);
        industryField.click();
        switch (industry){
            case ASP:
                String asp = industryValue.replace("industryValue","ASP (Application Service Provider)");
                click(asp);
                break;
            case DATA:
                String data = industryValue.replace("industryValue","Data/Telecom OEM");
                click(data);
                break;
            case ERP:
                String erp = industryValue.replace("industryValue","ERP (Enterprise Resource Planning)");
                click(erp);
            case GOVERNMENT:
                String government = industryValue.replace("industryValue","Government/Military");
                click(government);
                break;
            case LARGE_ENTERPRISE:
                String largeEnterprise = industryValue.replace("industryValue","Large Enterprise");
                click(largeEnterprise);
                break;
            case MANAGEMENT:
                String management = industryValue.replace("industryValue","ManagementISV");
                click(management);
                break;
            case MSP:
                String msp = industryValue.replace("industryValue","MSP (Management Service Provider)");
                click(msp);
                break;
            case NETWORK:
                String network = industryValue.replace("industryValue","Network Equipment Enterprise");
                click(network);
                break;
            case NON_MANAGEMENT:
                String nonManagement = industryValue.replace("industryValue","Non-management ISV");
                click(nonManagement);
                break;
            case OPTICAL:
                String optical = industryValue.replace("industryValue","Optical Networking");
                click(optical);
                break;
            case SERVICE_PROVIDER:
                String serviceProvider = industryValue.replace("industryValue","Service Provider");
                click(serviceProvider);
                break;
            case SMALL_ENTERPRISE:
                String smallEnterprise = industryValue.replace("industryValue","Small/Medium Enterprise");
                click(smallEnterprise);
                break;
            case STORAGE_EQUIPMENT:
                String storageEquipment = industryValue.replace("industryValue","Storage Equipment");
                click(storageEquipment);
                break;
            case STORAGE_SERVICE_PROVIDER:
                String storage = industryValue.replace("industryValue","Storage Service Provider");
                click(storage);
                break;
            case SYSTEM_INTEGRATOR:
                String systemIntegrator = industryValue.replace("industryValue","Systems Integrator");
                click(systemIntegrator);
                break;
            case WIRELESS_INDUSTRY:
                String wirelessIndustry = industryValue.replace("industryValue","Wireless Industry");
                click(wirelessIndustry);
                break;
            case ERP2:
                String erp2 = industryValue.replace("industryValue","ERP");
                click(erp2);
                break;
            case MANAGEMENT_ISV:
                String management_ISV = industryValue.replace("industryValue","Management ISV");
                click(management_ISV);
                break;
        }
    }
    /*
    Overriding rating value field based on option selected and clicked from the dropdown
     */
    public void selectRating(Constants.Rating rating) {
        scrollToTheElement(ratingField);
        ratingField.click();
        switch (rating) {
            case ACQUIRED:
                String acquired = ratingValue.replace("ratingValue", "Acquired");
                click(acquired);
                break;
            case ACTIVE:
                String active = ratingValue.replace("ratingValue", "Active");
                click(active);
                break;
            case PROJECT_CANCELLED:
                String projectCancelled = ratingValue.replace("ratingValue", "Project Cancelled");
                click(projectCancelled);
                break;
            case MARKET_FAILED:
                String marketFailed = ratingValue.replace("ratingValue", "Market Failed");
                click(marketFailed);
                break;
            case SHUT_DOWN:
                String shutDown = ratingValue.replace("ratingValue", "Shut Down");
                click(shutDown);
                break;
        }
    }
    public void clickOnSave(){
        saveButton.click();
    }
    public boolean isLeadCreated(){
        elementToBeVisible(editButton);
        return editButton.isDisplayed();
    }
}
