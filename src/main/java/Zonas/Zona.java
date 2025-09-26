package Zonas;

import java.util.List;

import Profugos.Profugo;

public class Zona {

    String nombre;
    
    public List<Profugo> profugosEnZona;

    public Zona(String nombre, List<Profugo> profugosEnZona) {
        this.nombre = nombre;
        this.profugosEnZona = profugosEnZona;
    }

    public void agregarProfugo(Profugo profugo){
        profugosEnZona.add(profugo);
    }
}
