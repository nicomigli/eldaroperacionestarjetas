package com.example.eldaroperacionestarjetas;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TarjetasService {

    private List<Tarjeta> tarjetas =Arrays.asList(
    new TarjetaAmex(1,"Amex", 1111222233334444L,new Persona("Carlos","Perez",BigDecimal.valueOf(1500)),LocalDate.of(2020, 2, 8)),
    new TarjetaNara(2,"Nara",6666777744445555L,new Persona("Fabian","Gonzalez",BigDecimal.valueOf(900)),LocalDate.of(2022, 1, 10)),
    new TarjetaVisa(3,"Visa", 9999555566668888L,new Persona("Pedro","Sanchez",BigDecimal.valueOf(1700)),LocalDate.of(2024, 6, 20))
    );

    public HashMap<String,BigDecimal> tasa(int idTarjeta) throws Exception {
        return tarjetas.get(idTarjeta).tasa();
    }
    
}