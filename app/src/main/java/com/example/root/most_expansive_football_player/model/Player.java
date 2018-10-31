package com.example.root.most_expansive_football_player.model;

import java.io.Serializable;

public class Player implements Serializable{

    String nama, hargapemain, kebangsaan, tanggalLahir, image;

    public Player(String nama, String hargapemain, String kebangsaan, String tanggalLahir, String image) {
        this.nama = nama;
        this.hargapemain = hargapemain;
        this.kebangsaan = kebangsaan;
        this.tanggalLahir = tanggalLahir;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public String getHargapemain() {
        return hargapemain;
    }

    public String getKebangsaan() {
        return kebangsaan;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getImage() {
        return image;
    }

}
