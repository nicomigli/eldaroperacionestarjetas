import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.eldaroperacionestarjetas.Persona;
import com.example.eldaroperacionestarjetas.TarjetaAmex;
import com.example.eldaroperacionestarjetas.TarjetaNara;
import com.example.eldaroperacionestarjetas.TarjetaVisa;

public class Main {
    
    public static void main(String[] args)
    {
       TarjetaAmex tarjetaAmex =  new TarjetaAmex(1,"Amex", 1111222233334444L,new Persona("Carlos","Perez",BigDecimal.valueOf(1500)),LocalDate.of(2020, 2, 8));
       TarjetaVisa tarjetaVisa = new TarjetaVisa(3,"Visa", 9999555566668888L,new Persona("Pedro","Sanchez",BigDecimal.valueOf(1700)),LocalDate.of(2024, 6, 20));
       TarjetaNara tarjetaNara = new TarjetaNara(2,"Nara",6666777744445555L,new Persona("Fabian","Gonzalez",BigDecimal.valueOf(900)),LocalDate.of(2022, 1, 10));
    
    }
}
