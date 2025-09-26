package Cazadores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;


import org.junit.jupiter.api.Test;

import Profugos.Profugo;
import Zonas.Zona;

public class CazadorTest {
    CazadorRural cazaR = new CazadorRural(10, new ArrayList<>(Arrays.asList()));
    CazadorSigiloso cazaS = new CazadorSigiloso(12, new ArrayList<>(Arrays.asList()));
    CazadorUrbano cazaU = new CazadorUrbano(80, new ArrayList<>(Arrays.asList()));
    Profugo pro1 = new Profugo(40,40,Boolean.FALSE);
    Profugo pro2 = new Profugo(60,80,Boolean.FALSE);
    Profugo pro3 = new Profugo(50,20,Boolean.TRUE);
    Zona zonaUrbana = new Zona("Urbana",new ArrayList<>(Arrays.asList(pro1, pro2, pro3)));
    

    @Test
    void testPuedeCazar(){
        assertTrue(cazaU.puedeCazar(pro1));
        
    }

    @Test
    void testIntimidarProfugo() {
        cazaU.intimidarProfugo(pro1);
        assertEquals(38, pro1.getInocencia());
    }

    @Test
    void testDoPuedeCazar() {
        assertTrue(cazaU.doPuedeCazar(pro1));
    }

    @Test
    void testMinimoHabilidad() {
        cazaU.realizarCazaEnZona(zonaUrbana);
        assertEquals(40, cazaU.minimoHabilidad());

    }

   

    @Test
    void testRealizarCazaEnZona() {
        cazaU.realizarCazaEnZona(zonaUrbana);
        assertEquals(2, cazaU.profugosAtrapados.size());
        assertEquals(166, cazaU.getExperiencia());
        assertEquals(40, pro1.getInocencia());
        assertFalse(pro3.esNervioso());
    }
}
