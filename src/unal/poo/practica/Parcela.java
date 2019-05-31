/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mapii
 */
public class Parcela {
private HashMap<String,Vaca>listaVacas= new HashMap<String,Vaca>();
 Scanner lectura=new Scanner(System.in);
private Lote lote1;
private Vaca[] vacasLote1 =new Vaca[9];
private Vaca[] vacasLote2=new Vaca[9];
private Vaca[] vacasLote3=new Vaca[9];
private Lote lote2;
private Lote lote3;

    public Parcela(Lote lote1, Lote lote2, Lote lote3) {
       
        this.lote1 = lote1;
        this.lote2 = lote2;
        this.lote3 = lote3;
    }

 public void PonerEnLote (int lot){
     switch (lot) {
        case 1:
            
            break;
        case 2:
         
            break;
        case 3:
           
            break;
        default:
            break;
    } 
 }

 public void RegistrarVacas(Vaca vaca,String nro){
     listaVacas.put(nro,vaca);
     System.out.println("Registrada");
}
 public void MirarVaca(String nro){
     System.out.println("Identificador de vaca:");
     System.out.println(listaVacas.get(nro).getNro());
     System.out.println("Ritmo Cardiaco:");
     System.out.println(listaVacas.get(nro).getRitmoCardiaco());
     System.out.println("Pulso:");
     System.out.println(listaVacas.get(nro).getPulso());
     System.out.println("Cantidad de leche:");
     System.out.println(listaVacas.get(nro).getLeche());
     System.out.println("Avance gestacion:");
     System.out.println(listaVacas.get(nro).getAvanceGestacion());
     System.out.println("Temperatura:");
     System.out.println(listaVacas.get(nro).getTemperatura());
     System.out.println("Estado de Salud:");
     System.out.println(listaVacas.get(nro).getSalud());
     System.out.println("Ciclo Reproductivo");
     System.out.println(listaVacas.get(nro).getCicloReproductivo());
 } 
 public int CambioSalud(String nro){
     System.out.println("Ingrese el estado de salud la vaca:");
                    System.out.println("(1)Condiciones normales");
                    System.out.println("(2)Estado de gestacion");
                    System.out.println("(3)Niveles altos");
     int condicion;
     String salud=null;
     condicion=lectura.nextInt(); 
    switch (condicion) {
        case 1:
            salud="codiciones normales";
            break;
        case 2:
            salud="estado de gestacion";
            break;
        case 3:
            salud="niveles altos";
            break;
        default:
            System.out.println("No valido");
            break;
    }
     listaVacas.get(nro).setSalud(salud);
     return condicion;
 }
 public void SaludAleatoria(int aleatoria){
     for (Vaca v : listaVacas.values()) {
         String cambioAleatorio=null;
         switch (aleatoria) {
             case 1:
                 cambioAleatorio="codiciones normales";
                 System.out.println("cambio aleatorio");
                 break;
             case 2:
                 cambioAleatorio="estado de gestacion";
                 System.out.println("cambio aleatorio");
                 break;
             case 3:
                 cambioAleatorio="niveles altos";
                 System.out.println("cambio aleatorio");
                 break;
             default:
                 break;
         }
        v.setSalud(cambioAleatorio);
    }
         
     }
 

}

