package com.example.myapplication123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Snackbar snb = Snackbar.make(findViewById(R.id.myview),"done " ,Snackbar.LENGTH_LONG);
                snb.show();
                */
               Snackbar snb=Snackbar.make(findViewById(R.id.myview),"Action Snackbar", Snackbar.LENGTH_INDEFINITE).setAction("retry", new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(getApplicationContext(), "snackbar tost", Toast.LENGTH_LONG).show();
                   }
               });
            }
        });

    }
}
