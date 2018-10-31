package com.example.root.most_expansive_football_player.activity;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.root.most_expansive_football_player.R;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.Menu;
import android.view.MenuInflater;
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
                .load("https://image.ibb.co/b8Um00/Screenshot-20181029-011301-2.png")
                .into(imageMahasiswa);
        txtNama.setText("Muhammad Irfan Firdaus");
        txtNim.setText("1157050106");
        txtTanggalLahir.setText("Tri Darmayoga, 30 Mei 1998");
        txtAlamat.setText("Jl. Manisi Kosan Al-Barokah Kamar 5, CIbiru, Bandung");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_bahasa:
                Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);
                break;
        }
        return true;
    }


}
