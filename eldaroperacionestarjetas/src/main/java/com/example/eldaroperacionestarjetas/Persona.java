package com.example.eldaroperacionestarjetas;

import java.math.BigDecimal;

public class Persona {

    public String nombre;
    public String apellido;
    public BigDecimal montoConsumido;

    public Persona(String nombre, String apellido, BigDecimal montoConsumido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.montoConsumido = montoConsumido;
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
    public BigDecimal getMontoConsumido() {
        return montoConsumido;
    }
    public void setMontoConsumido(BigDecimal montoConsumido) {
        this.montoConsumido = montoConsumido;
    }
    
    public Boolean operacionEsValida(){
        if (montoConsumido.compareTo(BigDecimal.valueOf(1000)) < 0){
        return true;
    }
    else{
        return false;
    }
    }
}
