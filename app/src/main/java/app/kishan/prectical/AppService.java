package app.kishan.prectical;

import app.kishan.prectical.Models.ContactRequest;
import app.kishan.prectical.Models.ContactResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 7/3/2017.
 */
public interface AppService {

    @POST("getcontacts")
    Call<ContactResponse> webServiceCall(@Body ContactRequest foContactRequest);

}
