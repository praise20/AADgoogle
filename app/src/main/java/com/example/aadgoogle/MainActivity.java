package com.example.aadgoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void notification(View view) {
        Button button = (Button) findViewById(R.id.notify_button);
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }

    public void theme(View view) {
        Button button = (Button) findViewById(R.id.theme_button);
        Intent intent = new Intent(this, DrawableThemesStyles.class);
        startActivity(intent);
    }
}