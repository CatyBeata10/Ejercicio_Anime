package anime;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnos
 */
public class Animes extends Estudio{
    private String nombreanime;
    private String horario;
    
    public Animes(String nombreanime, String horario, String nombre) {
        super(nombre);
        this.nombreanime = nombreanime;
        this.horario = horario;
    }

    public String getNombreanime() {
        return nombreanime;
    }

    public void setNombreanime(String nombreanime) {
        this.nombreanime = nombreanime;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
  
    
}
