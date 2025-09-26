package Profugos;

public class EntrenamientoElite extends DecoEntrenables{

    public EntrenamientoElite(Entrenables entrenado) {
        super(entrenado);
       
    }

    @Override
    protected Boolean doEsNervioso() {
       return Boolean.FALSE;
    }

    @Override
    protected Integer doHabilidad() {
        return entrenado.habilidad();
    }

    @Override
    protected Integer doInocencia() {
        return entrenado.inocencia();
    }

}
