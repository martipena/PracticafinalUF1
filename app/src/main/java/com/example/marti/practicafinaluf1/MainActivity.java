package com.example.marti.practicafinaluf1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIntent;
    Button btnShared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntent= (Button) findViewById(R.id.btnIntent);

            btnIntent.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(),IntentTlfn.class);
                    startActivity(i);
                }
            });

        btnShared= (Button) findViewById(R.id.btnShared);

        btnShared.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SharedCalc.class);
                startActivity(i);
            }
        });
    }
}
