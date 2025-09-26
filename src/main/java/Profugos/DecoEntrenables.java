package Profugos;

public abstract class DecoEntrenables implements Entrenables {
    protected Entrenables entrenado;

    public DecoEntrenables(Entrenables entrenado) {
        this.entrenado = entrenado;
    }

    @Override
    public  Boolean esNervioso(){
        return this.doEsNervioso();
    }

    protected abstract Boolean doEsNervioso();

    @Override
    public  Integer habilidad(){
        return entrenado.habilidad() + this.doHabilidad();
    }
    

    protected abstract Integer doHabilidad();

    @Override
    public Integer inocencia(){
        return  this.doInocencia();
    }

    protected abstract Integer doInocencia();
    
}
