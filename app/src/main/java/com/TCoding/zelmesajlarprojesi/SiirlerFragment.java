package com.TCoding.zelmesajlarprojesi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.TCoding.zelmesajlarprojesi.Adapters.Bayram_mesaj_adapter;
import com.TCoding.zelmesajlarprojesi.Adapters.CumeMesajlariAdapter;
import com.TCoding.zelmesajlarprojesi.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import java.util.ArrayList;

public class SiirlerFragment extends Fragment {
    private AdView mAdView;
    private RecyclerView rv;
    private Bayram_mesaj_adapter adapter;
    private ArrayList<String> mesaj ;
    public SiirlerFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_beraat,container,false);
        rv = v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new Bayram_mesaj_adapter(getContext(),mesaj);
        rv.setAdapter(adapter);
        mAdView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mesaj = new ArrayList<>();
       mesaj.add("“Biz ince bel, ela göz, sütun bacak için sevmedik güzelim\n" +
               "Gümbür gümbür bir yürek diledik kavgamızda\n" +
               "Ateşin yanında barut, barutun yanında ateş olasın diye!.. .\n" +
               "Rakı sofralarında söylenip, acı tütün çiğnercesine sevdik\n" +
               "ANLAYAMADILAR…”");

    }
}
