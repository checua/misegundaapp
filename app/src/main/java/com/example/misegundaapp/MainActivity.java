package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textoPrincipal;
    private String frasePrincipal =  "Hola desde el frase Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        textoPrincipal = findViewById ( R.id.textoPrincipal );
        textoPrincipal.setText ( frasePrincipal );
        Log.i("Che: ", "Todo ha funcionado de maravilla");

        TextView tv = findViewById(R.id.tv_contact);

        tv.setOnClickListener( (View.OnClickListener) (dialog) -> {
            startActivity ( new Intent ( Intent.ACTION_VIEW, Uri.parse ( "tel://" + tv.getText ( ).toString ( ).trim ( ) ) ) );
        } );
    }
}