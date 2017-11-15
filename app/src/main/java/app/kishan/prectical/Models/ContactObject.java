package app.kishan.prectical.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 7/3/2017.
 */
public class ContactObject {

    @SerializedName("TotalContacts")
    @Expose
    private int count;

    @SerializedName("data")
    @Expose
    private List<ContactDetails> contactList;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("status")
    @Expose
    private int status;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ContactDetails> getContactList() {
        return contactList;
    }

    public void setContactList(List<ContactDetails> contactList) {
        this.contactList = contactList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
