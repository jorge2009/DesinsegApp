package com.example.desinseg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.desinseg3.ModeloUsuario.ModeloUsuario;
import com.example.desinseg3.interfaceUsuario.InterfaceUsuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {
  private boolean valido=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ingresar=(Button) findViewById(R.id.btnIngresar);

        EditText txtUsuario=(EditText) findViewById(R.id.txtUsuario);
        EditText txtClave=(EditText) findViewById(R.id.txtClave);

         ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valido=buscoUsuario(txtUsuario.getText().toString(),txtClave.getText().toString());
                if(valido){
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "Usuario existe "+valido, Toast.LENGTH_SHORT);
                    toast1.show();

                }

            }
        });



    }

    private boolean buscoUsuario(String usuario,String clave){

                Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.desinseg.com/WebServiceDesinseg/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        InterfaceUsuario userInterface=retrofit.create(InterfaceUsuario.class);

        Call<List<ModeloUsuario>> call = userInterface.BuscoUsuario(usuario,clave);

         call.enqueue(new Callback<List<ModeloUsuario>>() {
             @Override
             public void onResponse(Call<List<ModeloUsuario>> call, Response<List<ModeloUsuario>> response) {
            int total=0;
                        total=response.body().size();
                  if(total>0){
                      valido=true;

                  }else{
                      valido=false;

                  }



             }

             @Override
             public void onFailure(Call<List<ModeloUsuario>> call, Throwable t) {

             }
         });


    return valido;
    }

}