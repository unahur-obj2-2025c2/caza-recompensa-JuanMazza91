package Cazadores;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Reporteria {

    List<Cazador> cazadoresEnNomina;

    public Reporteria(List<Cazador> cazadoresEnNomina) {
        this.cazadoresEnNomina = cazadoresEnNomina;
    }

    public Integer profCapturados(Cazador cazador){
        return cazador.profugosAtrapados.size();
    }

    public Integer elMasHabil(Cazador cazador){
        return cazador.maxHabilidad();
    }

    public Optional<Cazador> elChacalCazador(){
        return  cazadoresEnNomina.stream()
        .max(Comparator.comparingInt(c -> c.getProfugosAtrapados().size()));
    }
}
