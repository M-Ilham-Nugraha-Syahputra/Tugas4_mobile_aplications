package com.ilham.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import com.ilham.recyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> logoklub = new ArrayList<>();
    private ArrayList<String> namaklub = new ArrayList<>();
    private ArrayList<String> tahun = new ArrayList<>();
    private ArrayList<String> julukanklub = new ArrayList<>();
    private ArrayList<String> daerahklub = new ArrayList<>();
    private ArrayList<String> deskripsiklub = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet(); //Menjalankan method
    }
    //Method untuk memproses RecyclerView
    protected  void prosesRecyclerViewAdapter(){

        RecyclerView recyclerView = findViewById(R.id.rcvKlub); //Deklarasi object yang akan digunakan
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(logoklub, namaklub, tahun, julukanklub, daerahklub, deskripsiklub, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        //Manchester United Football Club
        namaklub.add("Manchester United Football Club");
        tahun.add("1878");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/7/7a/Manchester_United_FC_crest.svg/330px-Manchester_United_FC_crest.svg.png");
        julukanklub.add("The Red Devils");
        daerahklub.add("Old Trafford, Manchester Raya");
        deskripsiklub.add("Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.");

        //Arsenal
        namaklub.add("Arsenal Football Club");
        tahun.add("1886");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/5/53/Arsenal_FC.svg/255px-Arsenal_FC.svg.png");
        julukanklub.add("The Gunners");
        daerahklub.add(" Holloway, London");
        deskripsiklub.add("Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square. Klub ini bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris (10 pada era Divisi Pertama dan 3 pada era Premier League) dan 14 gelar di Piala FA (Gelar paling banyak). ");

        //Liverpool
        namaklub.add("Liverpool Football Club");
        tahun.add("3 Juni 1892");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/0/0c/Liverpool_FC.svg/1200px-Liverpool_FC.svg.png");
        julukanklub.add("The Reds");
        daerahklub.add(" Kota Liverpool");
        deskripsiklub.add("Liverpool (The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool juga merupakan juara Liga Utama Inggris musim 2019–2020.");

        //Manchester City
        namaklub.add("Manchester City Football Club");
        tahun.add("1880");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/e/eb/Manchester_City_FC_badge.svg/1200px-Manchester_City_FC_badge.svg.png");
        julukanklub.add("Citizens, Sky Blues, City");
        daerahklub.add("Old Trafford, Manchester Raya");
        deskripsiklub.add("Manchester City Football Club (dikenal pula sebagai Man City atau The Citizens) adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.");

        //West Ham
        namaklub.add("West Ham United Football Club");
        tahun.add("29 Juni 1895");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/c/c2/West_Ham_United_FC_logo.svg/1200px-West_Ham_United_FC_logo.svg.png");
        julukanklub.add("The Irons (besi)\n" +
                "The Hammers (palu)\n" +
                "The Academy of Football");
        daerahklub.add("London");
        deskripsiklub.add("United Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di London. Sejak 2016, klub ini memainkan pertandingan kandangnya di London Stadium yang berkapasitas 80.000 kursi. Sebelumnya Hammers bermain di Boleyn Ground. Seragam mereka berwarna merah-biru.");

        //Tottenham
        namaklub.add("Tottenham Hotspur Football Club");
        tahun.add("5 September 1882");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/b/b4/Tottenham_Hotspur.svg/165px-Tottenham_Hotspur.svg.png");
        julukanklub.add("The Lilywhites");
        daerahklub.add("London");
        deskripsiklub.add("Tottenham Hotspur Football Club adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London. Mereka juga dikenal sebagai Spurs, The Spurs dan Tottenham, sementara penggemar mereka memberi mereka nama the Lilywhites karena seragam tradisional mereka yang berwarna putih.");

        //Chelsea
        namaklub.add("Chelsea Football Club");
        tahun.add("10 Maret 1905");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/c/cc/Chelsea_FC.svg/1200px-Chelsea_FC.svg.png");
        julukanklub.add("Si Biru (The Blues)");
        daerahklub.add("Fulham, London");
        deskripsiklub.add("Chelsea Football Club adalah sebuah klub sepak bola yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.\n" +
                "\n" +
                "Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1960-an, 1970-an, 1990-an, dan 2000-an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, dua Liga Champions UEFA, dan dua Piala Super UEFA.");

        //Aston Villa
        namaklub.add("Aston Villa Football Club");
        tahun.add("21 November 1874");
        logoklub.add("https://upload.wikimedia.org/wikipedia/id/thumb/f/f9/Aston_Villa_FC_crest_%282016%29.svg/1200px-Aston_Villa_FC_crest_%282016%29.svg.png");
        julukanklub.add("Villans, The Villa, The Lions, The Claret & Blue Army");
        daerahklub.add("Villa Park, Birmingham, Inggris");
        deskripsiklub.add("Aston Villa Football Club juga dikenal sebagai Villa, The Villa, The Villans dan The Lions adalah klub sepak bola profesional yang bermarkas di Villa Park, Birmingham, Inggris. Klub ini bermain di Liga Utama Inggris dan merupakan salah satu klub pendiri Liga Sepak Bola (Football League) pada tahun 1888 serta Liga Utama Inggris pada tahun 1992. Aston Villa merupakan salah satu klub tertua dan tersukses Inggris.");


        prosesRecyclerViewAdapter();
    }
}