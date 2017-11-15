package app.kishan.prectical;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 7/3/2017.
 */
public class AppGlobal extends Application {

    public static Retrofit moRetrofit;
    public static AppService moAppService;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeRetrofit();
    }

    private void initializeRetrofit() {
        moRetrofit = new Retrofit.Builder()
                .baseUrl("https://jyapi.togglewave.com/rcci.svc/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        moAppService = moRetrofit.create(AppService.class);
    }

}
