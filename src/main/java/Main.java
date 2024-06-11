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
        TarjetaNara tarjetaNara = new TarjetaNara(2,"Nara",6666777744445555L,new Persona("Fabian","Gonzalez",BigDecimal.valueOf(900)),LocalDate.of(2022, 1, 10));
        TarjetaVisa tarjetaVisa = new TarjetaVisa(3,"Visa", 9999555566668888L,new Persona("Pedro","Sanchez",BigDecimal.valueOf(1700)),LocalDate.of(2024, 6, 20));
        System.out.println(tarjetaAmex.getInfo());
        System.out.println(tarjetaNara.getInfo());
        System.out.println(tarjetaVisa.getInfo());
        System.out.println("AMEX OPERACION VALIDA " + tarjetaAmex.getPersona().operacionEsValida());
        System.out.println("NARA OPERACION VALIDA " + tarjetaNara.getPersona().operacionEsValida());
        System.out.println("VISA OPERACION VALIDA " + tarjetaVisa.getPersona().operacionEsValida());
        System.out.println("AMEX TARJETA VALIDA " +  tarjetaAmex.validaParaOperar());
        System.out.println("NARA TARJETA VALIDA " + tarjetaNara.validaParaOperar());
        System.out.println("VISA TARJETA VALIDA " + tarjetaVisa.validaParaOperar());
        System.out.println(tarjetaAmex.esDistintaA(tarjetaVisa));
        System.out.println(tarjetaNara.esDistintaA(tarjetaVisa));
        System.out.println(tarjetaVisa.esDistintaA(tarjetaVisa));
        try {
            System.out.println(tarjetaAmex.tasa());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            System.out.println(tarjetaNara.tasa());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            System.out.println(tarjetaVisa.tasa());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
