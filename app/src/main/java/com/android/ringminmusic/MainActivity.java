package com.android.ringminmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txtTitle, txtTimeSong, txtTotal;
    ImageButton btnPrev, btnPlay, btnStop, btnNext;
    SeekBar skSong;
    ArrayList <Song> arrsong;
    int position = 0;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        AddSong();
        mediaPlayer= MediaPlayer.create(MainActivity.this, arrsong.get(position).getFile());
        txtTitle.setText(arrsong.get(position).getTitle());
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void AddSong(){
        arrsong = new ArrayList<>();
        arrsong.add(new Song("Love Shot - EXO", R.raw.loveshot_exo));
        arrsong.add(new Song("KoKoBop - EXO", R.raw.kokobop_exo));
        arrsong.add(new Song("Obsession - EXO", R.raw.obsession_exo));
        arrsong.add(new Song("Idol - BTS", R.raw.idol_bts));
        arrsong.add(new Song("Spring Day - BTS", R.raw.springday));
        arrsong.add(new Song("Bùa Yêu - Bích Phương", R.raw.bua_yeu_bich_phuong));
        arrsong.add(new Song("Đi Đu Đưa Đi - Bích Phương", R.raw.di_du_dua_di));
        arrsong.add(new Song("Đưa Em Đi Khắp Thế Gian- Bích Phương", R.raw.dua_em_di_khap_the_gian));
        arrsong.add(new Song("Sao Em Nói Vậy", R.raw.sao_em_no_vay));
        arrsong.add(new Song("Shadow - Beast", R.raw.shadow));
        arrsong.add(new Song("Sober - BigBang", R.raw.sober));
        arrsong.add(new Song("Vẫn - Bích Phương", R.raw.van));
        arrsong.add(new Song("What's Your Name", R.raw.what_is_your_name));

    }
    private void Anhxa(){
        txtTimeSong = (TextView)findViewById(R.id.textviewTimeSong);
        txtTitle = (TextView)findViewById(R.id.textviewTitle);
        txtTotal = (TextView)findViewById(R.id.textviewTotal);
        btnNext = (ImageButton) findViewById(R.id.ImageButtonNext);
        btnPlay = (ImageButton)findViewById(R.id.ImageButtonPlay);
        btnPrev = (ImageButton) findViewById(R.id.ImageButtonPrev);
        btnStop = (ImageButton)findViewById(R.id.ImageButtonStop);
        skSong = (SeekBar) findViewById(R.id.seekBarSong);

    }
}
