package Cazadores;

import java.util.List;

import Profugos.Profugo;
import Zonas.Zona;

public  abstract class Cazador {

    protected Integer experiencia;

    List<Profugo> profugosAtrapados;
    

  
    public Cazador(Integer experiencia, List<Profugo> profugosAtrapados) {
        this.experiencia = experiencia;
        this.profugosAtrapados = profugosAtrapados;
    }


    public Integer getExperiencia() {
        return experiencia;
    }


    public void realizarCazaEnZona(Zona zona){
        zona.profugosEnZona.forEach(p->this.cazar(p,zona));
        this.profugosAtrapados.forEach(p->p.meCazaron(zona));
    }
    
    public Boolean puedeCazar(Profugo profugo) {
        return (profugo.getInocencia() < experiencia) && this.doPuedeCazar(profugo);
    }
    

    public void cazar(Profugo profugo, Zona zona){
        if  (this.puedeCazar(profugo)){
            profugosAtrapados.add(profugo);
            experiencia += this.minimoHabilidad() + 2 * profugosAtrapados.size();
        }
        else {
            intimidarProfugo(profugo);
        }
    }
  

    public void intimidarProfugo(Profugo profugo){
           profugo.disminuirInocencia();
           this.doIntimidarProfugo(profugo);
        
    }

    public Integer  minimoHabilidad(){
        return profugosAtrapados.stream().mapToInt(Profugo::getHabilidad).min().orElse(0);
    }


   public Integer  maxHabilidad(){
        return profugosAtrapados.stream().mapToInt(Profugo::getHabilidad).max().orElse(0);
    }
    protected abstract void doIntimidarProfugo(Profugo profugo);

    protected abstract Boolean doPuedeCazar(Profugo profugo);


    public List<Profugo> getProfugosAtrapados() {
        return profugosAtrapados;
    }
}