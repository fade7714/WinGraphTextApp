package com.bartoszarcab.wingraphtextapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textViewGreeting = findViewById(R.id.textViewGreeting);
        String name = getIntent().getStringExtra("USER_NAME");
        
        if (name != null && !name.isEmpty()) {
            textViewGreeting.setText("Witaj, " + name + "!");
        } else {
            textViewGreeting.setText("Witaj, Nieznajomy!");
        }

        // Przycisk Podglądu GitHub - otwiera 3 aktywność z WebView
        TextView textViewGithubLink = findViewById(R.id.textViewGithubLink);
        textViewGithubLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        // Przycisk Tutorial Video - otwiera zewnętrzną aplikację YouTube lub przeglądarkę
        TextView textViewVideoLink = findViewById(R.id.textViewVideoLink);
        textViewVideoLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoUrl = "https://www.youtube.com/watch?v=S7XpTAnSDL4";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl));
                startActivity(intent);
            }
        });

        TextView buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}