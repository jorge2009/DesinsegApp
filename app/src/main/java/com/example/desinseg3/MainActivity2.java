package com.example.desinseg3;


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

        String usuario="";
        EditText userno=(EditText) findViewById(R.id.txtNom);
        EditText userap=(EditText) findViewById(R.id.txtApe);
        EditText useru=(EditText) findViewById(R.id.txtUser);
        EditText userc=(EditText) findViewById(R.id.txtCla);
        EditText userco=(EditText) findViewById(R.id.txtCorreo);
        EditText userpe=(EditText) findViewById(R.id.txtPerfil);
        usuario = getIntent().getExtras().getString("usuario");

                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "Bienvenido "+usuario, Toast.LENGTH_SHORT);
                            toast1.show();
        Button guardaBtn=(Button) findViewById(R.id.btnGuardarUsuario);
        guardaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Retrofit retrofit=new Retrofit.Builder()
                        .baseUrl("https://www.desinseg.com/WebServiceDesinseg/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

          int perfil=1;
          String key="jorge2009";
                InterfaceUsuario userInterface=retrofit.create(InterfaceUsuario.class);

                Call<ModeloUsuario> guardoUser = userInterface.GuardoUsuario(userno.getText().toString(),userap.getText().toString(),
                        useru.getText().toString(),userc.getText().toString(),userco.getText().toString(),perfil,key);

             guardoUser.enqueue(new Callback<ModeloUsuario>() {
                 @Override
                 public void onResponse(Call<ModeloUsuario> call, Response<ModeloUsuario> response) {
                     String responseBody = response.body().toString();
                     String valor="";
                    try {
                        JSONObject json = new JSONObject(responseBody);
                       valor= json.getString("estado");

                    }catch (Exception e){
                        e.getMessage();
                    }

                             //  userpe.setText(call.hashCode());
                         Toast toast1 =
                                 Toast.makeText(getApplicationContext(),
                                         "Insertado "+valor, Toast.LENGTH_SHORT);
                         toast1.show();



                 }

                 @Override
                 public void onFailure(Call<ModeloUsuario> call, Throwable t) {
                    userpe.setText(t.getMessage());

                 }
             });

            }
        });

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

              Toast.makeText(this,"ESTOY EN USUARIO",Toast.LENGTH_SHORT).show();
              LinearLayout liner =(LinearLayout) findViewById(R.id.Liner1);
              liner.setVisibility(View.VISIBLE);


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
