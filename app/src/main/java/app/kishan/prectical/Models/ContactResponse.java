package app.kishan.prectical.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 7/3/2017.
 */
public class ContactResponse {

    @SerializedName("getcontactsResult")
    @Expose
    private ContactObject contact;

    public ContactObject getContact() {
        return contact;
    }

    public void setContact(ContactObject contact) {
        this.contact = contact;
    }
}
