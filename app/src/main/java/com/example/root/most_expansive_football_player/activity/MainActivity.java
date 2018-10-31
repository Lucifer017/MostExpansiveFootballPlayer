package com.example.root.most_expansive_football_player.activity;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.root.most_expansive_football_player.R;
import com.example.root.most_expansive_football_player.adapter.PlayerAdapter;
import com.example.root.most_expansive_football_player.model.Player;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.id_player)
    RecyclerView idPlayer;

    private PlayerAdapter plAdapter;

    List<Player> listPlayer = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        playerData();
        recyclerView();
    }

    private void recyclerView() {
        idPlayer.setHasFixedSize(true);
        idPlayer.setLayoutManager(new LinearLayoutManager(this));
        plAdapter = new PlayerAdapter(this, listPlayer);
        idPlayer.setAdapter(plAdapter);
    }

    private void playerData() {
        listPlayer.add(new Player("Neymar", "€222 jt", "Brazil", "Mogi das Cruzes, 5 February 1992", "https://upload.wikimedia.org/wikipedia/commons/6/65/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg"));
        listPlayer.add(new Player("Kylian Mbappé", "€135 jt", "Perancis", "Paris, 20 December 1998", "https://upload.wikimedia.org/wikipedia/commons/a/a3/Kylian_Mbapp%C3%A9_France.jpg"));
        listPlayer.add(new Player("Philippe Coutinho", "€120 jt", "Brazil", "Rio de Janeiro, 12 June 1992", "https://upload.wikimedia.org/wikipedia/commons/6/66/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Philippe_Coutinho_850_1692.jpg"));
        listPlayer.add(new Player("Ousmane Dembélé", "€105 jt", "Perancis", "Vernon, 15 May 1997", "https://upload.wikimedia.org/wikipedia/commons/7/77/Ousmane_Demb%C3%A9l%C3%A9_2018.jpg"));
        listPlayer.add(new Player("Paul Pogba", "€105 jt", "Perancis", "Lagny-sur-Marne, 15 March 1993", "https://upload.wikimedia.org/wikipedia/commons/f/fc/FRA-ARG_%2811%29_-_Paul_Pogba_%28cropped%29.jpg"));
        listPlayer.add(new Player("Cristiano Ronaldo", "€100 jt", "Portugal", "Madeira, 15 February 1985", "https://upload.wikimedia.org/wikipedia/commons/8/8c/Cristiano_Ronaldo_2018.jpg"));
        listPlayer.add(new Player("Gareth Bale", "€100 jt", "Wales", "Cardiff, 16 July 1989", "https://upload.wikimedia.org/wikipedia/commons/4/42/Gareth_Bale_RM.jpg"));
        listPlayer.add(new Player("Gonzalo Higuaín", "€90 jt", "Argentina", "Brest, 10 December 1987", "https://upload.wikimedia.org/wikipedia/commons/f/fe/Higua%C3%ADn_20180626.jpg"));
        listPlayer.add(new Player("Romelu Lukaku", "€85 jt", "Belgia", "Antwerp, 13 May 1993", "https://upload.wikimedia.org/wikipedia/commons/d/db/Bel-Tun_%287%29.jpg"));
        listPlayer.add(new Player("Virgil van Dijk", "€84.5 jt", "Belanda", "Breda, 8 July 1991", "https://upload.wikimedia.org/wikipedia/commons/f/f6/20160604_AUT_NED_8876_2.jpg"));

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
            case R.id.nav_profile:
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
                break;
            case R.id.nav_bahasa:
                Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);
                break;
        }
        return true;
    }
}
