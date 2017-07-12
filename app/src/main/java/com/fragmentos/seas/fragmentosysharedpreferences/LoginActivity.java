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
                String valorUsuario = edtUser.getText().toString();
                String valorPass = edtPass.getText().toString();

                //Almacenamos los valores de login del usuario para posteriormente entrar directamente en la aplicación y no solicitar
                //nuevamente los datos de acceso
                saveSharedPreferences(valorUsuario, valorPass);
                nextScreen();

                /*Find*/

            }
        });
        /*Fin*/
    }

    private void nextScreen(){
        /*Intent navegarEntrePantallas = new Intent(getBaseContext(), "??");
          startActivity(navegarEntrePantallas);*/
    }

    private void checkUsuarioYPass(){
        SharedPreferences guardarEnXml = getSharedPreferences("DATOS_MUSICA", Context.MODE_PRIVATE);
        String usuario = guardarEnXml.getString("USUARIO", null); //Buscamos en el archivo de sharedPreferences si encuentra una clave con USUARIO, en caso negativo devolvemos null
        if(usuario!=null){//Si el usuario es != null significa que ya ha hecho login
            /*intent*/
            nextScreen();
        }
    }
    private void saveSharedPreferences(String usuario, String pass){
        SharedPreferences guardarEnXml = getSharedPreferences("DATOS_MUSICA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = guardarEnXml.edit(); //Nos permite realizar la edición sobre el sharedPreferences creado anteriormente
            editor.putString("USUARIO",usuario); //Almacenamos el usuario
            editor.putString("PASSWORD",pass); //Almacenamos la pass
        editor.commit();
    }
}
