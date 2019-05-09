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
public class Vaca {
   private int pulso;
   private double ritmoCardiaco;
   private double temperatura;
   private String salud;
   private double leche;
   private int cicloReproductivo;
   private int avanceGestacion;
   private int nro;

    public int getCicloReproductivo() {
        return cicloReproductivo;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Vaca(int pulso, double ritmoCardiaco, double temperatura, String salud, double leche, int cicloReproductivo, int avanceGestacion, int nro) {
        this.pulso = pulso;
        this.ritmoCardiaco = ritmoCardiaco;
        this.temperatura = temperatura;
        this.salud = salud;
        this.leche = leche;
        this.cicloReproductivo = cicloReproductivo;
        this.avanceGestacion = avanceGestacion;
        this.nro = nro;
    }

    public Vaca(int pulso, double ritmoCardiaco, double temperatura, String salud, double leche, int cicloReproductivo, int avanceGestacion) {
        this.pulso = pulso;
        this.ritmoCardiaco = ritmoCardiaco;
        this.temperatura = temperatura;
        this.salud = salud;
        this.leche = leche;
        this.cicloReproductivo = cicloReproductivo;
        this.avanceGestacion = avanceGestacion;
    }

    public void setCicloReproductivo(int cicloReproductivo) {
        this.cicloReproductivo = cicloReproductivo;
    }

    public int getAvanceGestacion() {
        return avanceGestacion;
    }

    public void setAvanceGestacion(int avanceGestacion) {
        this.avanceGestacion = avanceGestacion;
    }
   
    public Vaca(int pulso, double ritmoCardiaco, double temperatura, String salud, double leche) {
        this.pulso = pulso;
        this.ritmoCardiaco = ritmoCardiaco;
        this.temperatura = temperatura;
        this.salud = salud;
        this.leche = leche;
    }

    

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public double getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(double ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public double getLeche() {
        return leche;
    }

    public void setLeche(double leche) {
        this.leche = leche;
    }
   
    
    
    
}
