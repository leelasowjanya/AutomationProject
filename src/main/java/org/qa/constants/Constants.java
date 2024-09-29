package org.qa.constants;

public class Constants {
    public static final String zoho_url="https://crm.zoho.in/";
    public static final String companyErrorMessage = "Company cannot be empty.";
    public static final String lastNameErrorMessage = "Last Name cannot be empty.";
    public  enum LeadStatus{
        ATTEMPTED_TO_CONTACT,
        CONTACT_IN_FUTURE,
        CONTACTED,
        JUNK_LEAD,
        LOST_LEAD,
        NOT_CONTACTED,
        PRE_QUALIFIED,
        NOT_QUALIFIED;
    }
    public  enum LeadSource{
        ADVERTISEMENT,
        COLD_CALL,
        EMPLOYEE_REFERRAL,
        EXTERNAL_REFERRAL,
        ONLINE_STORE,
        PARTNER,
        PUBLIC_RELATIONS,
        SALES_EMAIL_ALIAS,
        SEMINAR_PARTNER,
        INTERNAL_SEMINAR,
        TRADE_SHOW,
        WEB_DOWNALOD,
        WEB_RESEARCH,
        CHAT,
        X,
        FACEBOOK;
    }
    public  enum Industry{
        ASP,
        DATA,
        ERP,
        GOVERNMENT,
        LARGE_ENTERPRISE,
        MANAGEMENT,
        MSP,
        NETWORK,
        NON_MANAGEMENT,
        OPTICAL,
        SERVICE_PROVIDER,
        SMALL_ENTERPRISE,
        STORAGE_EQUIPMENT,
        STORAGE_SERVICE_PROVIDER,
        SYSTEM_INTEGRATOR,
        WIRELESS_INDUSTRY,
        ERP2,
        MANAGEMENT_ISV;
    }
    public  enum Rating{
        ACQUIRED,
        ACTIVE,
        MARKET_FAILED,
        PROJECT_CANCELLED,
        SHUT_DOWN;
    }
}
