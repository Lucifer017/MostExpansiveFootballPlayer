package com.example.root.most_expansive_football_player.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.root.most_expansive_football_player.R;
import com.example.root.most_expansive_football_player.model.Player;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailPlayerActivity extends AppCompatActivity {

    @BindView(R.id.image_player)
    ImageView imagePlayer;
    @BindView(R.id.nama_pemain)
    TextView namaPemain;
    @BindView(R.id.harga_pemain)
    TextView hargaPemain;
    @BindView(R.id.tanggal_lahir)
    TextView tanggalLahir;
    @BindView(R.id.kebangsaan_pemain)
    TextView kebangsaanPemain;

    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_player);
        ButterKnife.bind(this);

        player = (Player) getIntent().getSerializableExtra("player");

        initToolbar();
        initUI();
    }

    private void initToolbar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(getString(R.string.detail_pemain));
        getSupportActionBar().setSubtitle(player.getNama());
    }

    private void initUI() {
        Glide.with(this).load(player.getImage()).into(imagePlayer);
        namaPemain.setText(player.getNama());
        hargaPemain.setText(player.getHargapemain());
        tanggalLahir.setText(player.getTanggalLahir());
        kebangsaanPemain.setText(player.getKebangsaan());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home : {
                finish();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
