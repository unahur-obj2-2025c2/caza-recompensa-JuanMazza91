package Profugos;

import Zonas.Zona;

public class Profugo implements Entrenables {

    Integer inocencia;
    Integer habilidad;
    Boolean esNervioso;

    

    public Profugo(Integer inocencia, Integer habilidad,Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }


    public Integer getInocencia() {
        return inocencia;
    }


    public Integer getHabilidad() {
       return habilidad;
    }

   
    public Boolean esNervioso() {
       return esNervioso;
    }

    
    public void volverseNervioso() {
        esNervioso = Boolean.TRUE;
    }

   
    public void dejarDeEstarNervioso() {
        esNervioso = Boolean.FALSE;
    }

    
    public void reducirHabilidad() {
        if(habilidad - 5 < 0){
            habilidad = 0;
        }else {
            habilidad -=5;
        }
          
    }


    public void disminuirInocencia() {
        if (inocencia - 2 < 0)
        {
            inocencia = 0;
        }else{
            inocencia -= 2;
        }
    }

   
    public void meCazaron(Zona zona) {
        if (zona.profugosEnZona.contains(this)){
        zona.profugosEnZona.remove(this);
        }
    }


    @Override
    public Integer inocencia() {
          return inocencia;
    }


    @Override
    public Integer habilidad() {
        return habilidad;
    }







}
