package Profugos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.Test;

public class EntrenablesTest {
    Entrenables pro1 = new Profugo(40,40,Boolean.TRUE);
    Entrenables pro2 = new Profugo(60,80,Boolean.FALSE);
    Entrenables pro3 = new Profugo(50,20,Boolean.TRUE);
    Entrenables profugoArtesMarciales = new ArtesMarciales(new Profugo(40, 40, Boolean.TRUE));
    Entrenables profugoProteccionLegal = new ProtecionLegal(new Profugo(80, 0,Boolean.TRUE));
    Entrenables profugoElite = new EntrenamientoElite(pro1);
    @Test
    void testEsNervioso() {
        assertFalse(profugoElite.esNervioso());
    }

    @Test
    void testHabilidad() {
        assertEquals(80, profugoArtesMarciales.habilidad());
       
    }

    @Test
    void testInocencia() {
        assertEquals(80, profugoProteccionLegal.inocencia());

    }
}
