package Profugos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProfugoTest {

    Profugo prof1 = new Profugo(20,1, Boolean.TRUE);
    Profugo prof2 = new Profugo(20,40, Boolean.TRUE);

    @Test
    void testDejarDeEstarNervioso() {
        prof1.dejarDeEstarNervioso();
        assertFalse(prof1.esNervioso());
    }

    @Test
    void testDisminuirInocencia() {
        prof1.disminuirInocencia();
        assertEquals(18, prof1.inocencia());
    }

    @Test
    void testReducirHabilidad() {
        prof2.reducirHabilidad();
        assertEquals(35, prof2.habilidad());

    }
      @Test
    void testReducirHabilidad2() {
        prof1.reducirHabilidad();
        assertEquals(0, prof1.habilidad());

    }

    @Test
    void testVolverseNervioso() {
        prof1.volverseNervioso();
        assertTrue(prof1.esNervioso());

    }
}
