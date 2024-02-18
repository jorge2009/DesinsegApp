package com.example.desinseg3;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.desinseg3.ModeloUsuario.ModeloUsuario;
import com.example.desinseg3.interfaceUsuario.InterfaceUsuario;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.List;

import kotlinx.coroutines.channels.Receive;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String usuario = "";
        EditText userno = (EditText) findViewById(R.id.txtNom);
        EditText userap = (EditText) findViewById(R.id.txtApe);
        EditText useru = (EditText) findViewById(R.id.txtUser);
        EditText userc = (EditText) findViewById(R.id.txtCla);
        EditText userco = (EditText) findViewById(R.id.txtCorreo);
        EditText userpe = (EditText) findViewById(R.id.txtPerfil);
        usuario = getIntent().getExtras().getString("usuario");

        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        "Bienvenido " + usuario, Toast.LENGTH_SHORT);
        toast1.show();
        Button guardaBtn = (Button) findViewById(R.id.btnGuardarUsuario);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       // Toast.makeText(this,"ESTOY EN SALIR"+item.getItemId(),Toast.LENGTH_SHORT).show();

      switch (item.getItemId()){
          case 2131230963:

              Intent intent = new Intent(getApplicationContext(), CrearUsuario.class);
              startActivity(intent);

              break;
          case 2131230961:
              Toast.makeText(this,"ESTOY EN SALIR",Toast.LENGTH_SHORT).show();

              break;
          default:
              Toast.makeText(this,"OPCION NO ENCONTRADA",Toast.LENGTH_LONG).show();

      }
        return super.onOptionsItemSelected(item);
    }
}

