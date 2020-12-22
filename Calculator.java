package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ilkSayi;
    EditText ikinciSayi;
    TextView sonucEkrani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ilkSayi = findViewById(R.id.editTextTextFirstNumber);
        ikinciSayi = findViewById(R.id.editTextTextSecondNumber);
        sonucEkrani = findViewById(R.id.textViewSonuc);
    }
    public void topla (View view){
        int ilkSayiDegeri = Integer.parseInt(ilkSayi.getText().toString());
        int ikinciSayiDegeri = Integer.parseInt(ikinciSayi.getText().toString());
        int sonuc = ilkSayiDegeri + ikinciSayiDegeri;

        sonucEkrani.setText("Sonuç: " + sonuc);
    }
    public void cikar (View view) {
        int ilkSayiDegeri = Integer.parseInt(ilkSayi.getText().toString());
        int ikinciSayiDegeri = Integer.parseInt(ikinciSayi.getText().toString());
        int sonuc = ilkSayiDegeri - ikinciSayiDegeri;

        sonucEkrani.setText("Sonuç: " + sonuc);
    }
    public void carp (View view) {
        int ilkSayiDegeri = Integer.parseInt(ilkSayi.getText().toString());
        int ikinciSayiDegeri = Integer.parseInt(ikinciSayi.getText().toString());
        int sonuc = ilkSayiDegeri * ikinciSayiDegeri;

        sonucEkrani.setText("Sonuç: " + sonuc);
    }
    public void bol (View view) {
        int ilkSayiDegeri = Integer.parseInt(ilkSayi.getText().toString());
        int ikinciSayiDegeri = Integer.parseInt(ikinciSayi.getText().toString());
        int sonuc = ilkSayiDegeri / ikinciSayiDegeri;

        sonucEkrani.setText("Sonuç: " + sonuc);
    }
}