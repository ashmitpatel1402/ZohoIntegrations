package Util_Models;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("attention")
    private String attention;

    @SerializedName("address")
    private String address;

    @SerializedName("street2")
    private String street2;

    @SerializedName("state_code")
    private String stateCode;

    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("zip")
    private int zip;

    @SerializedName("country")
    private String country;

    @SerializedName("fax")
    private String fax;

    @SerializedName("phone")
    private String phone;

    // Getter for attention
    public String getAttention() {
        return attention;
    }

    // Setter for attention
    public void setAttention(String attention) {
        this.attention = attention;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for street2
    public String getStreet2() {
        return street2;
    }

    // Setter for street2
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    // Getter for stateCode
    public String getStateCode() {
        return stateCode;
    }

    // Setter for stateCode
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for state
    public String getState() {
        return state;
    }

    // Setter for state
    public void setState(String state) {
        this.state = state;
    }

    // Getter for zip
    public int getZip() {
        return zip;
    }

    // Setter for zip
    public void setZip(int zip) {
        this.zip = zip;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }

    // Getter for fax
    public String getFax() {
        return fax;
    }

    // Setter for fax
    public void setFax(String fax) {
        this.fax = fax;
    }

    // Getter for phone
    public String getPhone() {
        return phone;
    }

    // Setter for phone
    public void setPhone(String phone) {
        this.phone = phone;
    }
}