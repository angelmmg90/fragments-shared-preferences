package com.fragmentos.seas.fragmentosysharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUser;
    private EditText edtPass;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*Objetivo: SharedPreferences*/

        edtUser = (EditText) findViewById(R.id.edtUser);
        edtPass = (EditText) findViewById(R.id.edtPass);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Antes de pasar a la siguiente pantalla, guardo los datos en SharedPreferences*/
                saveSharedPreferences();

                /*Intent navegarEntrePantallas = new Intent(getBaseContext(), "??");
                startActivity(navegarEntrePantallas);*/
                /*Find*/

            }
        });
        /*Fin*/
    }

    private void saveSharedPreferences(){
        SharedPreferences guardarEnXml = getSharedPreferences("DATOS_MUSICA", Context.MODE_PRIVATE);
    }
}
