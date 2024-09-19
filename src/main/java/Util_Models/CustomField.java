package Util_Models;

import com.google.gson.annotations.SerializedName;

public class CustomField {

    @SerializedName("index")
    private int index;

    @SerializedName("value")
    private String value;

    // Getters
    public int getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }

    // Setters
    public void setIndex(int index) {
        this.index = index;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
