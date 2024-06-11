package com.example.eldaroperacionestarjetas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;

public abstract class Tarjeta {
    protected int idTarjeta;
    protected String marca;
    protected long numeroTarjeta;
    protected String cardholder;
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaVencimiento;
    protected Persona persona;

    public Tarjeta(int idTarjeta ,String marca,long numeroTarjeta,Persona persona,LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
        this.persona = persona;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public String getCardholder() {
        return this.persona.nombre.concat(" ").concat(this.persona.apellido);
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
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public abstract HashMap<String,BigDecimal> tasa() throws Exception;
    public String getInfo(){
        return "DATOS TARJETA : MARCA " + this.marca + " NUMERO DE TARJETA " + this.numeroTarjeta + " CARDHOLDER " + this.getCardholder() + " FECHA VENCIMIENTO " + this.fechaVencimiento ;    
    };

    public Boolean validaParaOperar(){
       LocalDate localDate = LocalDate.now();
       if (fechaVencimiento.isAfter(localDate)){
        return true;
       }
       else{
        return false;
       }
    };

    public Boolean esDistintaA(Tarjeta tarjeta){
        if(tarjeta.numeroTarjeta == this.numeroTarjeta){
            return false;
        }
        else{
            return true;
        }
    }
}