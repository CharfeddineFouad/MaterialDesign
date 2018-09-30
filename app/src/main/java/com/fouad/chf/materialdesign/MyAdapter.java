package com.fouad.chf.materialdesign;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.security.Policy;
import java.util.List;
import java.util.Locale;

import static java.security.AccessController.getContext;

/**
 * Created by FOUAD on 19/07/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{


    List<RecyclerItem> listitem ;
    Context mContext ;

    public MyAdapter(List<RecyclerItem>listitem, Context mContext) {
        this.listitem = listitem;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_publication,parent,false);
        //return new ViewHolder(v);

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_categorie, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {



        final RecyclerItem item = listitem.get(position);
        holder.nom.setText(item.getNom());
        holder.img.setImageResource(item.getImg());




    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        public  TextView nom ;
        public ImageView img ;

        public CardView cardView ;



        public ViewHolder(View itemView) {
            super(itemView);

            nom = (TextView) itemView.findViewById(R.id.tv_name_type);
            img= (ImageView) itemView.findViewById(R.id.iv_type);
            cardView=(CardView) itemView.findViewById(R.id.cardview_drink);




        }


    }



}
