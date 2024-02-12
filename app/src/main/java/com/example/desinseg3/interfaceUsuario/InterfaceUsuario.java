package com.example.desinseg3.interfaceUsuario;
import com.example.desinseg3.ModeloUsuario.ModeloUsuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
public interface InterfaceUsuario {
    @GET("test.php")
    Call<List<ModeloUsuario>> getUser();


    @FormUrlEncoded
    @POST("test.php")
    Call<List<ModeloUsuario>> BuscoUsuario(
            @Field("usuario") String usuario,
            @Field("clave") String clave
    );
}
