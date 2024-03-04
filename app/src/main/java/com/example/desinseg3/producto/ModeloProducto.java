package com.example.desinseg3.producto;

public class ModeloProducto {

        private int cod_producto;
        private String producto;
        private double valor;
        private String descripcion;
        private int cod_empresa;

        private int cod_proveedor;




        public int getCod_producto() {
                return cod_producto;
        }

        public void setCod_producto(int cod_producto) {
                this.cod_producto = cod_producto;
        }

        public String getProducto() {
                return producto;
        }

        public void setProducto(String producto) {
                this.producto = producto;
        }


        public double getValor() {
                return valor;
        }

        public void setValor(double valor) {
                this.valor = valor;
        }

        public String getDescripcion() {
                return descripcion;
        }

        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }

        public int getCod_empresa() {
                return cod_empresa;
        }

        public void setCod_empresa(int cod_empresa) {
                this.cod_empresa = cod_empresa;
        }

        public int getCod_proveedor() {
                return cod_proveedor;
        }

        public void setCod_proveedor(int cod_proveedor) {
                this.cod_proveedor = cod_proveedor;
        }
}
