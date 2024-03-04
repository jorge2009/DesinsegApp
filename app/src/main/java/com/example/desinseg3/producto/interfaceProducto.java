package com.example.desinseg3.producto;

import com.example.desinseg3.ModeloUsuario.ModeloUsuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface interfaceProducto {

    @FormUrlEncoded
    @POST("ListaProductoDST.php")
    Call<List<ModeloProducto>> ListarProducto(
            @Field("cod_producto") int codProducto,
            @Field("producto") String producto,
            @Field("valor") Double valor,
            @Field("cod_estado") int codEstado,
            @Field("cod_empresa") int codEmpresa,
            @Field("cod_proveedor") int codProveedor

    );
}
