package com.example.eldaroperacionestarjetas;
import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TarjetaController {

    @Autowired
    TarjetasService tarjetasService;

  @GetMapping("/tarjetas/{idTarjeta}")
    public HashMap<String,BigDecimal> tasa(@PathVariable int idTarjeta) throws Exception {
       return tarjetasService.tasa(idTarjeta);
    }


}

