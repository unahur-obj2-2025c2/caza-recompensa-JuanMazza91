package Cazadores;

import java.util.List;

import Profugos.Profugo;

public class CazadorRural extends Cazador{

   

    public CazadorRural(Integer experiencia, List<Profugo> profugosAtrapados) {
        super(experiencia, profugosAtrapados);
        
    }

    @Override
    public Boolean doPuedeCazar(Profugo profugo) {
       return profugo.esNervioso() == Boolean.TRUE;
    }

    @Override
    protected void doIntimidarProfugo(Profugo profugo) {
        profugo.volverseNervioso();
    }

}
