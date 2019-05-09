/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

/**
 *
 * @author mapii
 */
import java.util.*;
public class Lote {
    private int nrlote;
    private HashMap<String,Vaca>vacas;
    private Vaca vaca;

    public Lote(int nrlote, HashMap<String, Vaca> vacas) {
        this.nrlote = nrlote;
        this.vacas = vacas;
    }

    
    
    
    public int getNrlote() {
        return nrlote;
    }

    public void setNrlote(int nrlote) {
        this.nrlote = nrlote;
    }

    public HashMap<String, Vaca> getVacas() {
        return vacas;
    }

    public void setVacas(HashMap<String, Vaca> vacas) {
        this.vacas = vacas;
    }
    
  
    

    
}
