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
                valido=buscoUsuario(txtUsuario.toString(),txtClave.toString());
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Usuario no existe"+valido, Toast.LENGTH_SHORT);
                toast1.show();
            }
        });



    }

    private boolean buscoUsuario(String usuario,String clave){
      valido=true;
    return valido;
    }

}