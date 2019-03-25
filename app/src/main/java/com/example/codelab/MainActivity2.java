package com.example.codelab;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boton= findViewById(R.id.gitboton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity2.this, MainActivity.class));

            }
        });
    }

    public void goGit(View view){
        Intent goToGit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/VeronicaaLara"));
        startActivity(goToGit);
    }
}