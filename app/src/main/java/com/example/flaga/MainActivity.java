package com.example.flaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int licznik = 0;
    TextView textViewPolecenie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPolecenie = findViewById(R.id.textViewPolecenie);
    }

    public void dobry(View view) {
        Toast.makeText(this, R.string.ostrzezenie, Toast.LENGTH_SHORT).show();
    }

    public void zly(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 4){
            textViewPolecenie.setText(R.string.podsumowanie);
        }
    }
}