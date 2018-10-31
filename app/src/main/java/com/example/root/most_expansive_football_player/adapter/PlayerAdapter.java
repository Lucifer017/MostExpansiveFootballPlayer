package com.example.root.most_expansive_football_player.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.root.most_expansive_football_player.R;
import com.example.root.most_expansive_football_player.activity.DetailPlayerActivity;
import com.example.root.most_expansive_football_player.model.Player;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder>{

    private Context context;
    private List<Player> listPlayer;

    public PlayerAdapter(Context context, List<Player> listPlayer) {
        this.context = context;
        this.listPlayer = listPlayer;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_player, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(layoutParams);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Player player = listPlayer.get(position);
        Glide.with(context).load(player.getImage()).into(holder.imagePlayer);
        holder.namaPlayer.setText(player.getNama());
        holder.hargaPemain.setText(player.getHargapemain());
        holder.cvPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailPlayerActivity.class);
                i.putExtra("player", player);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlayer.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.image_player)
        ImageView imagePlayer;
        @BindView(R.id.nama_pemain)
        TextView namaPlayer;
        @BindView(R.id.harga_pemain)
        TextView hargaPemain;
        @BindView(R.id.cv_player)
        CardView cvPlayer;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

