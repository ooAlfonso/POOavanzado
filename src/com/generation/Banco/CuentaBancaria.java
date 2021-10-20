package com.generation.Banco;

public class CuentaBancaria {

    public String setNombre;
    public String setClave;
    public float setSaldo;
    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre() {
        return this.nombre;
    }

    public String getClave() {
        return this.clave;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clav) {
        this.clave = clave;
    }

    public void set(float saldo) {
        if( saldo < 0) {
            this.saldo = 0;
        } else {
        this.saldo = saldo;
        }
    }
    public void mostrarSaldo() {

    }

    public void mostarSaldo() {
        System.out.println(this.saldo);
    }

    /*
    void saldo(){
        System.out.println(this.saldo)

     */

}
