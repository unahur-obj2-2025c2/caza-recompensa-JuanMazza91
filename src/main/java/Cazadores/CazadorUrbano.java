package Cazadores;

import java.util.List;

import Profugos.Profugo;

public class CazadorUrbano extends Cazador{



    public CazadorUrbano(Integer experiencia, List<Profugo> profugosAtrapados) {
        super(experiencia, profugosAtrapados);
    }

    @Override
    public Boolean doPuedeCazar(Profugo profugo) {
       return profugo.esNervioso() == Boolean.FALSE ;
    }

    @Override
    protected void doIntimidarProfugo(Profugo profugo) {
        profugo.dejarDeEstarNervioso();
    }

}
