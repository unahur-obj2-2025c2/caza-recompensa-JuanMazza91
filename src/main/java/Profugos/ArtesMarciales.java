package Profugos;

public class ArtesMarciales extends DecoEntrenables{

   

    public ArtesMarciales(Entrenables entrenado) {
        super(entrenado);
        
    }

    @Override
    protected Boolean doEsNervioso() {
       return entrenado.esNervioso();
    }

    @Override
    protected Integer doHabilidad() {
        if(entrenado.habilidad() * 2 > 100){
            return 100;
        }else{
            return entrenado.habilidad() ;}
    }

    @Override
    protected Integer doInocencia() {
        return entrenado.inocencia();
    }

}
