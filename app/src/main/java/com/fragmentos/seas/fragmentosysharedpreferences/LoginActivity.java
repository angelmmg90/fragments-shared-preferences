package com.fragmentos.seas.fragmentosysharedpreferences;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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


        /*Fin*/
    }
}
