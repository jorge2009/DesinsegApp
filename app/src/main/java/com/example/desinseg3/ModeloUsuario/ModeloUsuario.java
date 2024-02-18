package com.example.desinseg3.ModeloUsuario;

public class ModeloUsuario {
    private int cod_usuario;
    private String usuario;
    private String clave;
    private int cod_perfil;
    private String nombre;
    private String apellido;

    private String correo;

    private String key;


    public ModeloUsuario(int cod_usuario, String usuario, String clave, int cod_perfil, String nombre, String apellido, String correo, String key, int cod_empresa, int cod_estado) {
        this.cod_usuario = cod_usuario;
        this.usuario = usuario;
        this.clave = clave;
        this.cod_perfil = cod_perfil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.key = key;

    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCod_perfil() {
        return cod_perfil;
    }

    public void setCod_perfil(int cod_perfil) {
        this.cod_perfil = cod_perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
