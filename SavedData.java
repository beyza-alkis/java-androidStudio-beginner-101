package com.example.verikaydetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;
    private static final String ageText = "Yaşınız: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        sharedPreferences = this.getSharedPreferences("com.example.verikaydetme" , Context.MODE_PRIVATE);
        int saveAge = sharedPreferences.getInt("ageUser" , -1);
        if (saveAge == -1) {
            textView.setText(ageText);
        }
        else{
            textView.setText(ageText + saveAge);
        }
    }
    public void kaydet (View view){
        String userAge = editText.getText().toString();
        if (!userAge.matches("")){
            int age = Integer.parseInt(userAge);
            textView.setText(ageText + age);
            sharedPreferences.edit().putInt("ageUser", age).apply();
        }
        public void sil (View view) {
            int saveData = sharedPreferences.getInt("ageUser" , -1);
            if (saveData != -1){
                sharedPreferences.edit().remove("ageUser").apply();
                textView.setText(ageText);
            }
        }


    }
}