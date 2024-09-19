package Util_Models;
import com.google.gson.annotations.SerializedName;

public class Tag {

    @SerializedName("tag_id")
    private long tagId;

    @SerializedName("tag_option_id")
    private long tagOptionId;

    // Getter for tagId
    public long getTagId() {
        return tagId;
    }

    // Setter for tagId
    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    // Getter for tagOptionId
    public long getTagOptionId() {
        return tagOptionId;
    }

    // Setter for tagOptionId
    public void setTagOptionId(long tagOptionId) {
        this.tagOptionId = tagOptionId;
    }
}
