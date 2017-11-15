package app.kishan.prectical.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 7/3/2017.
 */
public class ContactDetails {

    @SerializedName("caption")
    @Expose
    private String caption;

    @SerializedName("country_code")
    @Expose
    private String contryCode;

    @SerializedName("international_number")
    @Expose
    private String number;

    @SerializedName("isLineShared")
    @Expose
    private boolean isShared;

    @SerializedName("imagebase64")
    @Expose
    private String imageLink;

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getContryCode() {
        return contryCode;
    }

    public void setContryCode(String contryCode) {
        this.contryCode = contryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean shared) {
        isShared = shared;
    }
}
