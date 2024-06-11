package com.example.eldaroperacionestarjetas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;

public class TarjetaNara extends Tarjeta {

    public TarjetaNara(int idTarjeta,String marca, long numeroTarjeta,Persona persona, LocalDate fechaVencimiento) {
        super(idTarjeta,marca, numeroTarjeta,persona, fechaVencimiento);
        //TODO Auto-generated constructor stub
    }

    @Override
    public HashMap<String,BigDecimal> tasa() throws Exception {
      int year = fechaVencimiento.getYear();
      int month = fechaVencimiento.getMonthValue();
      int dayOfMonth  = fechaVencimiento.getDayOfMonth();
      if (dayOfMonth <=0 || month<= 0 || year <= 0 ){
        throw new Exception("No se puede calcular la tasa");
       }
       return new HashMap<String, BigDecimal>() {{
        put(marca,BigDecimal.valueOf(dayOfMonth).multiply(BigDecimal.valueOf(0.5)));
    }};

    }
    
}