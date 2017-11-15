package app.kishan.prectical.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 7/3/2017.
 */
public class ContactRequest {

    @SerializedName("mynumber")
    @Expose
    private String number;

    @SerializedName("apikey")
    @Expose
    private String key;

    public ContactRequest(String number, String key) {
        this.number = number;
        this.key = key;
    }
}
