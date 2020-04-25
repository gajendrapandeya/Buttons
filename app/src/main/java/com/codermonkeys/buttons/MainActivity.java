package com.codermonkeys.buttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    AppCompatButton raisedButton;
    AppCompatButton flatButton;
    FloatingActionButton fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raisedButton = findViewById(R.id.raised_btn);
        flatButton = findViewById(R.id.flat_btn);
        fabButton = findViewById(R.id.fab_id);

        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Raised Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Flat Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Float Action Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
