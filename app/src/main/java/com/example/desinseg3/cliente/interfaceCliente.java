package com.example.desinseg3.cliente;

import com.example.desinseg3.producto.ModeloProducto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface interfaceCliente {

    @FormUrlEncoded
    @POST("ListaClienteDST.php")
    Call<List<ModeloCliente>> ListarCLiente(
            @Field("cod_cliente") int codCliente,
            @Field("nombre") String nombre,
            @Field("apellido") String apellido,
            @Field("apellido2") String apellido2,
            @Field("direccion") String direccion,
            @Field("telefono") String telefono,
            @Field("documento") String documento,
            @Field("correo") String correo,
            @Field("cod_estado") int codEstado,
            @Field("cod_empresa") int codEmpresa

    );
}
