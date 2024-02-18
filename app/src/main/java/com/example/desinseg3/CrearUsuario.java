package com.example.desinseg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.desinseg3.ModeloUsuario.ModeloUsuario;
import com.example.desinseg3.interfaceUsuario.InterfaceUsuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CrearUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);
        EditText txtNomUser=(EditText) findViewById(R.id.txtNomUser);
        EditText txtApeUser=(EditText) findViewById(R.id.txtApeUser);
        EditText txtUsuUser=(EditText) findViewById(R.id.txtUsuarioUser);
        EditText txtClaUser=(EditText) findViewById(R.id.txtClaveUser);
        EditText txtCorUser=(EditText) findViewById(R.id.txtCorreoUser);
        Button btnGuardarUser=(Button) findViewById(R.id.btnGuardarUser);

        btnGuardarUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Retrofit retrofit=new Retrofit.Builder()
                        .baseUrl("https://www.desinseg.com/WebServiceDesinseg/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();


                InterfaceUsuario userInterface=retrofit.create(InterfaceUsuario.class);

                Call<List<ModeloUsuario>> call = userInterface.GuardoUser(txtNomUser.getText().toString(),txtApeUser.getText().toString(),
                        txtUsuUser.getText().toString(),txtClaUser.getText().toString(),txtCorUser.getText().toString(),
                        1,"jorge2009");
               call.enqueue(new Callback<List<ModeloUsuario>>() {
                   @Override
                   public void onResponse(Call<List<ModeloUsuario>> call, Response<List<ModeloUsuario>> response) {
                       int total=0;
                       response.body().size();

                       Toast toast1 =
                               Toast.makeText(getApplicationContext(),
                                       "Registro de usuario "+total, Toast.LENGTH_SHORT);
                       toast1.show();

                   }

                   @Override
                   public void onFailure(Call<List<ModeloUsuario>> call, Throwable t) {
                       Toast toast1 =
                               Toast.makeText(getApplicationContext(),
                                       "Error Registro "+t.getMessage(), Toast.LENGTH_SHORT);
                       toast1.show();
                   }
               }) ;

            }
        });

    }
}