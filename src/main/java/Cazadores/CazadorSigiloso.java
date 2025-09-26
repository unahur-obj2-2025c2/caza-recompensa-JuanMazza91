package Cazadores;

import java.util.List;

import Profugos.Profugo;

public class CazadorSigiloso extends Cazador{

    public CazadorSigiloso(Integer experiencia, List<Profugo> profugosAtrapados) {
        super(experiencia, profugosAtrapados);
    }

    @Override
    public Boolean doPuedeCazar(Profugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    protected void doIntimidarProfugo(Profugo profugo) {
       profugo.reducirHabilidad();
    }

}
