package com.TCoding.zelmesajlarprojesi.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.TCoding.zelmesajlarprojesi.R;

import java.util.List;

public class Bayram_mesaj_adapter  extends  RecyclerView.Adapter<Bayram_mesaj_adapter.ViewHolderBayramMesaji> {
    private Context myContexy;
    private List<String> mesajlar;

    public Bayram_mesaj_adapter(Context myContexy, List<String> mesajlar) {
        this.myContexy = myContexy;
        this.mesajlar = mesajlar;
    }

    public class ViewHolderBayramMesaji extends RecyclerView.ViewHolder {
        public CardView cardViewSatir;
        public TextView kandil_mesaji_satir;
        public Button share;
        RelativeLayout container;

        public ViewHolderBayramMesaji(@NonNull View view){
            super(view);
            share = view.findViewById(R.id.share);
            cardViewSatir = view.findViewById(R.id.cardViewSatir);
            kandil_mesaji_satir = view.findViewById(R.id.kandil_mesaji_satir);
            container = view.findViewById(R.id.container);

        }


    }

    @NonNull
    @Override
    public ViewHolderBayramMesaji onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new ViewHolderBayramMesaji(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderBayramMesaji holder, final int position) {
        String mesaj = mesajlar.get(position);

        holder.kandil_mesaji_satir.setText(mesaj);
        holder.container.setAnimation(AnimationUtils.loadAnimation(myContexy,R.anim.animation_cuma_mesajlari));
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(Intent.ACTION_SEND);
                newIntent.putExtra(Intent.EXTRA_TEXT,mesajlar.get(position));
                newIntent.setType("text/plain");
                myContexy.startActivity(newIntent);

            }
        });


        holder.cardViewSatir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mesajlar.size();
    }





}
