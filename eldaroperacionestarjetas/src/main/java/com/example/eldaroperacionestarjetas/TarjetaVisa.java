package com.example.eldaroperacionestarjetas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.HashMap;

public class TarjetaVisa extends Tarjeta{

    public TarjetaVisa(int tarjeta,String marca, long numeroTarjeta,Persona persona, LocalDate fechaVencimiento) {
        super(tarjeta,marca, numeroTarjeta,persona, fechaVencimiento);
        //TODO Auto-generated constructor stub
    }

    @Override
    public HashMap<String, BigDecimal> tasa() throws Exception {
        int year = fechaVencimiento.getYear();
        int month = fechaVencimiento.getMonthValue();
        int dayOfMonth  = fechaVencimiento.getDayOfMonth();
      if (dayOfMonth <=0 || month<= 0 || year <= 0 ){
        throw new Exception("No se puede calcular la tasa");
       }
        return new HashMap<String, BigDecimal>() {{
            put(marca, BigDecimal.valueOf(year).divide(BigDecimal.valueOf(month), 2, RoundingMode.HALF_UP));
        }};
    }
    

}