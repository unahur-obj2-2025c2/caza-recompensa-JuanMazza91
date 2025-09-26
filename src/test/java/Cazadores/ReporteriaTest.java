package Cazadores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;

import Profugos.Profugo;

public class ReporteriaTest {
    
    Profugo pro1 = new Profugo(40,40,Boolean.FALSE);
    Profugo pro2 = new Profugo(60,80,Boolean.FALSE);
    Profugo pro3 = new Profugo(50,20,Boolean.TRUE);
    CazadorRural cazaR = new CazadorRural(10, new ArrayList<>(Arrays.asList(pro1)));
    CazadorSigiloso cazaS = new CazadorSigiloso(12, new ArrayList<>(Arrays.asList(pro1,pro2)));
    CazadorUrbano cazaU = new CazadorUrbano(80, new ArrayList<>(Arrays.asList(pro1,pro2,pro3)));
    Reporteria comisario = new Reporteria(List.of(cazaR,cazaU,cazaS));



    @Test
    void testElChacalCazador() {
        assertEquals(cazaU, comisario.elChacalCazador().get());

    }

    @Test
    void testElMasHabil() {

    }

    @Test
    void testProfCapturados() {

    }
}
