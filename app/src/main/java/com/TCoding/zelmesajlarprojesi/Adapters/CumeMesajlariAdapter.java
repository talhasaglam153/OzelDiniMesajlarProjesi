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

public class CumeMesajlariAdapter extends RecyclerView.Adapter<CumeMesajlariAdapter.CardViewHolder2> {
    private Context myContext;
    private List<String> mesajlar;

    public CumeMesajlariAdapter(Context myContext, List<String> takimlar) {
        this.myContext = myContext;
        this.mesajlar = takimlar;
    }

    public class CardViewHolder2 extends RecyclerView.ViewHolder{
        public TextView textSatir;
        public CardView cardViewSatir;
        RelativeLayout container;
        public Button share;

        public CardViewHolder2(@NonNull View itemView) {
            super(itemView);
            share = itemView.findViewById(R.id.share);
            container = itemView.findViewById(R.id.container);
            textSatir = itemView.findViewById(R.id.kandil_mesaji_satir);
            cardViewSatir = itemView.findViewById(R.id.cardViewSatir);
        }
    }

    @NonNull
    @Override
    public CardViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview,parent,false);

        return new CardViewHolder2(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder2 holder, final int position) {
        final String cuma_mesaji_satir = mesajlar.get(position);

        holder.container.setAnimation(AnimationUtils.loadAnimation(myContext,R.anim.animation_cuma_mesajlari));

        holder.textSatir.setText(cuma_mesaji_satir);

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(Intent.ACTION_SEND);
                newIntent.putExtra(Intent.EXTRA_TEXT,mesajlar.get(position));
                newIntent.setType("text/plain");
                myContext.startActivity(newIntent);
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
