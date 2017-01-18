package com.example.marti.practicafinaluf1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentTlfn2 extends AppCompatActivity {

    private TextView txtTlfno;
    private String tlfno;
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_tlfn2);

        txtTlfno = (TextView)findViewById(R.id.txtTlfn);
        btnMenu = (Button)findViewById(R.id.btnMenu);

        Bundle bundle = this.getIntent().getExtras();

        btnMenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        tlfno = bundle.getString("TLFNO");
        txtTlfno.setText("Telefono introducido: " + tlfno);

    }
}
