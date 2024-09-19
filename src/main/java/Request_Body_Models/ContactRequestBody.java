package Request_Body_Models;

import Util_Models.CustomField;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import Util_Models.Tag;
import Util_Models.DefaultTemplates;
import Util_Models.*;

public class ContactRequestBody {

    @SerializedName("contact_name")
    private String contactName;

    @SerializedName("company_name")
    private String companyName;

    @SerializedName("website")
    private String website;

    @SerializedName("language_code")
    private String languageCode;

    @SerializedName("contact_type")
    private String contactType;

    @SerializedName("customer_sub_type")
    private String customerSubType;

    @SerializedName("credit_limit")
    private double creditLimit;

    @SerializedName("tags")
    private List<Tag> tags;

    @SerializedName("is_portal_enabled")
    private boolean isPortalEnabled;

    @SerializedName("currency_id")
    private long currencyId;

    @SerializedName("payment_terms")
    private int paymentTerms;

    @SerializedName("payment_terms_label")
    private String paymentTermsLabel;

    @SerializedName("notes")
    private String notes;

    @SerializedName("billing_address")
    private Address billingAddress;

    @SerializedName("shipping_address")
    private Address shippingAddress;

    @SerializedName("contact_persons")
    private String contactPersons; // Adjust type if needed

    @SerializedName("default_templates")
    private DefaultTemplates defaultTemplates;

    @SerializedName("custom_fields")
    private List<CustomField> customFields;

    @SerializedName("opening_balance_amount")
    private double openingBalanceAmount;

    @SerializedName("exchange_rate")
    private double exchangeRate;

    @SerializedName("vat_reg_no")
    private String vatRegNo;

    @SerializedName("owner_id")
    private long ownerId;

    @SerializedName("tax_reg_no")
    private long taxRegNo;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("vat_treatment")
    private String vatTreatment;

    @SerializedName("tax_treatment")
    private String taxTreatment;

    @SerializedName("tax_regime")
    private String taxRegime;

    @SerializedName("legal_name")
    private String legalName;

    @SerializedName("is_tds_registered")
    private boolean isTdsRegistered;

    @SerializedName("place_of_contact")
    private String placeOfContact;

    @SerializedName("gst_no")
    private String gstNo;

    @SerializedName("gst_treatment")
    private String gstTreatment;

    @SerializedName("tax_authority_name")
    private String taxAuthorityName;

    @SerializedName("avatax_exempt_no")
    private String avataxExemptNo;

    @SerializedName("avatax_use_code")
    private String avataxUseCode;

    @SerializedName("tax_exemption_id")
    private long taxExemptionId;

    @SerializedName("tax_exemption_code")
    private String taxExemptionCode;

    @SerializedName("tax_authority_id")
    private long taxAuthorityId;

    @SerializedName("tax_id")
    private long taxId;

    @SerializedName("tds_tax_id")
    private String tdsTaxId;

    @SerializedName("is_taxable")
    private boolean isTaxable;

    @SerializedName("facebook")
    private String facebook;

    @SerializedName("twitter")
    private String twitter;

    @SerializedName("track_1099")
    private boolean track1099;

    @SerializedName("tax_id_type")
    private String taxIdType;

    @SerializedName("tax_id_value")
    private String taxIdValue;

    // Add getters and setters
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getCustomerSubType() {
        return customerSubType;
    }

    public void setCustomerSubType(String customerSubType) {
        this.customerSubType = customerSubType;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public boolean isPortalEnabled() {
        return isPortalEnabled;
    }

    public void setPortalEnabled(boolean portalEnabled) {
        isPortalEnabled = portalEnabled;
    }

    public long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    public int getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(int paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getPaymentTermsLabel() {
        return paymentTermsLabel;
    }

    public void setPaymentTermsLabel(String paymentTermsLabel) {
        this.paymentTermsLabel = paymentTermsLabel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getContactPersons() {
        return contactPersons;
    }

    public void setContactPersons(String contactPersons) {
        this.contactPersons = contactPersons;
    }

    public DefaultTemplates getDefaultTemplates() {
        return defaultTemplates;
    }

    public void setDefaultTemplates(DefaultTemplates defaultTemplates) {
        this.defaultTemplates = defaultTemplates;
    }

    public List<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    public double getOpeningBalanceAmount() {
        return openingBalanceAmount;
    }

    public void setOpeningBalanceAmount(double openingBalanceAmount) {
        this.openingBalanceAmount = openingBalanceAmount;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getVatRegNo() {
        return vatRegNo;
    }

    public void setVatRegNo(String vatRegNo) {
        this.vatRegNo = vatRegNo;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getTaxRegNo() {
        return taxRegNo;
    }

    public void setTaxRegNo(long taxRegNo) {
        this.taxRegNo = taxRegNo;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getVatTreatment() {
        return vatTreatment;
    }

    public void setVatTreatment(String vatTreatment) {
        this.vatTreatment = vatTreatment;
    }

    public String getTaxTreatment() {
        return taxTreatment;
    }

    public void setTaxTreatment(String taxTreatment) {
        this.taxTreatment = taxTreatment;
    }

    public String getTaxRegime() {
        return taxRegime;
    }

    public void setTaxRegime(String taxRegime) {
        this.taxRegime = taxRegime;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public boolean isTdsRegistered() {
        return isTdsRegistered;
    }

    public void setTdsRegistered(boolean tdsRegistered) {
        isTdsRegistered = tdsRegistered;
    }

    public String getPlaceOfContact() {
        return placeOfContact;
    }

    public void setPlaceOfContact(String placeOfContact) {
        this.placeOfContact = placeOfContact;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getGstTreatment() {
        return gstTreatment;
    }

    public void setGstTreatment(String gstTreatment) {
        this.gstTreatment = gstTreatment;
    }

    public String getTaxAuthorityName() {
        return taxAuthorityName;
    }

    public void setTaxAuthorityName(String taxAuthorityName) {
        this.taxAuthorityName = taxAuthorityName;
    }

    public String getAvataxExemptNo() {
        return avataxExemptNo;
    }

    public void setAvataxExemptNo(String avataxExemptNo) {
        this.avataxExemptNo = avataxExemptNo;
    }

    public String getAvataxUseCode() {
        return avataxUseCode;
    }

    public void setAvataxUseCode(String avataxUseCode) {
        this.avataxUseCode = avataxUseCode;
    }

    public long getTaxExemptionId() {
        return taxExemptionId;
    }

    public void setTaxExemptionId(long taxExemptionId) {
        this.taxExemptionId = taxExemptionId;
    }

    public String getTaxExemptionCode() {
        return taxExemptionCode;
    }

    public void setTaxExemptionCode(String taxExemptionCode) {
        this.taxExemptionCode = taxExemptionCode;
    }

    public long getTaxAuthorityId() {
        return taxAuthorityId;
    }

    public void setTaxAuthorityId(long taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    public long getTaxId() {
        return taxId;
    }

    public void setTaxId(long taxId) {
        this.taxId = taxId;
    }

    public String getTdsTaxId() {
        return tdsTaxId;
    }

    public void setTdsTaxId(String tdsTaxId) {
        this.tdsTaxId = tdsTaxId;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public boolean isTrack1099() {
        return track1099;
    }

    public void setTrack1099(boolean track1099) {
        this.track1099 = track1099;
    }

    public String getTaxIdType() {
        return taxIdType;
    }

    public void setTaxIdType(String taxIdType) {
        this.taxIdType = taxIdType;
    }

    public String getTaxIdValue() {
        return taxIdValue;
    }

    public void setTaxIdValue(String taxIdValue) {
        this.taxIdValue = taxIdValue;
    }
}
