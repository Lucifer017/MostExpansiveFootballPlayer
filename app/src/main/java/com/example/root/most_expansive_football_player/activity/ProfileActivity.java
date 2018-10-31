package com.example.root.most_expansive_football_player.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.root.most_expansive_football_player.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.image_mahasiswa)
    ImageView imageMahasiswa;
    @BindView(R.id.txt_nama)
    TextView txtNama;
    @BindView(R.id.txt_nim)
    TextView txtNim;
    @BindView(R.id.tanggal_lahir)
    TextView txtTanggalLahir;
    @BindView(R.id.kebangsaan_pemain)
    TextView txtAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        initToolbar();
        initUI();
    }

    private void initToolbar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(getString(R.string.profil_mahasiswa));
    }

    private void initUI() {
        Glide.with(this)
                .load("https://scontent-sin6-2.cdninstagram.com/vp/09b790ebdc0e1f97be971e1537fb5662/5C744191/t51.2885-19/s150x150/44421097_373333243484836_8361092429457129472_n.jpg")
                .into(imageMahasiswa);
        txtNama.setText("Muhammad Irfan Firdaus");
        txtNim.setText("1157050106");
        txtTanggalLahir.setText("Tri Darmayoga, 30 Mei 1998");
        txtAlamat.setText("Jl. Manisi Kosan Al-Barokah Kamar 5, CIbiru, Bandung");
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
