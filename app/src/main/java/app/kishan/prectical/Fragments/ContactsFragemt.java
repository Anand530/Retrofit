package app.kishan.prectical.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import app.kishan.prectical.AppGlobal;
import app.kishan.prectical.MainAdapter;
import app.kishan.prectical.Models.ContactDetails;
import app.kishan.prectical.Models.ContactRequest;
import app.kishan.prectical.Models.ContactResponse;
import app.kishan.prectical.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 7/3/2017.
 */
public class ContactsFragemt extends Fragment {

    private View moView;
    private MainAdapter moMainAdapter;
    private RecyclerView moRcvMain;
    private List<ContactDetails> moContactList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        moView = view;
        init();
    }

    private void init(){

        moRcvMain = (RecyclerView) moView.findViewById(R.id.rcvMain);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        moRcvMain.setLayoutManager(mLayoutManager);

        ContactRequest loContactRequest = new ContactRequest("09512468722","TEST");
        Call<ContactResponse> loContactResponseCall = AppGlobal.moAppService.webServiceCall(loContactRequest);
        loContactResponseCall.enqueue(new Callback<ContactResponse>() {
            @Override
            public void onResponse(Call<ContactResponse> call, Response<ContactResponse> response) {
                ContactResponse loContactResponse = response.body();
                moContactList = loContactResponse.getContact().getContactList();
                moMainAdapter = new MainAdapter(getActivity(), moContactList);
                moRcvMain.setAdapter(moMainAdapter);
            }

            @Override
            public void onFailure(Call<ContactResponse> call, Throwable t) {
                Toast.makeText(getActivity(), String.valueOf(t), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
