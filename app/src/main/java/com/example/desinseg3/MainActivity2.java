package com.example.desinseg3;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String usuario="";


        usuario = getIntent().getExtras().getString("usuario");

                            Toast toast1 =
                                    Toast.makeText(getApplicationContext(),
                                            "Bienvenido "+usuario, Toast.LENGTH_SHORT);
                            toast1.show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

      switch (item.getItemId()){
          case 2131230960:

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
