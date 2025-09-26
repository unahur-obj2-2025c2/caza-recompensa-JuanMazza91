package Profugos;

public class ProtecionLegal extends DecoEntrenables{

    public ProtecionLegal(Entrenables entrenado) {
        super(entrenado);
       
    }



    @Override
    protected Boolean doEsNervioso() {
       return entrenado.esNervioso();
    }

    @Override
    protected Integer doHabilidad() {
        return entrenado.habilidad();
    }

    @Override
    protected Integer doInocencia() {
         if (entrenado.inocencia() < 40){
        return 40;
      }else{
        return entrenado.inocencia();
      }
    }

}
