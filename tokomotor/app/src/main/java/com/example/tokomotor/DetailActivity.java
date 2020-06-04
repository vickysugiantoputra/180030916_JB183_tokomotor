package com.example.tokomotor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String namadet="nama detail";
    public static final String hargadet="harga detail";
    public static final String keterngandet="keterangan";
    public static final String gambardet="NULL";
    public TextView tvnamadet;
    public TextView tvhargadet;
    public TextView tvketerangandet;
    public ImageView imgambardet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );

        tvnamadet = findViewById( R.id.tv_namadet );
        tvhargadet = findViewById( R.id.tv_hargadet );
        tvketerangandet = findViewById( R.id.tv_keterangandet );
        imgambardet = findViewById( R.id.img_gambardet );

        String simpanama = getIntent().getStringExtra(namadet);
        String simpanharga = getIntent().getStringExtra(hargadet);
        String simpanketarangan = getIntent().getStringExtra(keterngandet);
        String simpangambar = getIntent().getStringExtra(gambardet);

        tvnamadet.setText(simpanama);
        tvhargadet.setText(simpanharga);
        tvketerangandet.setText(simpanketarangan);
        Glide
                .with(this)
                .load(simpangambar)
                .centerCrop()
                .into(imgambardet);
    }
}
